import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje extends Actor
{
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int verticalSpeed = 0;
    MyWorld thisGame;
    public void act()
    {
        this.moveAround();
        this.falling();
        this.checkFalling();
        hitEnemy();
        Eat();
        hitMeta();
        Eat1();
        hitWater();
        hitWater1();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            this.setLocation(this.getX() + 5, this.getY());
            this.setImage("Right.png");
            
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(this.getX() - 5, this.getY());
            this.setImage("Left.png");
            
        }
        if(Greenfoot.isKeyDown("up"))
        {
            if(this.onG() == true || this.getY() > 80)
            {
                this.jump();
            }
        }
    } 
    public void falling()
    {
        this.setLocation(this.getX(), this.getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 1;
        
    }
    
    
    public boolean onG()
    {
        Actor groundBelow;
        groundBelow = this.getOneObjectAtOffset(0,35, Ground.class);
        
        if (groundBelow != null){
            return true;
        }
        {
            return false;
        }
    }
    public void checkFalling()
    {
        if(this.onG() == true)
        {
            verticalSpeed = 0;
        }
        else
        {
            this.falling();
        }
    }
    public void jump()
    {
        verticalSpeed = -3;
        this.falling();
    }
    
    public void hitEnemy()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
            Greenfoot.playSound("Video Game Beep - Sound Effect.mp3");
            Greenfoot.delay(5);
            World myWorld = getWorld();
            GameOver gameOver = new GameOver();
            Greenfoot.setWorld(new GameOver());
            
            
            
            
        }
    }
    public void hitMeta()
    {
        Actor meta = getOneIntersectingObject(Meta.class);
        if(meta != null)
        {
            Greenfoot.playSound("Win.mp3");
            World myWorld = getWorld();
            Win winScreen = new Win();
            Greenfoot.setWorld(new Win());
            
        }
    }
    public void hitWater()
    {
        Actor hit1 = getOneIntersectingObject(Water.class);
        if(hit1 != null)
        {
            Greenfoot.playSound("Drowning (2).wav");
            World myWorld = getWorld();
            WaterGameOver waterScreen = new WaterGameOver();
            Greenfoot.setWorld(new WaterGameOver());
            
        }
    }
    public void hitWater1()
    {
        Actor hitwater = getOneIntersectingObject(Water1.class);
        if(hitwater != null)
        {
            Greenfoot.playSound("Drowning (2).wav");
            World myWorld = getWorld();
            WaterGameOver waterScreen = new WaterGameOver();
            Greenfoot.setWorld(new WaterGameOver());

        }
    }
    public void Eat()
    {
        Actor hongo = getOneIntersectingObject(Hongo.class);
            
        if(hongo != null)
        {
            Greenfoot.playSound("Video Game Beep - Sound Effect.mp3");
            getWorld().removeObject(hongo);
            thisGame.score++;
        
        }
    }
    public void Eat1()
    {
        Actor hongo1 = getOneIntersectingObject(Hongo1.class);
            
        if(hongo1 != null)
        {
            getWorld().removeObject(hongo1);
            thisGame.score++;
            Greenfoot.playSound("Video Game Beep - Sound Effect.mp3");
        }
    }
}
