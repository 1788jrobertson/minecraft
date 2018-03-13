package org.devoxx4kids.forge.mods;

import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WallClimbing {

@SubscribeEvent
public void climbWall(LivingUpdateEvent event) {
	if(!(event.getEntity() instanceof EntitySnowman) &&
	!(event.getEntity() instanceof EntityIronGolem) &&
	!(event.getEntity() instanceof EntityPlayer )){
		return;
	}
	
	if (!event.getEntity().isCollidedHorizontally) {
		return;
	}	
	event.getEntity().motionY =.5;
}
}
