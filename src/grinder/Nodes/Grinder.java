package grinder.Nodes;

import grinder.utils.Ids;

import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.SceneObject;

public class Grinder extends Node {


@Override
public boolean activate() {
SceneObject grinder = SceneEntities.getNearest(Ids.hopperid);
if (grinder == null) {
	return false;
		}

return grinder.isOnScreen() && Inventory.contains(Ids.silver_bar) && Inventory.contains(Ids.eteleportid)
		&& (Players.getLocal().getAnimation() == -1);
}
@Override
public void execute() {

	SceneObject grinder = SceneEntities.getNearest(Ids.hopperid);
	System.out.println("filling hopper");
                    	 grinder.interact("Fill", "Hopper");
                    	 	sleep(3500, 4000);
                    	 	System.out.println("clicking yes in chat box");
                    	 		Widgets.get(1188, 3).click(true);  //yes click
                    	 			sleep(4500, 5000);
                    	 			System.out.println("clicking grind");
                    	 				Widgets.get(1370, 38).click(true); //grind click
                    	 					sleep(50000, 55000);

    
}
}

