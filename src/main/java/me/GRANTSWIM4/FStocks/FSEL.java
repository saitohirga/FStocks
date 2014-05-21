package me.GRANTSWIM4.FStocks;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.massivecraft.factions.entity.BoardColls;
import com.massivecraft.factions.entity.UPlayer;
import com.massivecraft.mcore.ps.PS;

public final class FSEL implements Listener {	
	
	public boolean isFactionMember(Player player, Location loc) {
        UPlayer p = UPlayer.get(player);
        String f1 = p.getFactionName();
        String f2 = BoardColls.get().getFactionAt(PS.valueOf(loc)).getName();
        return f1.equalsIgnoreCase(f2);
    }
	
	
}