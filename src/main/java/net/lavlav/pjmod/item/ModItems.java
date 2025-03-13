package net.lavlav.pjmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lavlav.pjmod.PercyJacksonMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item GODDESS_BRONZE_INGOT = registerItem("goddess_bronze_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PercyJacksonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PercyJacksonMod.LOGGER.info("Registring Mod Items for" + PercyJacksonMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BRONZE_INGOT);
            entries.add(GODDESS_BRONZE_INGOT);
        });
    }
}