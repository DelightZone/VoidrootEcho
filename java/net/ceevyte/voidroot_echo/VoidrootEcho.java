package net.ceevyte.voidroot_echo;

import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.ceevyte.voidroot_echo.item.ModItemGroups;
import net.ceevyte.voidroot_echo.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoidrootEcho implements ModInitializer {
	public static final String MOD_ID = "voidroot_echo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + VoidrootEcho.MOD_ID);
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.WOOD, 600);
	}
}