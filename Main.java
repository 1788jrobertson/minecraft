package org.devoxx4kids.forge.mods;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main 
{
	public static final String MODID = "mymods";
	public static final String VERSION = "1.0";
	public static Block enderBlock;


@EventHandler
public void init(FMLInitializationEvent event)
	{
MinecraftForge.EVENT_BUS.register(new World_Loop());
MinecraftForge.EVENT_BUS.register(new World_Bound());
MinecraftForge.EVENT_BUS.register(new Starting_Point());


GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(Items.DIAMOND, 2), 15.5F);

	}
}