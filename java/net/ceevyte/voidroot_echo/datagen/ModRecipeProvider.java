package net.ceevyte.voidroot_echo.datagen;

import net.ceevyte.voidroot_echo.VoidrootEcho;
import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.ceevyte.voidroot_echo.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> ODDSTONE_SMELTABLES = List.of(
                ModItems.RUNESTONE,
                ModBlocks.SALTPETER_BLOCK
        );

        offerSmelting(exporter, ODDSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.ODDSTONE, 0.25f, 200, "oddstone");
        offerBlasting(exporter, ODDSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.ODDSTONE, 0.25f, 100, "oddstone");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNESTONE, RecipeCategory.DECORATIONS, ModBlocks.SALTPETER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUNESTONE)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ODDSTONE)
                .criterion(hasItem(ModItems.ODDSTONE), conditionsFromItem(ModItems.ODDSTONE))
                .offerTo(exporter, Identifier.of(VoidrootEcho.MOD_ID, "runestone_from_oddstone"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ODDSTONE, 9)
                .input(ModItems.RUNESTONE)
                .criterion(hasItem(ModItems.RUNESTONE), conditionsFromItem(ModItems.RUNESTONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ODDSTONE, 32)
                .input(ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, Identifier.of(VoidrootEcho.MOD_ID, "oddstone_from_magic_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAUCE_CAN_OPEN, 1)
                .input(ModItems.SAUCE_CAN)
                .criterion(hasItem(ModItems.SAUCE_CAN), conditionsFromItem(ModItems.SAUCE_CAN))
                .offerTo(exporter);
    }
}
