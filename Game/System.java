import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class System here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class System extends Actor
{
    public int pause = 20;
    /**
     * Act - do whatever the System wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(pause>0)
            pause--;
        if(pause == 0)
        {
            // Add your action code here.
            List<Pipe> array = getWorld().getObjects(Pipe.class);
            for (int i = 0; i < array.size(); i++) {

                
                Balloon balloon = new Balloon();
                getWorld().addObject(balloon,array.get(i).getX(),array.get(i).getY());
                pause = 20;
            }
        }

    }    
}
