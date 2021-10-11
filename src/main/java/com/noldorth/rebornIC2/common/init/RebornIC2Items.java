package com.noldorth.rebornIC2.common.init;

import com.noldorth.rebornIC2.common.RebornIC2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RebornIC2Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RebornIC2.MODID);

    //INGOT ITEM
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //DUST ITEM

    //URANIUM GEM

}
