package grinder;


import java.awt.Graphics;
import java.text.NumberFormat;

import org.powerbot.core.event.events.MessageEvent;
import org.powerbot.core.event.listeners.MessageListener;
import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.util.net.GeItem;


import grinder.Nodes.*;
import grinder.utils.Debug;
import grinder.utils.Tiles;




@Manifest(authors = { "welard" }, description = "grinds silver useing bone crusher", name = "silver grinder")
public class MainGrinder extends ActiveScript implements PaintListener, MessageListener {

	final int silver_BAR = 2355;
	   final int silver_Dust = 7650;
	   Timer runTime = new Timer(0);
	   public int dustPrice;
	   public int silverPrice;
	   public static long startTime = System.currentTimeMillis();
	        public static long millis = 0;
	        public static long seconds = 0;
	        public static long minutes = 0;
	        public static long hours = 0;
	   public int ground = 0;
	   public int dustPerHour;
	   public int profit = 0;
	   public int profitPerHour; 



private static final Node[] jobs = {new Banking(), new Eteleport(), new Stairs(), new Grinder(), new Bteleport(),   };

private static String CurrentJob = "Nothing";

@Override
public void onStart() {
	 silverPrice = GeItem.lookup(silver_BAR).getPrice();
	 dustPrice = GeItem.lookup(silver_Dust).getPrice();
	
}

@Override
public int loop() {	
for (Node job : jobs) {
if(job.activate()) {
CurrentJob = job.getClass().getName();
job.execute();
return 200;
}
}	

CurrentJob = "Nothing";
return 50;
}


@Override
public void onRepaint(Graphics g) {
try {
Debug.drawLine(g, "Current Job: " + CurrentJob, 0, 20);
Debug.drawLine(g,"runTime: " + runTime.toElapsedString(), 10, 80);
Debug.drawLine(g,"Profit:" + (ground*(dustPrice - silverPrice)), 20, 140);
Debug.drawLine(g,"Amount ground "  + formatNum(ground), 30, 180);
Debug.drawArea(g, Tiles.banking_area);

//inventoryCounter.draw(g, 300, 0);
} catch (Exception e) {
e.printStackTrace();
}	
}

private String formatNum(int number) {
    return NumberFormat.getInstance().format(number);
}


public void messageReceived(MessageEvent e) {
String message = e.getMessage().toLowerCase();
if (message.contains("grinding the bar")) {
	ground+=1;
}
else
	if (message.contains("tomorrow")) {
	shutdown();
    }
}
}




