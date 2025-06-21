package net.ceevyte.voidroot_echo.item;

import net.ceevyte.voidroot_echo.VoidrootEcho;
import net.ceevyte.voidroot_echo.item.custom.ChiselItem;
import net.ceevyte.voidroot_echo.item.custom.SauceCanItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.lang.module.FindException;
import java.util.List;

public class ModItems {
    public static final Item ODDSTONE = registerItem("oddstone", new Item(new Item.Settings()));
    public static final Item RUNESTONE = registerItem("runestone", new Item(new Item.Settings()));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item SAUCE_CAN = registerItem("sauce_can", new SauceCanItem(new Item.Settings()));
    public static final Item SAUCE_CAN_OPEN = registerItem("sauce_can_open", new SauceCanItem(new Item.Settings().food(ModFoodComponents.SAUSE_CAN)));
    public static final Item WOOD = registerItem("wood", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if (Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.voidroot_echo.wood.tooltip"));
            } else {
                tooltip.add(Text.translatable("tooltip.voidroot_echo.generic.tooltip"));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(VoidrootEcho.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VoidrootEcho.LOGGER.info("Registering Mod Items for " + VoidrootEcho.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ODDSTONE);
            fabricItemGroupEntries.add(RUNESTONE);
        });
    }
}
