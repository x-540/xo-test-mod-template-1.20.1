package net.xo.xo_test_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xo.xo_test_mod.XoTestMod;
import net.xo.xo_test_mod.item.ModItems;

public class ModBlocks {
    public static final Block ruby_block = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_CRIMSON).strength(4F)));
    public static final Block gufinguy_block = registerBlock("gufinguy_block", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.BLACK).strength(-1F)));
    private static Block registerBlock(String name, Block block) {registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(XoTestMod.mod_id, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(XoTestMod.mod_id, name),new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        XoTestMod.LOGGER.info("Registering blocks for " + XoTestMod.mod_id);
    }
}
