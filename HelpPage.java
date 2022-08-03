import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPage extends World
{
    /**
     * Constructor for objects of class HelpPage.
     * 
     */
    public HelpPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        fillWorld();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void fillWorld()
    {
        Help help;
        help = new Help();
        this.addObject(help,500, 390);
        PlayButton playButton;
        playButton = new PlayButton();
        this.addObject(playButton,738,660);
        HP hP;
        hP = new HP();
        this.addObject(hP,305,658);
    }
}