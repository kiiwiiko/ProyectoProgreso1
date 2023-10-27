import greenfoot.*; 

public class Enemy extends Actor {
    public Enemy() {
        // Obtener la imagen actual del actor
        GreenfootImage image = getImage();
        
        // Establecer el nuevo tamaño de la imagen (ancho y alto)
        int newWidth = image.getWidth() / 20;  // La mitad del ancho original
        int newHeight = image.getHeight() / 20;  // La mitad del alto original
        
        // Escalar la imagen al nuevo tamaño
        image.scale(newWidth, newHeight);
        
        // Establecer la nueva imagen al actor
        setImage(image);
    }
    
    public void act() {
        move(-2); // Mover hacia la izquierda

        // Eliminar el enemigo si alcanza el borde izquierdo del mundo
        if (getX() <= 0) {
            getWorld().removeObject(this);
        } else {
            checkCollision(); // Verificar colisión con balas
        }
    }
    
    // Verificar colisión con balas
    public void checkCollision() {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null) {
            getWorld().removeObject(this); // Eliminar el enemigo
            // No eliminar la bala, dejarla continuar su movimiento
        }
    }
}

