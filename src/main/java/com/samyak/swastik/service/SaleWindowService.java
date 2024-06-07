package com.samyak.swastik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.dto.CompanyPartyInfo;
import com.samyak.swastik.dto.CurrencyInfo;
import com.samyak.swastik.dto.ExchangeRateInfo;
import com.samyak.swastik.dto.InvoiceTypeInfo;
import com.samyak.swastik.dto.LocationInfo;
import com.samyak.swastik.dto.LotCategoryInfo;
import com.samyak.swastik.dto.PurchaseSaleGroupInfo;
import com.samyak.swastik.dto.SalePersonInfo;
import com.samyak.swastik.dto.SaleWindowInfo;

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

		List<ExchangeRateInfo> exchangeRateInfos = exchangeRateService.get();
		List<Double> exchangeRate = exchangeRateInfos.stream().map(e -> e.getExhchangeRate()).toList();

		SaleWindowInfo saleWindow = new SaleWindowInfo();
		saleWindow.setCategory(lotCategory);
		saleWindow.setCompanyParty(companies);
		saleWindow.setCurrency(currency);
		saleWindow.setExchangeRate(exchangeRate);
		saleWindow.setLocation(location);
		saleWindow.setInvoiceType(invoiceType);
		saleWindow.setPurhcaseSaleGroup(saleGroup);
		saleWindow.setSalePerson(salePerson);

		return saleWindow;
	}

}
