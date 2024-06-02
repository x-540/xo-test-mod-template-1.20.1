package net.xo.xo_test_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xo.xo_test_mod.XoTestMod;
import net.xo.xo_test_mod.block.ModBlocks;

public class ModItems {
    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",new Item(new FabricItemSettings()));

    private static void addItemsToIngredientGroup(FabricItemGroupEntries entries) {
        Item[] items = {RUBY,RAW_RUBY};
        for (Item i: items) {
            entries.add(i);
        }
    }

    private static void addItemsToBuildingBlocksGroup(FabricItemGroupEntries entries) {
        Item[] items = {ModBlocks.ruby_block};
        for (Item i: items) {
            entries.add(i);
        }
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(XoTestMod.mod_id, name), item);
    }
    public static void registerModItems() {
        XoTestMod.LOGGER.info("Registering items for " + XoTestMod.mod_id);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksGroup);
    }
}
