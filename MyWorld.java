import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        this.fillWorld();
        prepare();
        act();
    }

    public void fillWorld()
    {
        Water1 myWater;
        myWater = new Water1();
        this.addObject(myWater, 300, 850);

        Water myWater1;
        myWater1 = new Water();
        this.addObject(myWater1, 933, 900);

        Ground7 myChiqui;
        myChiqui = new Ground7();
        this.addObject(myChiqui, 585, 500);

        Arbusto2 myArbusto2;
        myArbusto2 = new Arbusto2();
        this.addObject(myArbusto2,802,574);

        Caja caja;
        caja = new Caja();
        this.addObject(caja,776,566);

        Tronco myTronco; 
        myTronco = new Tronco();
        this.addObject(myTronco,574,423);

        Tree tree;
        tree = new Tree();
        addObject(tree,816,520);

        Arbusto1 arbusto1;
        arbusto1 = new Arbusto1();
        this.addObject(arbusto1,835,582);

        Arbusto1 arbusto12;
        arbusto12 = new Arbusto1();
        this.addObject(arbusto12,776,581);

        Tree tree2;
        tree2 = new Tree();
        this.addObject(tree2,686,452);

        Tree1 tree1;
        tree1 = new Tree1();
        this.addObject(tree1,627,475);

        Arbusto3 arbusto3; 
        arbusto3 = new Arbusto3();
        this.addObject(arbusto3,653,510);

        Roca roca;
        roca = new Roca();
        this.addObject(roca,481,516);

        Hongo1 hongo1;
        hongo1 = new Hongo1();
        this.addObject(hongo1,500,435);

        
        Tiles3 myTiles2;
        myTiles2 = new Tiles3();
        this.addObject(myTiles2, 515, 285);

        Tiles4 myTiles3;
        myTiles3 = new Tiles4();
        this.addObject(myTiles3, 670, 190);

        Tiles5 myTiles5;
        myTiles5 = new Tiles5();
        this.addObject(myTiles5, 900, 220);

        
        Ground myGround1;
        myGround1 = new Ground();
        this.addObject(myGround1, 40, 560);

        Ground8 myGround;
        myGround = new Ground8();
        this.addObject(myGround, 125, 640);

        Ground2 myGround2;
        myGround2 = new Ground2();
        this.addObject(myGround2, 550, 620);

        Ground4 myGround12;
        myGround12 = new Ground4();
        this.addObject(myGround12, 805, 655);

        Tree2 myTree1;
        myTree1 = new Tree2();
        this.addObject(myTree1, 240, 545);

        Tree1 myTree;
        myTree = new Tree1();
        this.addObject(myTree, 140, 530);

        Arbusto2  myArbusto1;
        myArbusto1 = new Arbusto2();
        this.addObject(myArbusto1, 180, 565);

        Arbusto1  myArbusto;
        myArbusto = new Arbusto1();
        this.addObject(myArbusto, 130, 570);

        Arbusto1  myArbusto4;
        myArbusto4 = new Arbusto1();
        this.addObject(myArbusto4, 235, 570);

        Tree  myTree3;
        myTree3 = new Tree();
        this.addObject(myTree3, 200, 510);

        Hongo myHongo;
        myHongo = new Hongo();
        this.addObject(myHongo, 80, 571);

        Hongo1 myHongo1;
        myHongo1 = new Hongo1();
        this.addObject(myHongo1, 75, 490);

        
        Tiles2 myTiles;
        myTiles = new Tiles2();
        this.addObject(myTiles, 330, 385);

        
        Meta myMeta;
        myMeta = new Meta();
        this.addObject(myMeta, 910, 80);

        Tiles6 myTiles6;
        myTiles6 = new Tiles6();
        this.addObject(myTiles6, 90, 180);
        
        Tree1 tree15;
        tree15= new Tree1();
        this.addObject(tree1,511,213);
        Arbusto1 arbusto13;
        arbusto13 = new Arbusto1();
        this.addObject(arbusto1,537,252);
        
        Arbusto1 arbusto14;
        arbusto14 = new Arbusto1();
        this.addObject(arbusto12,495,253);
        
        Caja caja1;
        caja1 = new Caja();
        this.addObject(caja1,309,339);
        Caja caja2 = new Caja();
        addObject(caja2,354,339);
        Caja caja3 = new Caja();
        addObject(caja3,333,294);
        Arbusto3 arbusto7;
        arbusto7  = new Arbusto3();
        this.addObject(arbusto7,384,343);
        
        Hongo hongo;
        hongo = new Hongo();
        addObject(hongo,327,353);
        
        Tree1 trei; 
        trei = new Tree1();
        addObject(trei,511,212);
        
        Arbusto1 arbust;
        arbust = new Arbusto1();
        this.addObject(arbust,534,252);
        Arbusto1 a;
        a = new Arbusto1();
        addObject(a,493,251);
        
        Arbusto2 myArb;
        myArb = new Arbusto2();
        this.addObject(myArb,669,149);
        
        Hongo myHongo5;
        myHongo5 = new Hongo();
        this.addObject(myHongo5,711,160);
        
        Hongo myhongo2;
        myhongo2 = new Hongo();
        this.addObject(myhongo2,631,160);
        
        Hongo1 h1;
        h1 = new Hongo1();
        this.addObject(h1,516,255);
        
        Hongo hh;
        hh = new Hongo();
        this.addObject(hh,576,514);
        
        Enemy enemy;
        enemy = new Enemy();
        this.addObject(enemy, 650,505);
        
        Enemy enemy2;
        enemy2 = new Enemy();
        this.addObject(enemy2,40,560);
        
        
        Señal mySeñal;
        mySeñal = new Señal();
        this.addObject(mySeñal, 50, 90);
        Hongo1 hongo14;
        hongo14 = new Hongo1();
        this.addObject(hongo14,811,581);
        Personaje myPersonaje;
        myPersonaje = new Personaje();
        this.addObject(myPersonaje, 80, 85);

    }
    public void act()
    {
        showText("Score: " +score, 400, 25);
        showText("Score: " +score, 580, 25); 
        
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Hongo3 hongo = new Hongo3();
        addObject(hongo,345,23);

        Hongo4 hongo1 = new Hongo4();
        addObject(hongo1,520,23);

        Home home = new Home();
        addObject(home,33,14);
    }
}
