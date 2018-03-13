package org.devoxx4kids.forge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class Starting_Point {
public void spawn(PlayerEvent.PlayerRespawnEvent event) {
	EntityPlayer player = event.player;
	BlockPos pos = new BlockPos(0, 100, 0);
	player.setPosition(0, 70, 0);
	player.setSpawnPoint(pos, true);
}
}
