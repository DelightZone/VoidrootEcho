package net.ceevyte.voidroot_echo.item;

import net.ceevyte.voidroot_echo.VoidrootEcho;
import net.ceevyte.voidroot_echo.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VOIDROOT_ECHO_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VoidrootEcho.MOD_ID, "voidroot_echo_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ODDSTONE))
                    .displayName(Text.translatable("itemgroup.voidroot_echo.voidroot_echo_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ODDSTONE);
                        entries.add(ModItems.RUNESTONE);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.SAUCE_CAN);
                        entries.add(ModItems.SAUCE_CAN_OPEN);
                        entries.add(ModItems.WOOD);
                    }).build());

    public static final ItemGroup VOIDROOT_ECHO_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VoidrootEcho.MOD_ID, "voidroot_echo_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.LEAD_BLOCK))
                    .displayName(Text.translatable("itemgroup.voidroot_echo.voidroot_echo_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.HEPATIZON_BLOCK);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SALTPETER_BLOCK);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        VoidrootEcho.LOGGER.info("Registering Item Groups for " + VoidrootEcho.MOD_ID);
    }
}
