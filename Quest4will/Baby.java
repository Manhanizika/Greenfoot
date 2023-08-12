import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Timer = Greenfoot.getRandomNumber(100);
    int TimerM = Greenfoot.getRandomNumber(40);
    int ponto = 0; 
    public void act()
    {
        getWorld().showText("Pontos:" + ponto, 430, 30);
        Timer--;
        TimerM--;
        if(TimerM ==0) {
            Morte morte = new Morte();
            getWorld().addObject(morte, Greenfoot.getRandomNumber(500), 10);    
            TimerM = 40;
        }
        
        if(Timer == 0){
            Cogu cogu = new Cogu();
            getWorld().addObject(cogu, Greenfoot.getRandomNumber(500), 10);    
            Timer = 100;}
            
        if(Greenfoot.isKeyDown("D")){
            setRotation(0);
            setLocation(getX() + 4, getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setRotation(0);
            setLocation(getX() - 4, getY());
        }
         if(isTouching(Cogu.class)){
            ponto++;
            removeTouching(Cogu.class);
            
    }
    if(isTouching(Morte.class)){
        removeTouching(Baby.class);
        Greenfoot.stop();
    }
}
}
