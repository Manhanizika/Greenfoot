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
        super(400, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        espinho espinho = new espinho();
        addObject(espinho,46,624);
        espinho espinho2 = new espinho();
        addObject(espinho2,349,461);
        espinho espinho3 = new espinho();
        addObject(espinho3,183,321);
        espinho espinho4 = new espinho();
        addObject(espinho4,76,205);
        aranha aranha = new aranha();
        addObject(aranha,165,722);
        mosca mosca = new mosca();
        addObject(mosca,179,41);
        espinho espinho5 = new espinho();
        addObject(espinho5,146,133);
        espinho espinho6 = new espinho();
        addObject(espinho6,210,557);
        espinho2.setLocation(162,457);
        espinho6.setLocation(361,584);
        espinho2.setLocation(91,430);
        espinho6.setLocation(320,553);
        removeObject(espinho6);
        espinho3.setLocation(173,311);
        removeObject(espinho3);
        espinho4.setLocation(133,285);
        espinho2.setLocation(105,476);
        removeObject(espinho5);
    }
}
