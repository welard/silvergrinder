package grinder.Nodes;

import grinder.utils.Ids;

import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.SceneObject;

public class Eteleport extends Node {


@Override
public boolean activate() {
	SceneObject bankid = SceneEntities.getNearest(Ids.bankid);
	if (bankid == null) {
return false;
	}
	return Inventory.contains(Ids.silver_bar, 27) && Inventory.contains(Ids.eteleportid, 1)
		&& bankid.isOnScreen();
}
@Override
public void execute() {
//	Tabs.INVENTORY.open();
	 Inventory.getItem(Ids.eteleportid).getWidgetChild().interact("Empty", "Ectophial");
     sleep(10000, 12000);

}
}