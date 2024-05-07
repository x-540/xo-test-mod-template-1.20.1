package net.xo.xo_test_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xo.xo_test_mod.XoTestMod;

public class ModItems {
    public static final Item ruby = registerItem("ruby",new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(ruby);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(XoTestMod.mod_id, name), item);
    }
    public void registerModItems() {
        XoTestMod.LOGGER.info("Itmes loading for " + XoTestMod.mod_id);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
