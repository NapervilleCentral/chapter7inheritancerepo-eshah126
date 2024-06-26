/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        
        //world.add(new ChildBug());
        /**
        world.add(new Bug());
        world.add(new Rock());
        world.add(new SpiralBug());
        world.add(new ZBug(4));
        world.add(new Sbug());
        **/
        
        int[] arr = {6,7,3,5,1,4,6,1,2,1,4,3,1,5,6,2,3,5,6};//once reaching the end, start the whole thing again
        DancingBug bug1 = new DancingBug(arr);
         world.add(bug1);
     //when reachers length set is 
        //world.add(new DancingBugRunner());
        world.show();
    }
}
