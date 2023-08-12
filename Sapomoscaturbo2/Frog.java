import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Gerar = Greenfoot.getRandomNumber(70);
    public void act()
    {
        getWorld().showText("timer mosca: " +Gerar , 90, 30);
        move(3);

        if(Greenfoot.isKeyDown("A")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("D")){
            turn(5);
        }
        removeTouching(Bug.class);

        if(Gerar > 0) {
            Gerar--;
        }
        if(Gerar == 0){
            Bug bug = new Bug();
            getWorld().addObject(bug, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            Gerar = Greenfoot.getRandomNumber(70) ;
        }
    }
}