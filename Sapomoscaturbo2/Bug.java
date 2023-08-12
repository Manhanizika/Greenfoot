import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Gerar = Greenfoot.getRandomNumber(70);
    public void act()
    {

        move(Greenfoot.getRandomNumber(15));
        turn(13 - Greenfoot.getRandomNumber(25));
        

        if(isAtEdge()){
            turn(90);
            move(20);
        }

    }
}

