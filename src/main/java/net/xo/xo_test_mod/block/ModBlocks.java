package net.xo.xo_test_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.client.gl.Uniform;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.xo.xo_test_mod.XoTestMod;
import net.xo.xo_test_mod.item.ModItems;

public class ModBlocks {
    public static final Block ruby_block = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_CRIMSON).strength(2.5F)));
    public static final Block raw_ruby_block = registerBlock("raw_ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.DARK_CRIMSON).strength(2.5F)));
    public static final Block ruby_ore = registerBlock("raw_ruby_block", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_CRIMSON).strength(2F), UniformIntProvider.create(2,5)));
    static final Block deepslate_ruby_ore = registerBlock("raw_ruby_block", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).mapColor(MapColor.DARK_CRIMSON).strength(3.5F), UniformIntProvider.create(3,6)));
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
