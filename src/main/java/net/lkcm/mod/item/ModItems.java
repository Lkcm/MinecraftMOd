package net.lkcm.mod.item;

import net.lkcm.mod.LkcmMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LkcmMod.MOD_ID, name), item);
    }

}
