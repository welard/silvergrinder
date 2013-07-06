package grinder.Nodes;

import grinder.utils.Ids;
import grinder.utils.Tiles;

import org.powerbot.core.script.job.state.Node;

import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.SceneObject;

public class Stairs extends Node {


@Override
public boolean activate() {
	SceneObject funtus = SceneEntities.getNearest(Ids.ectofuntus);
	if (funtus == null) {
		return false;
			}
return Inventory.contains(Ids.silver_bar, 27) && Inventory.contains(Ids.eteleportid, 1)
		&& funtus.isOnScreen() ;
}
@Override
public void execute() {
	
	SceneObject stair = SceneEntities.getNearest(Ids.stairid);
	if (stair.isOnScreen())
	{
                    	 stair.interact("Climb-up", "Staircase");
                    	 sleep(2500, 3000);
	}
	else if (!stair.isOnScreen()){
		Walking.walk(Tiles.stair_Tile);
	}
                    	 
                    	 

}}

