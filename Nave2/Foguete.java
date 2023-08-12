import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foguete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Foguete extends Actor
{
    

    int balinhas = 200;
    public void act()
    {
        int btnmouse = 0;
        MouseInfo m = Greenfoot.getMouseInfo();
        
        if(m != null) {
            btnmouse = m.getButton();
        }
        
        getWorld().showText("Balas:" + balinhas, 60, 380);
        if(Greenfoot.isKeyDown("D")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("A")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("Space") || btnmouse == 1 && balinhas >0){
            Poder poder = new Poder();
            poder.setRotation(getRotation());
            getWorld().addObject(poder, getX(), getY());    
            balinhas --;        
        }
    }
}
