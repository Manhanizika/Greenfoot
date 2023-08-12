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
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Foguete foguete = new Foguete();
        addObject(foguete,58,210);
        Et et = new Et();
        addObject(et,370,80);
        Et et2 = new Et();
        addObject(et2,523,187);
        Et et3 = new Et();
        addObject(et3,387,350);
        Rock rock = new Rock();
        addObject(rock,345,291);
        Rock rock2 = new Rock();
        addObject(rock2,442,57);
        Rock rock3 = new Rock();
        addObject(rock3,327,192);
        foguete.setLocation(256,216);
        rock3.setLocation(207,52);
        et.setLocation(384,126);
        removeObject(et);
        removeObject(et2);
        removeObject(et3);
        rock.setLocation(282,338);
        foguete.setLocation(306,185);
        foguete.setLocation(300,190);
        rock3.setLocation(201,62);
        foguete.setLocation(289,205);
        Rock rock4 = new Rock();
        addObject(rock4,487,306);
        Rock rock5 = new Rock();
        addObject(rock5,489,170);
        Rock rock6 = new Rock();
        addObject(rock6,107,169);
        Rock rock7 = new Rock();
        addObject(rock7,114,299);
    }
}
