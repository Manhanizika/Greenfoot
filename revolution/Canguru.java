import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canguru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canguru extends Actor
{
    /**
     * Act - do whatever the canguru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move (6);

        if(isAtEdge()){
            turn (Greenfoot.getRandomNumber(120));

        }

        if(isTouching(Bomba.class)){
            getWorld().showText("Game Over", 200, 150);
            Greenfoot.stop();
        }
    }
}
