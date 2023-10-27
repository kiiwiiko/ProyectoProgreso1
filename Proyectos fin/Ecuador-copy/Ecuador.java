import greenfoot.*;  
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Ecuador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ecuador extends World
{

    /**
     * Constructor for objects of class Ecuador.
     * 
     */
    public Ecuador()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Noboa1 n1=new Noboa1 ();
        addObject(n1,50,300);
        crearCorreaa(5); 
    }
    public void crearCorreaa(int numero ) {
    for (int i=0;i<numero;i++){
        Correa1 c=new Correa1();
        int x=Greenfoot.getRandomNumber (getWidth());
        int y=Greenfoot.getRandomNumber (getHeight());
        addObject (c,x,y);
    }
}
}
 
