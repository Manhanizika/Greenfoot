import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Sapo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sapo extends Actor
{
    int contador_Mosca = 0;
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(7);
        if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("Up")){
            turn(-5);
        }
        getWorld().showText("Pontuação:"+contador_Mosca ,62,9);
        if(isTouching(Mosca.class)){
             //JOptionPane.showMessageDialog(null,"GANHOU");
             contador_Mosca++;
             getWorld().showText("PEGOU A MOSCA BOA", 200, 200);
             removeTouching(Mosca.class);
             
             
        }
        
    }
}
