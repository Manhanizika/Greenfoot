import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foca extends Actor
{
    /**
     * Act - do whatever the foca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int contapeixe = 0;
    public void act()
    {
        {
            if(Greenfoot.isKeyDown("enter")){
                move(5);
            }

            if(Greenfoot.isKeyDown("up")){
                turn(-9);
            }

            if(Greenfoot.isKeyDown("down")){
                turn(9);
            }

            if(isTouching(peixe.class)){
                removeTouching(peixe.class);

                contapeixe++;

            }
            if(contapeixe == 4){
                getWorld().showText("FOCA GANHOU", 450, 250);
                Greenfoot.stop();
            }
        }
    }
}
