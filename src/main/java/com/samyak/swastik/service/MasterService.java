/*=========================================================================
 * Sr.No     Modified by       Date          Status       Reason
 *=========================================================================
 *	1		Prathamesh S	 20-06-2024		 Done		API creation to get diamond master data.
 * =========================================================================
 * 
 * */
package com.samyak.swastik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.dto.BlackInclusionInfo;
import com.samyak.swastik.dto.ColorInfo;
import com.samyak.swastik.dto.CountryInfo;
import com.samyak.swastik.dto.CutEXInfo;
import com.samyak.swastik.dto.CutHSInfo;
import com.samyak.swastik.dto.CutInfo;
import com.samyak.swastik.dto.DiamondMasterInfo;
import com.samyak.swastik.dto.FluorescenceInfo;
import com.samyak.swastik.dto.GroupInfo;
import com.samyak.swastik.dto.LabInfo;
import com.samyak.swastik.dto.LusterInfo;
import com.samyak.swastik.dto.OpenInclusionInfo;
import com.samyak.swastik.dto.OriginColorInfo;
import com.samyak.swastik.dto.PolishInfo;
import com.samyak.swastik.dto.PurityInfo;
import com.samyak.swastik.dto.ShadeInfo;
import com.samyak.swastik.dto.ShapeInfo;
import com.samyak.swastik.dto.SizeInfo;
import com.samyak.swastik.dto.SupplierInfo;
import com.samyak.swastik.dto.SymmetryInfo;
import com.samyak.swastik.dto.TableIncusionInfo;
import com.samyak.swastik.dto.UnitInfo;

@Service("masterService")
public class MasterService implements IMaster {

	@Autowired
	private CutService cutService;
	@Autowired
	private ColorService colorService;
	@Autowired
	private PurityService purityService;
	@Autowired
	private FluorescenceService fluorescenceService;
	@Autowired
	private ShapeService shapeService;
	@Autowired
	private LabService labService;
	@Autowired
	private PolishService polishService;
	@Autowired
	private TableIncusionService tableIncusionService;
	@Autowired
	private SymmetryService symmetryService;
	@Autowired
	private LusterService lusterService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private ShadeService shadeService;
	@Autowired
	private OpenInclusionService openInclusionService;
	@Autowired
	private BlackInclusionService blackInclusionService;
	@Autowired
	private GroupService groupService;
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private CutHSService cutHSService;
	@Autowired
	private OriginColorService originColorService;
	@Autowired
	private CutEXService cutEXService;
//	@Autowired
//	private ILot lotService;
	@Autowired
	private SizeService sizeService;
	@Autowired
	private UnitService unitService;

	@Override
	public DiamondMasterInfo getAllDiamondMasters() {

		DiamondMasterInfo diamondMasterInfo = new DiamondMasterInfo();
		List<CutInfo> cutInfos = cutService.get();
		List<ColorInfo> colorInfos = colorService.get();
		List<PurityInfo> purityInfos = purityService.get();
		List<FluorescenceInfo> fluorescenceInfos = fluorescenceService.get();
		List<ShapeInfo> shapeInfos = shapeService.get();
		List<LabInfo> labInfos = labService.get();
		List<PolishInfo> polishInfos = polishService.get();
		List<TableIncusionInfo> tableIncusionInfos = tableIncusionService.get();
		List<SymmetryInfo> symmetryInfos = symmetryService.get();
		List<LusterInfo> lusterInfos = lusterService.get();
		List<CountryInfo> countryInfos = countryService.get();
		List<ShadeInfo> shadeInfos = shadeService.get();
		List<OpenInclusionInfo> openInclusionInfos = openInclusionService.get();
		List<BlackInclusionInfo> blackInclusionInfos = blackInclusionService.get();
		List<GroupInfo> groupInfos = groupService.get();
		List<SupplierInfo> supplierInfos = supplierService.get();
		List<CutHSInfo> cutHSInfos = cutHSService.get();
		List<OriginColorInfo> originColorInfos = originColorService.get();
		List<CutEXInfo> cutEXInfos = cutEXService.get();
//		List<String> lotNames = lotService.getLotNames();
		List<SizeInfo> sizeInfos = sizeService.get();
		List<UnitInfo> unitInfos = unitService.get();

		diamondMasterInfo.setCutInfos(cutInfos);
		diamondMasterInfo.setColorInfos(colorInfos);
		diamondMasterInfo.setPurityInfos(purityInfos);
		diamondMasterInfo.setFluorescenceInfos(fluorescenceInfos);
		diamondMasterInfo.setShapeInfos(shapeInfos);
		diamondMasterInfo.setLabInfos(labInfos);
		diamondMasterInfo.setPolishInfos(polishInfos);
		diamondMasterInfo.setTableIncusionInfos(tableIncusionInfos);
		diamondMasterInfo.setSymmetryInfos(symmetryInfos);
		diamondMasterInfo.setLusterInfos(lusterInfos);
		diamondMasterInfo.setCountryInfos(countryInfos);
		diamondMasterInfo.setShadeInfos(shadeInfos);
		diamondMasterInfo.setOpenInclusionInfos(openInclusionInfos);
		diamondMasterInfo.setBlackInclusionInfos(blackInclusionInfos);
		diamondMasterInfo.setGroupInfos(groupInfos);
		diamondMasterInfo.setSupplierInfos(supplierInfos);
		diamondMasterInfo.setCutHSInfos(cutHSInfos);
		diamondMasterInfo.setOriginColorInfos(originColorInfos);
		diamondMasterInfo.setCutEXInfos(cutEXInfos);
//		diamondMasterInfo.setLotNos(lotNames);
		diamondMasterInfo.setSizeInfos(sizeInfos);
		diamondMasterInfo.setUnitInfos(unitInfos);

		return diamondMasterInfo;
	}
	

}
