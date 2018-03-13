package org.devoxx4kids.forge.mods;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Ender_Explosion {
@SubscribeEvent
	public void explode(EnderTeleportEvent event) {

	EntityPlayer player = (EntityPlayer) event.getEntity();
	BlockPos pos = new 
			BlockPos(event.getEntity().posX,
			event.getEntity().posY - 1,
			event.getEntity().posZ);	

	if(!(event.getEntity() instanceof EntityPlayer))	{
 return;
}

else {



}
}
}
