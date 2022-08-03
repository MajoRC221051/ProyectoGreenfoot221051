import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Flecha flecha = new Flecha();
    private int opcion1=0;
    /**
     * Constructor for objects of class Win.
     * 
     */
    public GameOver()
    {
        super(1000, 700, 1);
        act();
        fillWorld();
    }
    
    private void fillWorld()
    {
        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain,500,320);
        HP2 homeButton = new HP2();
        addObject(homeButton,490,400);
        addObject(flecha,300, 320);
        Texto texto = new Texto();
        addObject(texto,510,450);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("up") && opcion1 != 0) {opcion1++;}
        Greenfoot.playSound("Video Game Beep - Sound Effect.mp3");
        if(Greenfoot.isKeyDown("down") && opcion1 != 1) {opcion1--;}
        Greenfoot.playSound("Video Game Beep - Sound Effect.mp3");
        if(opcion1>=2)opcion1=0;
        if(opcion1<0)opcion1=1;
        
        flecha.setLocation(300, 320 +(opcion1*80));
        
    
        if(Greenfoot.isKeyDown("Space") || Greenfoot.isKeyDown("Enter")){
            Greenfoot.playSound("Click.mp3");
            switch(opcion1){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.setWorld(new HomePage());
                    break;
                    
            }
        }
    }
}
