import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 250, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Bebe bebe = new Bebe();
        addObject(bebe,247,13);
        Bebe bebe2 = new Bebe();
        addObject(bebe2,378,7);
        Bomba bomba = new Bomba();
        addObject(bomba,14,124);
        Castelo castelo = new Castelo();
        addObject(castelo,775,127);
        Canguru canguru = new Canguru();
        addObject(canguru,521,236);
        Guardiao guardiao = new Guardiao();
        addObject(guardiao,657,227);
    }
}
