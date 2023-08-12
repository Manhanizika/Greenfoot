import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dagrão here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Dagrão extends Actor
{
    int distanciaPercorrida = 19;
    int timer = 1;
    /**
     * Act - do whatever the Dagrão wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dagrão (){
        GreenfootImage gi = new GreenfootImage ("Dagrão sem fund.png"); 
        gi.scale(100, 100); 
        setImage(gi);
    }

    public void act()
    {
        distanciaPercorrida--; 

        if(distanciaPercorrida == -20) {
            distanciaPercorrida = 20;
            turn(180);
        } else if(distanciaPercorrida == 20) {
            turn(180);
        }
        move(3) ; 
        timer--;
        getWorld().showText("Timer:"+ timer, 100, 100);
        if(timer == 0){
            Masterball masterball = new Masterball();
            masterball.setRotation(0);
            getWorld().addObject(masterball, Greenfoot.getRandomNumber(1000), 250);    
            timer = 50;
        }
    }

}
