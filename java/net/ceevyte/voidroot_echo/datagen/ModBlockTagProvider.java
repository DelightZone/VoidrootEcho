package net.ceevyte.voidroot_echo.datagen;

import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.HEPATIZON_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SALTPETER_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MAGIC_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HEPATIZON_BLOCK)
                .add(ModBlocks.SALTPETER_BLOCK)
        ;
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
        ;
    }
}
