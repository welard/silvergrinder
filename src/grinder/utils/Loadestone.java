package grinder.utils;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 2/11/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */

public class Loadestone {

    public final static WidgetChild MAGIC_TAB_ON_ABIL = new Widget(275).getChild(33);
    public final static WidgetChild TELEPORT_TAB_ON_ABIL = new Widget(275).getChild(47);
    public final static WidgetChild HOME_TELEPORT_ON_ABIL = new Widget(275).getChild(18).getChild(155);
    public final static WidgetChild TELEPORTATION_INTERFACE = new Widget(1092).getChild(8);


    //Widget children for teleportation locations
    public final static WidgetChild LUNAR_ISLE = new Widget(1092).getChild(39);
    public final static WidgetChild BANDIT_CAMP = new Widget(1092).getChild(7);
    public final static WidgetChild AL_KHARID = new Widget(1092).getChild(40);
    public final static WidgetChild ARDOUGNE = new Widget(1092).getChild(41);
    public final static WidgetChild BURTHROPE = new Widget(1092).getChild(42);
    public final static WidgetChild CATHERBY = new Widget(1092).getChild(43);
    public final static WidgetChild DRAYNOR = new Widget(1092).getChild(44);
    public final static WidgetChild EDGEVILLE = new Widget(1092).getChild(45);
    public final static WidgetChild FALADOR = new Widget(1092).getChild(46);
    public final static WidgetChild LUMBRIDGE = new Widget(1092).getChild(47);
    public final static WidgetChild PORT_SARIM = new Widget(1092).getChild(48);
    public final static WidgetChild SEERS_VILLAGE = new Widget(1092).getChild(49);
    public final static WidgetChild TAVERLY = new Widget(1092).getChild(50);
    public final static WidgetChild VARROCK = new Widget(1092).getChild(51);
    public final static WidgetChild YANILLE = new Widget(1092).getChild(52);

    //Arrival areas
    public final static Area LUNAR_ISLE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2080, 3918, 0), new Tile(2088, 3918, 0), new Tile(2088, 3910, 0),
            new Tile(2080, 3910, 0) });
    public final static Area BANDIT_CAMP_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3208, 2959, 0), new Tile(3219, 2959, 0), new Tile(3219, 2948, 0),
            new Tile(3208, 2948, 0) });
    public final static Area AL_KHARID_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3291, 3180, 0), new Tile(3301, 3180, 0), new Tile(3301, 3189, 0),
            new Tile(3291, 3189, 0) });
    public final static Area ARDOUGNE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2627, 3344, 0), new Tile(2638, 3344, 0), new Tile(2638, 3353, 0),
            new Tile(2627, 3353, 0) });
    public final static Area BURTHROPE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2893, 3549, 0), new Tile(2904, 3549, 0), new Tile(2904, 3538, 0),
            new Tile(2893, 3538, 0) });
    public final static Area CATHERBY_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2826, 3456, 0), new Tile(2836, 3456, 0), new Tile(2836, 3446, 0),
            new Tile(2826, 3446, 0) });
    public final static Area DRAYNOR_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3099, 3303, 0), new Tile(3109, 3303, 0), new Tile(3109, 3293, 0),
            new Tile(3099, 3293, 0) });
    public final static Area EDGEVILLE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3061, 3510, 0), new Tile(3071, 3510, 0), new Tile(3071, 3499, 0),
            new Tile(3061, 3499, 0) });
    public final static Area FALADOR_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2960, 3407, 0), new Tile(2973, 3407, 0), new Tile(2973, 3397, 0),
            new Tile(2960, 3397, 0) });
    public final static Area LUMBRIDGE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3228, 3226, 0), new Tile(3236, 3226, 0), new Tile(3236, 3216, 0),
            new Tile(3228, 3216, 0) });
    public final static Area PORT_SARIM_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3003, 3221, 0), new Tile(3017, 3221, 0), new Tile(3017, 3207, 0),
            new Tile(3003, 3207, 0) });
    public final static Area SEERS_VILLAGE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2682, 3487, 0), new Tile(2694, 3487, 0), new Tile(2694, 3476, 0),
            new Tile(2682, 3476, 0) });
    public final static Area TAVERLY_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2872, 3447, 0), new Tile(2884, 3447, 0), new Tile(2884, 3435, 0),
            new Tile(2872, 3435, 0) });
    public final static Area VARROCK_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3208, 3381, 0), new Tile(3220, 3381, 0), new Tile(3220, 3369, 0),
            new Tile(3208, 3369, 0) });
    public final static Area YANILLE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(2521, 3101, 0), new Tile(2535, 3101, 0), new Tile(2535, 3085, 0),
            new Tile(2521, 3085, 0) });



    public static final String db = "[DEBUG]";
    public static final String inf = "[INFO]";

    public static void logIt(String type, String message) {
        System.out.println(type + message);
    }

    public static boolean isPlayerTeleporting() {
        return Players.getLocal().getAnimation() == 16385;
    }


    /**
     *
     * @param location : The location of the lodestone we will teleport to, a list of locations are provided in this class
     * @return : returns true if the player is teleporting
     */
    public static boolean teleportTo(WidgetChild location) {
        //Tabs.ABILITY_BOOK.open();

        if (!isPlayerTeleporting()) {

            if (!TELEPORT_TAB_ON_ABIL.validate()) {
                logIt(db, "Teleport tab on our ability bar not visible, opening magic tab.");
                Mouse.click(MAGIC_TAB_ON_ABIL.getCentralPoint(), true);
            } else {
                if (!HOME_TELEPORT_ON_ABIL.validate()) {
                    logIt(db, "Home teleport spell(s) not visible, opening teleports tab in ability book.");
                    Mouse.click(TELEPORT_TAB_ON_ABIL.getCentralPoint(), true);
                }
                if (!TELEPORTATION_INTERFACE.validate()) {
                    logIt(db, "Teleportation interface not visible, opening");
                    Mouse.click(HOME_TELEPORT_ON_ABIL.getCentralPoint(), true);
                } else {
                    if (!isPlayerTeleporting()) {
                        logIt(db, "Trying to click on teleport");
                        Mouse.click(location.getCentralPoint(), true);
                        Task.sleep(1500);
                    }
                }
            }
        }

        return isPlayerTeleporting();
    }

    /**
     *
     * @param location: The location of the lodestone we will teleport to, a list of locations are provided in this class
     * @param arrivalArea: The area we will arrive at if we teleport, this will be used to tell if we are in the arrival area or not.
     *                   Note: in order for this to work, the location and the arrival area must be in the same location.
     *                   Example: teleportTo(VARROCK, VARROCK_ARRIVAL_AREA);
     * @return : returns true if we are not at the arrival area, returns false otherwise.
     */
    public static boolean teleportTo(WidgetChild location, Area arrivalArea) {
        //Tabs.ABILITY_BOOK.open();

        if (!isPlayerTeleporting()) {

            if (!TELEPORT_TAB_ON_ABIL.validate()) {
                logIt(db, "Teleport tab on our ability bar not visible, opening magic tab.");
                Mouse.click(MAGIC_TAB_ON_ABIL.getCentralPoint(), true);
            } else {
                if (!HOME_TELEPORT_ON_ABIL.validate()) {
                    logIt(db, "Home teleport spell(s) not visible, opening teleports tab in ability book.");
                    Mouse.click(TELEPORT_TAB_ON_ABIL.getCentralPoint(), true);
                }
                if (!TELEPORTATION_INTERFACE.validate()) {
                    logIt(db, "Teleportation interface not visible, opening");
                    Mouse.click(HOME_TELEPORT_ON_ABIL.getCentralPoint(), true);
                } else {
                    if (!isPlayerTeleporting()) {
                        logIt(db, "Trying to click on teleport");
                        Mouse.click(location.getCentralPoint(), true);
                        Task.sleep(1500);
                    }
                }
            }
        }

        return arrivalArea.contains(Players.getLocal());
    }



}