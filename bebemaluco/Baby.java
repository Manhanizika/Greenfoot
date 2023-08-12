import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveUDLR();
        if(isAtEdge()){
            setLocation(getWorld().getWidth() - getX(), getWorld().getHeight() - getY());
        }
    }
    public void moveUDLR(){
           if(Greenfoot.isKeyDown("D")){
            setLocation(getX() + 2, getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX() - 2, getY());
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() - 2);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() + 2);
        }    
    }
}
