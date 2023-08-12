import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aranha extends Actor
{
    /**
     * Act - do whatever the aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);

        if(Greenfoot.isKeyDown("d")){
            turn(5);
        }

        if(Greenfoot.isKeyDown("a")){
            turn(-5);
        }

        if(isTouching(mosca.class)){
            removeTouching(mosca.class);
            Greenfoot.stop();
            getWorld().showText("GANHOU", 200, 300);
            
        }
    }
}

