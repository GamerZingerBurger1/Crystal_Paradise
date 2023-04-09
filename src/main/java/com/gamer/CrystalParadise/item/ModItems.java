package com.gamer.CrystalParadise.item;

import com.gamer.CrystalParadise.CrystalParadise;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.registries.ForgeRegistries.Keys.ITEMS;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrystalParadise.MODID);

    public static final RegistryObject<Item> OJADE_PINK = ITEMS.register("ojade_pink.json",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));




    public static void register(IEventBus eventBus) {
        ModItems.register(eventBus);
    }

}