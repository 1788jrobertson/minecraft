package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class FeatherFall {

	
	@SubscribeEvent
	public void featherfall(PlayerTickEvent event) {
		EntityPlayer player = event.player;
		if (!player.isAirBorne) {
			return;
		}
return;
	}
@SubscribeEvent
public void negateFallDamage (LivingFallEvent event) {
	if(!(event.getEntity() instanceof EntityPlayer)) {
		return;} 
	event.setCanceled(true);
}
}
