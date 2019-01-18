package ao.game.robocode;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * User: AO
 * Date: 10/23/10
 * Time: 9:49 PM
 */
public class AoSimpleBot
        extends Robot
{
    //------------------------------------------------------------------------
    public void run()
    {
        while (true)
        {
            turnRadarLeft(90);

            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }


    //------------------------------------------------------------------------
    public void onScannedRobot(ScannedRobotEvent e)
    {
        fire(1);
    }
}
