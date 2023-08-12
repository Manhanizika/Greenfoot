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
        Frog frog = new Frog();
        addObject(frog,292,211);
        Bug bug = new Bug();
        addObject(bug,213,50);
        Bug bug2 = new Bug();
        addObject(bug2,478,131);
        Bug bug3 = new Bug();
        addObject(bug3,129,329);
        bug2.setLocation(483,132);
        removeObject(bug2);
        removeObject(bug);
        removeObject(bug3);
    }
}
