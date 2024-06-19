package com.samyak.swastik.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.CompanyParty;
import com.samyak.swastik.domain.Ledger;
import com.samyak.swastik.domain.Location;
import com.samyak.swastik.domain.Lot;
import com.samyak.swastik.domain.LotCategory;
import com.samyak.swastik.domain.PurchaseSaleGroup;
import com.samyak.swastik.domain.Receive;
import com.samyak.swastik.domain.SalePerson;
import com.samyak.swastik.domain.Voucher;
import com.samyak.swastik.dto.CompanyPartyInfo;
import com.samyak.swastik.dto.CurrencyInfo;
import com.samyak.swastik.dto.FinancialTransactionInfo;
import com.samyak.swastik.dto.InvoiceTypeInfo;
import com.samyak.swastik.dto.LedgerListInfo;
import com.samyak.swastik.dto.LocationInfo;
import com.samyak.swastik.dto.LotCategoryInfo;
import com.samyak.swastik.dto.LotInfo;
import com.samyak.swastik.dto.LotListInfo;
import com.samyak.swastik.dto.PurchaseSaleGroupInfo;
import com.samyak.swastik.dto.ReceiveInfo;
import com.samyak.swastik.dto.ReceiveTransactionInfo;
import com.samyak.swastik.dto.SalePersonInfo;
import com.samyak.swastik.dto.SaleWindowInfo;
import com.samyak.swastik.dto.SaleWindowSaveInfo;
import com.samyak.swastik.dto.VoucherInfo;

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
	@Autowired
	private LedgerService ledgerService;

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
		if (saleWindowSaveInfo.getCurrency().equalsIgnoreCase("US$")) {
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
		receiveInfo.setRemark("-");
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

		List<LotListInfo> lotList = saleWindowSaveInfo.getLotList();
		lotList.forEach(lotDetail -> {
			ReceiveTransactionInfo receiveTransactionInfo = new ReceiveTransactionInfo();
			receiveTransactionInfo.setReceiveId(receive.getReceiveId());

			Optional<Lot> lotId = lotService.getLotId(lotDetail.getLotNo());
			if (lotId.isPresent()) {
				Lot lot = lotId.get();
				receiveTransactionInfo.setLotId(lot.getLotId());
			}
			receiveTransactionInfo.setQuantity(lotDetail.getQuantity());
			receiveTransactionInfo.setAvailableQuantity(lotDetail.getQuantity());
			receiveTransactionInfo.setLotSrNo(lotDetail.getSrNo().doubleValue());

			Double amount = lotDetail.getAmount();
			Double exchangeRate2 = saleWindowSaveInfo.getExchangeRate();
			if (saleWindowSaveInfo.getCurrency().equals("US$")) {
				receiveTransactionInfo.setReceivePrice(amount);
				receiveTransactionInfo.setLocalPrice(amount * exchangeRate2);
				receiveTransactionInfo.setDollarPrice(amount);

			} else {
				receiveTransactionInfo.setReceivePrice(amount);
				receiveTransactionInfo.setLocalPrice(amount);
				receiveTransactionInfo.setDollarPrice(amount / exchangeRate2);

			}
			receiveTransactionInfo.setStatus(0.0);
			receiveTransactionInfo.setReturnOn(null);
			receiveTransactionInfo.setReturnBy(null);
			receiveTransactionInfo.setModifiedOn(new Timestamp(currTimestampMills));
			receiveTransactionInfo.setModifiedBy(false);
			receiveTransactionInfo.setModifiedMachineName("System");
			receiveTransactionInfo.setProActive(false);
			Optional<Location> locationId = locationService.getLocationId(saleWindowSaveInfo.getLocation());
			if (locationId.isPresent()) {
				Location location = locationId.get();
				receiveTransactionInfo.setLocationId(location.getLocationId());
			}
			receiveTransactionInfo.setActive(true);
			receiveTransactionInfo.setConsignementReceiveId(null);
			receiveTransactionInfo.setMovWtdAvg(false);
			receiveTransactionInfo.setYearEndId(0.0);
			receiveTransactionInfo.setRefWhrtId(null);
			receiveTransactionInfo.setRefStatus(0.0);
			receiveTransactionInfo.setOrderTransactionId(null);
			receiveTransactionInfo.setMfgId(null);
			receiveTransactionInfo.setMfgPurchaseRtId(null);
			receiveTransactionInfo.setRateId(null);
			receiveTransactionInfo.setMfIdvalue(0.0);

			receiveTransactionService.save(receiveTransactionInfo);
		});

		VoucherInfo voucherInfo = new VoucherInfo();
		voucherInfo.setCompanyId(1);
		voucherInfo.setVoucherType(2.0);
		Integer voucherNoCount = voucherService.voucherNoCount();
		voucherInfo.setVoucherNo(voucherNoCount + 1);
		voucherInfo.setVoucherDate(new Timestamp(currTimestampMills));
		voucherInfo.setToByNos(0.0);
		voucherInfo.setVoucherCurrency(currencyId);
		voucherInfo.setExchangeRate(exchangeRate);

		if (saleWindowSaveInfo.getCurrency().equals("US$")) {
			voucherInfo.setVoucherTotal(total);
			voucherInfo.setLocalTotal(total * exchangeRate);
			voucherInfo.setDollarTotal(total);

		} else {
			voucherInfo.setVoucherTotal(total);
			voucherInfo.setLocalTotal(total);
			voucherInfo.setDollarTotal(total / exchangeRate);

		}
		voucherInfo.setDescription(saleWindowSaveInfo.getNarration());
		voucherInfo.setModifiedBy("2");
		voucherInfo.setModifiedOn(new Timestamp(currTimestampMills));
		voucherInfo.setModifiedMachineName("System");
		receiveInfo.setActive(true);
		receiveInfo.setProActive(false);
		voucherInfo.setReferenceVoucherId(0);
		voucherInfo.setCostHeadGroupId(0);
		voucherInfo.setCostHeadSubGroupID(0);
		voucherInfo.setReconcilationDate(null);
		voucherInfo.setYearEndID(1.0);
		voucherInfo.setRefNo(saleWindowSaveInfo.getRefNo());

		Voucher voucher = voucherService.save(voucherInfo);

		FinancialTransactionInfo financialTransactionInfo = new FinancialTransactionInfo();
		financialTransactionInfo.setCompanyId(1);
		financialTransactionInfo.setVoucherId(voucher.getVoucherId());
		financialTransactionInfo.setSrNo(0.0);
		financialTransactionInfo.setDescription("");
		financialTransactionInfo.setModifiedBy("2");
		financialTransactionInfo.setModifiedOn(new Timestamp(currTimestampMills));
		financialTransactionInfo.setModifiedMachineName("System");
		financialTransactionInfo.setActive(true);
		Optional<Ledger> cTaxId = ledgerService.getLedgerId(saleWindowSaveInfo.getcTax());
		if (cTaxId.isPresent()) {
			Ledger cTax = cTaxId.get();
			financialTransactionInfo.setLedgerId(cTax.getLedgerId());
		}
		financialTransactionInfo.setPaymentMode(false);
		financialTransactionInfo.setCheckNo("0");
		financialTransactionInfo.setCheckDate(null);
		financialTransactionInfo.setBankName("null");
		financialTransactionInfo.setAccountId(null);
		financialTransactionInfo.setExcahngeRate(saleWindowSaveInfo.getExchangeRate());
		financialTransactionInfo.setTransactionDate(new Timestamp(currTimestampMills));
		financialTransactionInfo.setReceiveId(receive.getReceiveId());
		financialTransactionInfo.setReceiveFromLedgerId(null);
		financialTransactionInfo.setCostHeadGroupId(null);
		financialTransactionInfo.setCostHeadSubGroupId(null);
		financialTransactionInfo.setYearEndId(1.0);
		financialTransactionInfo.setTranscationNo(voucher.getVoucherNo());

		Optional<Ledger> ledger = ledgerService.getLedgerId(saleWindowSaveInfo.getcTax());
		if (ledger.isPresent()) {
			Ledger ledger2 = ledger.get();
			financialTransactionInfo.setForHeadID(ledger2.getForHeadId());
			financialTransactionInfo.setForHead(ledger2.getForHead());
		}
		financialTransactionInfo.setSrNo(1.0);
		financialTransactionInfo.setDescription(null);
		financialTransactionInfo.setTransactionType(false);
		if (saleWindowSaveInfo.getCurrency().equals("US$")) {
			financialTransactionInfo.setAmount(saleWindowSaveInfo.getcTaxAmount());
			financialTransactionInfo
					.setLocalAmount(saleWindowSaveInfo.getcTaxAmount() * saleWindowSaveInfo.getExchangeRate());
			financialTransactionInfo.setDollarAmount(saleWindowSaveInfo.getcTaxAmount());

		} else {
			financialTransactionInfo.setAmount(saleWindowSaveInfo.getcTaxAmount());
			financialTransactionInfo.setLocalAmount(saleWindowSaveInfo.getcTaxAmount());
			financialTransactionInfo
					.setDollarAmount(saleWindowSaveInfo.getcTaxAmount() / saleWindowSaveInfo.getExchangeRate());
		}
		financialTransactionService.save(financialTransactionInfo);

		List<LedgerListInfo> ledgerList = saleWindowSaveInfo.getLedgerList();
		AtomicInteger serialNumberCounter = new AtomicInteger(2);
		ledgerList.forEach(ledgerDetails -> {
			FinancialTransactionInfo financialTransactionInfo1 = new FinancialTransactionInfo();
			financialTransactionInfo1.setCompanyId(1);
			financialTransactionInfo1.setVoucherId(voucher.getVoucherId());
			financialTransactionInfo1.setSrNo(0.0);
			financialTransactionInfo1.setDescription("");
			financialTransactionInfo1.setModifiedBy("2");
			financialTransactionInfo1.setModifiedOn(new Timestamp(currTimestampMills));
			financialTransactionInfo1.setModifiedMachineName("System");
			financialTransactionInfo1.setActive(true);
			Optional<Ledger> cTaxId1 = ledgerService.getLedgerId(saleWindowSaveInfo.getcTax());
			if (cTaxId1.isPresent()) {
				Ledger cTax2 = cTaxId1.get();
				financialTransactionInfo1.setLedgerId(cTax2.getLedgerId());
			}
			financialTransactionInfo1.setPaymentMode(false);
			financialTransactionInfo1.setCheckNo("0");
			financialTransactionInfo1.setCheckDate(null);
			financialTransactionInfo1.setBankName("null");
			financialTransactionInfo1.setAccountId(null);
			financialTransactionInfo1.setExcahngeRate(saleWindowSaveInfo.getExchangeRate());
			financialTransactionInfo1.setTransactionDate(new Timestamp(currTimestampMills));
			financialTransactionInfo1.setReceiveId(receive.getReceiveId());
			financialTransactionInfo1.setReceiveFromLedgerId(null);
			financialTransactionInfo1.setCostHeadGroupId(null);
			financialTransactionInfo1.setCostHeadSubGroupId(null);
			financialTransactionInfo1.setYearEndId(1.0);
			financialTransactionInfo1.setTranscationNo(voucher.getVoucherNo());

			Optional<Ledger> optionalLedger = ledgerService.getLedgerId(ledgerDetails.getLedgerName());
			if (optionalLedger.isPresent()) {
				Ledger ledger2 = optionalLedger.get();
				financialTransactionInfo1.setForHeadID(ledger2.getForHeadId());
				financialTransactionInfo1.setForHead(ledger2.getForHead());

			}
			financialTransactionInfo1.setSrNo((double) serialNumberCounter.getAndIncrement());
			financialTransactionInfo1.setDescription(null);
			financialTransactionInfo1.setTransactionType(true);
			if (saleWindowSaveInfo.getCurrency().equals("US$")) {
				financialTransactionInfo1.setAmount(ledgerDetails.getLedgerAmount());
				financialTransactionInfo1
						.setLocalAmount(ledgerDetails.getLedgerAmount() * saleWindowSaveInfo.getExchangeRate());
				financialTransactionInfo1.setDollarAmount(ledgerDetails.getLedgerAmount());

			} else {
				financialTransactionInfo1.setAmount(ledgerDetails.getLedgerAmount());
				financialTransactionInfo1.setLocalAmount(ledgerDetails.getLedgerAmount());
				financialTransactionInfo1
						.setDollarAmount(ledgerDetails.getLedgerAmount() / saleWindowSaveInfo.getExchangeRate());
			}
			financialTransactionService.save(financialTransactionInfo1);

		});
	}

}
