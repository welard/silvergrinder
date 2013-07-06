package grinder.Nodes;

import grinder.utils.Ids;

import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.tab.Inventory;
import grinder.utils.Loadestone;
public class Bteleport extends Node {


@Override
public boolean activate() {
return Inventory.contains(Ids.silver_dust, 27) && Inventory.contains(Ids.eteleportid, 1) && (Players.getLocal().getAnimation() == -1) ;
}
@Override
public void execute() {
	
	
	Widgets.get(640, 33).click(true);
	System.out.println("action bar");
	sleep(1000,2000);
	Loadestone.teleportTo(Loadestone.BURTHROPE);
	System.out.println("loadstone location ");
	sleep(10000,20000);
	

}
}