package grinder.utils;


import java.awt.Color;
import java.awt.Graphics;


import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;


public class Debug {

private static final Color RED = new Color(255, 0, 0 ,160);


public static void drawArea(Graphics g, Area area) throws Exception {
drawTiles(g, area.getTileArray());
}

public static void drawTiles(Graphics g, Tile[] tiles) throws Exception {
g.setColor(RED);
for (Tile tile : tiles) {
tile.draw(g);	
}
}


public static void drawLine(Graphics g, String text, int x, int y) throws Exception {
g.setColor(RED);	
g.fillRect(x, y, 200, 20);	
g.setColor(Color.WHITE);
g.drawString(text, x + 5, y + 18);
}


}