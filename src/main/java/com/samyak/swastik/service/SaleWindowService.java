package com.samyak.swastik.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.CompanyParty;
import com.samyak.swastik.domain.LotCategory;
import com.samyak.swastik.domain.PurchaseSaleGroup;
import com.samyak.swastik.domain.Receive;
import com.samyak.swastik.domain.ReceiveTransaction;
import com.samyak.swastik.domain.SalePerson;
import com.samyak.swastik.dto.CompanyPartyInfo;
import com.samyak.swastik.dto.CurrencyInfo;
import com.samyak.swastik.dto.InvoiceTypeInfo;
import com.samyak.swastik.dto.LocationInfo;
import com.samyak.swastik.dto.LotCategoryInfo;
import com.samyak.swastik.dto.LotInfo;
import com.samyak.swastik.dto.PurchaseSaleGroupInfo;
import com.samyak.swastik.dto.ReceiveInfo;
import com.samyak.swastik.dto.SalePersonInfo;
import com.samyak.swastik.dto.SaleWindowInfo;
import com.samyak.swastik.dto.SaleWindowSaveInfo;

@Service("")
public class SaleWindowService implements ISaleWindow {

	@Autowired
	private CompanyPartyService companyPartyService;
	@Autowired
	private SalePersonService salePersonService;
	@Autowired
	private CurrencyService currencyService;
	@Autowired
	private LotCategoryService lotCategoryService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private InvoiceTypeService invoiceTypeService;
	@Autowired
	private PurchaseSaleGroupService purchaseSaleGroupService;
	@Autowired
	private ExchangeRateService exchangeRateService;
	@Autowired
	private LotService lotService;
	@Autowired
	private VoucherService voucherService;
	@Autowired
	private ReceiveService receiveService;
	@Autowired
	private ReceiveTransactionService receiveTransactionService;
	@Autowired
	private FinancialTransactionService financialTransactionService;

	@Override
	public SaleWindowInfo get() {

		List<CompanyPartyInfo> companyPartyInfos = companyPartyService.get();
		List<String> companies = companyPartyInfos.stream().map(e -> e.getCompanyPartyName()).toList();

		List<SalePersonInfo> salePersonInfos = salePersonService.get();
		List<String> salePerson = salePersonInfos.stream().map(e -> e.getSalesPersonName()).toList();

		List<CurrencyInfo> currencyInfos = currencyService.get();
		List<String> currency = currencyInfos.stream().map(e -> e.getCurrencyName()).toList();

		List<LotCategoryInfo> categoryInfos = lotCategoryService.get();
		List<String> lotCategory = categoryInfos.stream().map(e -> e.getLotCategoryName()).toList();

		List<LocationInfo> locationInfos = locationService.get();
		List<String> location = locationInfos.stream().map(e -> e.getLocationName()).toList();

		List<InvoiceTypeInfo> infos = invoiceTypeService.get();
		List<String> invoiceType = infos.stream().map(e -> e.getTypeName()).toList();

		List<PurchaseSaleGroupInfo> groupInfos = purchaseSaleGroupService.get();
		List<String> saleGroup = groupInfos.stream().map(e -> e.getPurchaseSaleGroupName()).toList();

		List<Double> exchangeRates = exchangeRateService.get();

		List<LotInfo> lotInfos = lotService.get();
		List<String> lotNos = lotInfos.stream().map(e -> e.getLotNo()).toList();

		String invoiceNo = voucherService.get();

		SaleWindowInfo saleWindow = new SaleWindowInfo();
		saleWindow.setCategory(lotCategory);
		saleWindow.setCompanyParty(companies);
		saleWindow.setCurrency(currency);
		saleWindow.setExchangeRate(exchangeRates);
		saleWindow.setLocation(location);
		saleWindow.setInvoiceType(invoiceType);
		saleWindow.setPurhcaseSaleGroup(saleGroup);
		saleWindow.setSalePerson(salePerson);
		saleWindow.setLotNumber(lotNos);
		saleWindow.setInvoiceNo(invoiceNo);

		return saleWindow;
	}

	@Override
	public void save(SaleWindowSaveInfo saleWindowSaveInfo) {
		Long currTimestampMills = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		ReceiveInfo receiveInfo = new ReceiveInfo();
		receiveInfo.setReceiveSell(false);
		receiveInfo.setReceiveNo("S2324-01");
		receiveInfo.setReceiveDate(new Timestamp(currTimestampMills));
		receiveInfo.setReceiveLots(saleWindowSaveInfo.getNumLots());
		receiveInfo.setReceiveQuantity(saleWindowSaveInfo.getTotalQuantity());

		UUID currencyId = currencyService.getCurrencyId(saleWindowSaveInfo.getCurrency());
		receiveInfo.setReceiveCurrencyId(currencyId);

		receiveInfo.setExchangeRate(saleWindowSaveInfo.getExchangeRate());
		receiveInfo.setReceiveExchangeRate(saleWindowSaveInfo.getExchangeRate());
		receiveInfo.setTax(0.0);
		receiveInfo.setDiscount(0.0);

		Double total = saleWindowSaveInfo.getTotal();
		Double subTotal = saleWindowSaveInfo.getSubTotal();
		Double exchangeRate = saleWindowSaveInfo.getExchangeRate();
		if (saleWindowSaveInfo.getCurrency().equals("US$")) {
			receiveInfo.setReceiveTotol(total);
			receiveInfo.setLocalTotal(total * exchangeRate);
			receiveInfo.setDollarTotol(total);
			receiveInfo.setInvTotal(subTotal);
			receiveInfo.setInvLocalTotal(subTotal * exchangeRate);
			receiveInfo.setInvDollarTotal(subTotal);
		} else {
			receiveInfo.setReceiveTotol(total);
			receiveInfo.setLocalTotal(total);
			receiveInfo.setDollarTotol(total / exchangeRate);
			receiveInfo.setInvTotal(subTotal);
			receiveInfo.setInvLocalTotal(subTotal);
			receiveInfo.setInvDollarTotal(subTotal / exchangeRate);
		}

		Optional<CompanyParty> companyPartyId = companyPartyService
				.getCompanyPartyId(saleWindowSaveInfo.getCompanyParty());
		if (companyPartyId.isPresent()) {
			CompanyParty companyParty = companyPartyId.get();
			receiveInfo.setReceiveFromId(companyParty.getCompanyPartyId());
		}
		receiveInfo.setReceiveFromName(saleWindowSaveInfo.getCompanyParty());
		receiveInfo.setCompanyId(1.0);
		receiveInfo.setReceiveByName("Samyak");
		receiveInfo.setReceiveInternal(false);
		receiveInfo.setPurchase(true);
		receiveInfo.setDueDays(saleWindowSaveInfo.getDueDays());

		try {

			Date dueDate = dateFormat.parse(saleWindowSaveInfo.getDueDate());
			receiveInfo.setDueDate(new Timestamp(dueDate.getTime()));

		} catch (ParseException e) {
			e.printStackTrace();
		}

		receiveInfo.setChallanNo(null);
		receiveInfo.setChallanDate(null);
		receiveInfo.setInvoiceNo(null);
		receiveInfo.setInvoiceDate(null);
		receiveInfo.setRemark(saleWindowSaveInfo.getRemark());
		receiveInfo.setOpeningStock(false);
		Optional<SalePerson> salePersonId = salePersonService.getSalePersonId(saleWindowSaveInfo.getSalePerson());
		if (salePersonId.isPresent()) {
			SalePerson salePersonId1 = salePersonId.get();
			receiveInfo.setSalePersonId(salePersonId1.getSalePersonId());
		}
		receiveInfo.setConsignmentReceivedId("0");
		receiveInfo.setModifiedBy("2");
		receiveInfo.setModifiedOn(new Timestamp(currTimestampMills));
		receiveInfo.setModifiedMachineName("System");
		receiveInfo.setActive(true);
		receiveInfo.setProActive(false);
		receiveInfo.setrReturn(false);

		try {

			Date stockDate = dateFormat.parse(saleWindowSaveInfo.getStockDate());
			receiveInfo.setStockDate(new Timestamp(stockDate.getTime()));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		Optional<LotCategory> lotCategoryId = lotCategoryService.getlotCategoryId(saleWindowSaveInfo.getCategory());
		if (lotCategoryId.isPresent()) {
			LotCategory lotCategory = lotCategoryId.get();
			receiveInfo.setReceiveCategory(lotCategory.getLotCategoryId());
		}

		receiveInfo.setDifferenceAmount(0.0);
		receiveInfo.setDifferenceLocalAmount(0.0);
		receiveInfo.setDifferenceDollarAmount(0.0);
		receiveInfo.setStockTransferType(0.0);
		receiveInfo.setCgtReturnConfirm(0.0);
		receiveInfo.setYearEndId(1.0);
		Optional<PurchaseSaleGroup> purchaseSaleGroupId = purchaseSaleGroupService
				.getPurchaseSaleGroupId(saleWindowSaveInfo.getSaleGroup());
		if (purchaseSaleGroupId.isPresent()) {
			PurchaseSaleGroup purchaseSaleGroup = purchaseSaleGroupId.get();
			receiveInfo.setPurchaseGroupId(purchaseSaleGroup.getPurchaseSaleGroupId());
		}

		receiveInfo.setCgtRefNo("");
		receiveInfo.setCgtRefDescription(saleWindowSaveInfo.getNarration());
		receiveInfo.setWorkOrderId(null);
		receiveInfo.setRefDesignGroupId(null);
		receiveInfo.setMfgPurchaseRId(null);
		receiveInfo.setOverDays(null);

		Receive receive = receiveService.save(receiveInfo);
		receive.getReceiveId();
		
		ReceiveTransaction receiveTransaction = new ReceiveTransaction();
		
	}

}
