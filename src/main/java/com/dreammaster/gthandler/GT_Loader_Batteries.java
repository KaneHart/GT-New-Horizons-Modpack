package com.dreammaster.gthandler;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TC_Aspects;
import gregtech.api.objects.ItemData;
import gregtech.api.objects.MaterialStack;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.items.GT_MetaGenerated_Item_01;

public class GT_Loader_Batteries
{
	public void run()
	{
		GT = GT_MetaGenerated_Item_01.INSTANCE;
		registerBatteries();
	}

	private GT_MetaGenerated_Item_01 GT;
	
	// Add ALL the Batteries! I hate the IC2 crystals, and orbs, and all that CPU-Based energy storage
	private void registerBatteries()
	{
		int tLastID = 0;
		CustomItemList.BatteryHull_EV.set(GT.addItem(503, "Small Sunnarium Battery (Empty)", "An empty EV Battery Container", new Object[] { new ItemData(Materials.BlackSteel, OrePrefixes.plate.mMaterialAmount * 2L, new MaterialStack[0]), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 8L) }));
		CustomItemList.BatteryHull_IV.set(GT.addItem(504, "Medium Sunnarium Battery (Empty)", "An empty IV Battery Container", new Object[] { new ItemData(Materials.BlackSteel, OrePrefixes.plate.mMaterialAmount * 6L, new MaterialStack[0]), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 16L) }));
		CustomItemList.BatteryHull_LuV.set(GT.addItem(505, "Large Sunnarium Battery (Empty)", "An empty LuV Battery Container", new Object[] { new ItemData(Materials.BlackSteel, OrePrefixes.plate.mMaterialAmount * 18L, new MaterialStack[0]), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 32L) }));
		CustomItemList.BatteryHull_ZPM.set(GT.addItem(506, "Medium Naquadria Battery (Empty)", "An empty ZPM Energy Storage", new Object[] { new ItemData(Materials.RedSteel, OrePrefixes.plate.mMaterialAmount * 2L, new MaterialStack[0]), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 64L) }));
		CustomItemList.BatteryHull_UV.set(GT.addItem(507, "Large Naquadria Battery (Empty)", "An empty UV Energy Storage", new Object[] { new ItemData(Materials.RedSteel, OrePrefixes.plate.mMaterialAmount * 6L, new MaterialStack[0]), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 128L) }));
		
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Aluminium, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlueSteel, 2L),
				CustomItemList.BatteryHull_EV.get(1L, new Object[0]), 100, 520);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Platinum, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.RoseGold, 6L),
				CustomItemList.BatteryHull_IV.get(1L, new Object[0]), 200, 2050);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Naquadah, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.RedSteel, 18L),
				CustomItemList.BatteryHull_LuV.get(1L, new Object[0]), 300, 8200);
		
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.NaquadahAlloy, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Europium, 6L),
				CustomItemList.BatteryHull_ZPM.get(1L, new Object[0]), 200, 33000);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.ElectrumFlux, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Americium, 18L),
				CustomItemList.BatteryHull_UV.get(1L, new Object[0]), 300, 135000);

		
		CustomItemList.BatteryHull_EV_Full.set(GT.addItem(tLastID = 540, "Small Sunnarium Battery", "Reusable", new Object[] { new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 8L) }));
	    GT.setElectricStats(32000 + tLastID, 6400000L, GT_Values.V[4], 4L, -3L, true);
	    
		CustomItemList.BatteryHull_IV_Full.set(GT.addItem(tLastID = 541, "Medium Sunnarium Battery", "Reusable", new Object[] { new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 16L) }));
	    GT.setElectricStats(32000 + tLastID, 25600000L, GT_Values.V[5], 5L, -3L, true);
	    
		CustomItemList.BatteryHull_LuV_Full.set(GT.addItem(tLastID = 542, "Large Sunnarium Battery", "Reusable", new Object[] { new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 32L) }));
	    GT.setElectricStats(32000 + tLastID, 102400000L, GT_Values.V[6], 6L, -3L, true);
	    
		CustomItemList.BatteryHull_ZPM_Full.set(GT.addItem(tLastID = 543, "Medium Naquadah Battery", "Reusable", new Object[] { new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 64L) }));
	    GT.setElectricStats(32000 + tLastID, 409600000L, GT_Values.V[7], 7L, -3L, true);
	    
		CustomItemList.BatteryHull_UV_Full.set(GT.addItem(tLastID = 544, "Large Naquadah Battery", "Reusable", new Object[] { new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 128L) }));
	    GT.setElectricStats(32000 + tLastID, 1638400000L, GT_Values.V[8], 8L, -3L, true);
	    
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_EV_Full.get(1L, new Object[0]), CustomItemList.BatteryHull_EV.get(1L, new Object[0]));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_IV_Full.get(1L, new Object[0]), CustomItemList.BatteryHull_IV.get(1L, new Object[0]));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_LuV_Full.get(1L, new Object[0]), CustomItemList.BatteryHull_LuV.get(1L, new Object[0]));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_ZPM_Full.get(1L, new Object[0]), CustomItemList.BatteryHull_ZPM.get(1L, new Object[0]));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UV_Full.get(1L, new Object[0]), CustomItemList.BatteryHull_UV.get(1L, new Object[0]));

	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 4L),
	    		CustomItemList.BatteryHull_EV.get(1L, new Object[0]),
	    		CustomItemList.BatteryHull_EV_Full.get(1L, new Object[0]),
	    		null, 100, 480);
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 16L),
	    		CustomItemList.BatteryHull_IV.get(1L, new Object[0]),
	    		CustomItemList.BatteryHull_IV_Full.get(1L, new Object[0]),
	    		null, 100, 480);
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 32L),
	    		CustomItemList.BatteryHull_LuV.get(1L, new Object[0]),
	    		CustomItemList.BatteryHull_LuV_Full.get(1L, new Object[0]),
	    		null, 100, 480);
	    

	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 16L),
	    		CustomItemList.BatteryHull_ZPM.get(1L, new Object[0]),
	    		CustomItemList.BatteryHull_ZPM_Full.get(1L, new Object[0]),
	    		null, 100, 2480);
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 32L),
	    		CustomItemList.BatteryHull_UV.get(1L, new Object[0]),
	    		CustomItemList.BatteryHull_UV_Full.get(1L, new Object[0]),
	    		null, 100, 2480);

	    
	}
}
