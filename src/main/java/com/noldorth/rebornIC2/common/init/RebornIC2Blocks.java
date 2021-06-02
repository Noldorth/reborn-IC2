package com.noldorth.rebornIC2.common.init;

import com.noldorth.rebornIC2.common.RebornIC2;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class RebornIC2Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RebornIC2.MODID);

    //public static final RegistryObject<Block> COPPER_ORE = createBlock("copper_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f, 15).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));

    public static final RegistryObject<Block> COPPER_BLOCK = createBlock("copper_block", () -> new Block (AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));



    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        RebornIC2Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
