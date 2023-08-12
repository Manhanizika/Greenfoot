import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    /**
     * Act - do whatever the bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            move(8);
        }
        
        if(Greenfoot.isKeyDown("enter")){
            move(18);
        }
        
        if(Greenfoot.isKeyDown("w")){
            turn(7);
        }

        if(Greenfoot.isKeyDown("s")){
            turn(-7);
        }
        
        if(isTouching(Castelo.class)){
        if(Greenfoot.isKeyDown("b")){
        removeTouching(Castelo.class);
        getWorld().showText("You Win",400 , 175);
        Greenfoot.stop();
        
        }
        }


    }
}
