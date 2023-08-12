import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Morte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Morte extends Actor
{
    /**
     * Act - do whatever the Morte wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(180);
       
       setLocation(getX(), getY() + 4);
       
       if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
