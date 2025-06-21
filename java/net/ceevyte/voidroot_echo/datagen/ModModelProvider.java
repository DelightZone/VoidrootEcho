package net.ceevyte.voidroot_echo.datagen;

import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.ceevyte.voidroot_echo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALTPETER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEPATIZON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ODDSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAUCE_CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAUCE_CAN_OPEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOOD, Models.GENERATED);
    }
}
