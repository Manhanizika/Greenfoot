import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guardião here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guardinha extends Actor
{
    /**
     * Act - do whatever the Guardião wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int move = 5;
    public void act()
    {
        
        if(isAtEdge()){
            move *= -1;
                        
        }
        move(move);
    }
}
