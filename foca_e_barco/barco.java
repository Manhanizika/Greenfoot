import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barco extends Actor
{
    /**
     * Act - do whatever the barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            move(5);
        }
        
        if(Greenfoot.isKeyDown("w")){
            turn(5);
        }

        if(Greenfoot.isKeyDown("s")){
            turn(-5);
        }

        if(isTouching(foca.class)){
            removeTouching(foca.class);
            Greenfoot.stop();
            getWorld().showText("BARCO GANHOU", 450, 250);

        }
    }
}
