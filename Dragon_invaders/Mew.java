import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mew here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Mew extends Actor
{   
    /**
     * Act - do whatever the Mew wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // TURMA DA MAN
    //Fernando Manhani
    //Fabricio ramalho
    // Elton Aragão
    // Felipe 

    public Mew (){
        GreenfootImage gi = new GreenfootImage ("Mew sem fundo.png"); 
        gi.scale(75, 75); 
        setImage(gi);
    }
    int Timer = 0;
    public void act()
    {
        getWorld().showText("cooldown" + Timer, 70, 90);
        if(Timer >0){
        Timer-- ;
        } 
        
        if(Greenfoot.isKeyDown("D")){
            setRotation(0);
            setLocation(getX() + 2, getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setRotation(0);
            setLocation(getX() - 2, getY());
        }
        if(Greenfoot.isKeyDown("Space") && Timer == 0){
            Shadow shadow = new Shadow();
            shadow.setRotation(270);
            getWorld().addObject(shadow, getX(), getY());    
            Timer = 100;
        }

    }
}
