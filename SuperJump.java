package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump {
@SubscribeEvent
public void makeJumpHigher(LivingJumpEvent event) {
		if (!(event.getEntity() instanceof EntityPlayer)) {
			return;}
		event.getEntity().motionY *=5;
		event.getEntity().motionX *=13;
		event.getEntity().motionZ *=13;
}
}
