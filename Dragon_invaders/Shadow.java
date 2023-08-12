import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shadow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shadow extends Actor
{
    /**
     * Act - do whatever the Shadow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int ponto = 0;
    public Shadow (){
        GreenfootImage gi = new GreenfootImage ("Shadowball.png"); 
        gi.scale(30, 30); 
        setImage(gi);
    }
    public void act()
    {
        move(4);
        
        if(isTouching(Dagrão.class)){
            ponto++;
            removeTouching(Dagrão.class);
            
        }
        if(ponto == 12){
            getWorld().showText("YOU WIN", 500, 300);
            Greenfoot.stop();
        }
        else{
            if(isAtEdge()){
                getWorld().removeObject(this);
            }
        }
        
    }
        
}
