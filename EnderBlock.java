package org.devoxx4kids.forge.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnderBlock extends Block 
{
	
	public EnderBlock() 
		{
		super(Material.IRON);
		this.setUnlocalizedName("enderBlock");
		this.setCreativeTab(CreativeTabs.TRANSPORTATION);
		this.setResistance(0.1F);
		this.setHardness(1.0F);
		this.setLightLevel(1.0F);
		
		}	

}
