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
        super(900, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        peixe peixe = new peixe();
        addObject(peixe,844,40);
        peixe peixe2 = new peixe();
        addObject(peixe2,52,40);
        peixe peixe3 = new peixe();
        addObject(peixe3,51,457);
        peixe peixe4 = new peixe();
        addObject(peixe4,845,458);
        foca foca = new foca();
        addObject(foca,76,242);
        barco barco = new barco();
        addObject(barco,838,242);
    }
}
