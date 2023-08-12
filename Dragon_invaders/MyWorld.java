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
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mew mew = new Mew();
        addObject(mew,444,415);
        mew.setLocation(484,554);
        Dagrão dagrão = new Dagrão();
        addObject(dagrão,842,223);
        Dagrão dagrão2 = new Dagrão();
        addObject(dagrão2,625,214);
        Dagrão dagrão3 = new Dagrão();
        addObject(dagrão3,457,238);
        Dagrão dagrão4 = new Dagrão();
        addObject(dagrão4,252,201);
        Dagrão dagrão5 = new Dagrão();
        addObject(dagrão5,227,324);
        dagrão5.setLocation(349,241);
        dagrão4.setLocation(78,270);
        dagrão5.setLocation(243,262);
        dagrão3.setLocation(421,261);
        dagrão2.setLocation(585,211);
        dagrão3.setLocation(415,278);
        dagrão.setLocation(728,246);
        Dagrão dagrão6 = new Dagrão();
        addObject(dagrão6,894,250);
        dagrão6.setLocation(902,257);
        Dagrão dagrão7 = new Dagrão();
        addObject(dagrão7,909,148);
        Dagrão dagrão8 = new Dagrão();
        addObject(dagrão8,752,139);
        Dagrão dagrão9 = new Dagrão();
        addObject(dagrão9,559,140);
        Dagrão dagrão10 = new Dagrão();
        addObject(dagrão10,392,175);
        dagrão10.setLocation(393,153);
        Dagrão dagrão11 = new Dagrão();
        addObject(dagrão11,209,196);
        dagrão11.setLocation(237,168);
        Dagrão dagrão12 = new Dagrão();
        addObject(dagrão12,90,158);
        dagrão12.setLocation(127,160);
        dagrão11.setLocation(281,186);
        dagrão10.setLocation(428,184);
        dagrão9.setLocation(682,157);
        dagrão2.setLocation(602,295);
        dagrão3.setLocation(427,281);
        dagrão5.setLocation(241,271);
        dagrão4.setLocation(93,297);
        dagrão12.setLocation(109,177);
        dagrão9.setLocation(604,170);
        dagrão.setLocation(805,294);
        dagrão6.setLocation(946,309);
        dagrão7.setLocation(939,164);
        dagrão8.setLocation(778,169);
        dagrão6.setLocation(925,311);
        Masterball masterball = new Masterball();
        addObject(masterball,993,594);
    }
}
