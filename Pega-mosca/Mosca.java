import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Actor
{
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        
        move(Greenfoot.getRandomNumber(25));
        turn(13 - Greenfoot.getRandomNumber(25));
        //turn(-Greenfoot.getRandomNumber(40));
        
        if(isAtEdge()){
        turn(90);
        move(20);
        }
        
            }
}
