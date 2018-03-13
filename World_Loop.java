package org.devoxx4kids.forge.mods;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class World_Loop {
@SubscribeEvent
public void loop(LivingHurtEvent event) {
	if(event.getSource() != DamageSource.OUT_OF_WORLD) {
		return;
	}
Entity entity = event.getEntity();
double pos1 = event.getEntity().posX;
double pos2 = event.getEntity().posZ;

event.getEntity().setPositionAndUpdate(pos1, 1000, pos2);

}
}
