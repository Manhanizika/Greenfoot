import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Masterball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masterball extends Actor
{
    /**
     * Act - do whatever the Masterball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Masterball (){
        GreenfootImage gi = new GreenfootImage ("Masterball.png"); 
        gi.scale(30, 30); 
        setImage(gi);
    }
    int timer = 50;
    public void act()
    {
        move(4);
        if(isAtEdge()){
            getWorld().removeObject(this);

        }
    }
}
