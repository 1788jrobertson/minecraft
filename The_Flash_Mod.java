package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class The_Flash_Mod {
@SubscribeEvent
public void run(LivingUpdateEvent event) 
	{
	if(!(event.getEntity() instanceof EntityPlayer)) 
		{
		return;
		}
	
EntityPlayer player = (EntityPlayer) event.getEntity();
	if(!player.isSprinting()) {
		return;
	}
	if (player.isAirBorne) {
		return;
	}
	else	event.getEntity().motionX *=2;
			event.getEntity().motionZ *=2;

	}
}

