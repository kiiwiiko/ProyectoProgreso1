import greenfoot.*; 

public class MyWorld extends World {
    public MyWorld() {
        super(640, 425, 1); // Crea un mundo de 800x600 píxeles con una celda de tamaño 1x1
        
        // Agrega enemigos al mundo
        for (int i = 0; i < 5; i++) {
            addObject(new Enemy(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        
        // Agrega al jugador (Noboa) al mundo
        addObject(new Noboa(), getWidth() / 2, getHeight() - 50);
    }

}

