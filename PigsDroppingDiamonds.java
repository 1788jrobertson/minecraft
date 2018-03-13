package org.devoxx4kids.forge.mods;

import java.util.Random;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds {
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event) {
		if (!(event.getEntity() instanceof EntityPig| event.getEntity() instanceof EntityChicken)) {
			return;
		}
	
	Random random = new Random();
		if (!event.getEntity().world.isRemote) {
			event.getEntity().dropItem(ItemBlock.getItemFromBlock(Blocks.SLIME_BLOCK), random.nextInt(11));
		}
	}
}
