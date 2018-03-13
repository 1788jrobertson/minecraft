package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class World_Bound {
	@SubscribeEvent
	public void loop(PlayerTickEvent event) {
		EntityPlayer player = event.player;
	double stbound = 256;
	double ndbound = 256;
	double rdbound = -256;
	double rthbound = -256;

	if(event.player.posX < stbound) {
		if(event.player.posZ < ndbound) {
			if(event.player.posX > rdbound) {
				if(event.player.posZ > rthbound) {
					return;
				}
				else	event.player.setPosition(0, 100, 0);
			}
			else event.player.setPosition(0, 100, 0);
		}
		else	event.player.setPosition(0, 100, 0);
	}
	else	event.player.setPosition(0, 100, 0);
}
}
