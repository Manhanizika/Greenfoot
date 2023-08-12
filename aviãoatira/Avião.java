import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avião here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avião extends Actor
{
    /**
     * Act - do whatever the Avião wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int timer = 10; 
    public void act()
    {
        if (timer >
    if(Greenfoot.isKeyDown("Space") && ){
            Heart heart = new Heart();
            heart.setRotation(getRotation());
            getWorld().addObject(heart, getX(), getY());        
            
}
    if(Greenfoot.isKeyDown("D")){
        turn(3);
    }
    
    if(Greenfoot.isKeyDown("A")){
        turn(-3);
    }
}
}