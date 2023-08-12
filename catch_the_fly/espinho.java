import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class espinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espinho extends Actor
{
    /**
     * Act - do whatever the espinho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Greenfoot.getRandomNumber(7));
        
        if(isAtEdge()){
            turn(180);
        }
        
        if(isTouching(aranha.class)){
            removeTouching(aranha.class);
            getWorld().showText("Game Over", 200, 300);
            Greenfoot.stop();
        }
    }
}
