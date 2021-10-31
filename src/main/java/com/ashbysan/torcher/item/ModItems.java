package com.ashbysan.torcher.item;

import com.ashbysan.torcher.Torcher;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Torcher.MOD_ID);

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
