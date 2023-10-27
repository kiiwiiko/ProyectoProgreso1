import greenfoot.*; 

public class MyWorld extends World {
    public MyWorld() {
        super(640, 425, 1); // Crea un mundo de 640x425 píxeles con una celda de tamaño 1x1
        addObject(new Noboa(), getWidth() / 10, getHeight() / 2);
    }

    public void act() {
        // Agrega enemigos periódicamente
        if (Greenfoot.getRandomNumber(100) < 5) {
            addObject(new Enemy(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
         public void gameOver() {
        showText("Game Over", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop(); // Detener el juego
    }
}