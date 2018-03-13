package org.devoxx4kids.forge.mods;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Adding_Things {

public static Block enderblock;
public static Item obsidian_blade;



@SubscribeEvent
public void registerBlocks(RegistryEvent.Register<Block> event)
{
	
	enderblock = new EnderBlock();
	event.getRegistry().registerAll(enderblock);
}

@SubscribeEvent
public void registerItems(RegistryEvent.Register<Item> event)
{
	
	obsidian_blade = new Obsidian_Blade();
	event.getRegistry().registerAll(obsidian_blade);

}
}
