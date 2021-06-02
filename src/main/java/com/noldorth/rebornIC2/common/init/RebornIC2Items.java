package com.noldorth.rebornIC2.common.init;

import com.noldorth.rebornIC2.common.RebornIC2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RebornIC2Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RebornIC2.MODID);

    public static final RegistryObject<Item> INGOT_COPPER = ITEMS.register("ingot_copper",() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //public static final
    //public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore_item",() -> new Item(new Item.Properties()));


}
