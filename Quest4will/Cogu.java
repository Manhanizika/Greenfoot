import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cogu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Cogu extends Actor
{
    /**
     * Act - do whatever the Cogu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
       setRotation(180);
       
       setLocation(getX(), getY() + 2);
       
       if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}

