import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{
    Flecha flecha = new Flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
        act();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,515,390);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,515,440);
        addObject(flecha,405,400);
        Texto texto = new Texto();
        addObject(texto,519,487);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("up") && opcion != 0) {opcion++;}
        if(Greenfoot.isKeyDown("down") && opcion != 1) {opcion--;}
        if(opcion>=2)opcion=0;
        if(opcion<0)opcion=1;
        
        flecha.setLocation(420,390 +(opcion*50));
        
    
        if(Greenfoot.isKeyDown("Space") || Greenfoot.isKeyDown("Enter")){
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.setWorld(new HelpPage());
                    break;
                    
            }
        }
    }
}
