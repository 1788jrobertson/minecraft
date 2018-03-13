package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Bouncy_Sponge {

@SubscribeEvent
public void bounce (LivingJumpEvent event) {
	if(!(event.getEntity() instanceof EntityPlayer)){
		return;
		}
	BlockPos pos = new 
			BlockPos(event.getEntity().posX,
			event.getEntity().posY - 1,
			event.getEntity().posZ);
		if (event.getEntity().world.getBlockState(pos).getBlock() != Blocks.SLIME_BLOCK) {
			return;
		}
		event.getEntity().motionY *= 5;
		event.getEntity().motionX *= 5;
		event.getEntity().motionZ *= 5;		
		}
}
