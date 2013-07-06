package grinder.Nodes;


import grinder.utils.Ids;
import grinder.utils.Tiles;

import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.wrappers.node.SceneObject;





public class Banking extends Node {

@Override
public boolean activate() {
	SceneObject stake = SceneEntities.getNearest(Ids.stakeid);
	if (stake == null) {
		return false;
			}
return Inventory.contains(Ids.silver_dust) && Tiles.banking_area.contains(Players.getLocal());
}

@Override
public void execute() {	
	
	sleep(1000);
	if (Bank.isOpen()){                   //Bank class,  checks to see if the bank is open
        Bank.deposit(Ids.silver_dust, 28);
        sleep(800, 1200);
        Bank.withdraw(Ids.silver_bar, 28);
        sleep(500, 1000);
        
       Bank.close();                     //Closes the bank after depositing
    }   else {
    	Walking.walk(Tiles.bankTile);
    	System.out.println("walking to bank ");
        Bank.open();                      //Opens the banks
        sleep(3000 ,3400);                // Sleeps in case of lag
    

}
sleep(1000);
}


}
