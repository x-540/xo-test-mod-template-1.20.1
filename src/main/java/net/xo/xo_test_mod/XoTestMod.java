package net.xo.xo_test_mod;

import net.minecraft.block.Blocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XoTestMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	public static final String mod_id = "xo_test_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(mod_id);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		net.xo.xo_test_mod.item.ModItems.registerModItems();
		net.xo.xo_test_mod.block.ModBlocks.registerModBlocks();
	}
}