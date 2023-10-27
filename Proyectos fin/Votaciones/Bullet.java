import greenfoot.*; 

public class Bullet extends Actor {
    public void act() {
        move(5); // Mover hacia arriba
        
        // Eliminar la bala si sale del mundo por arriba
        if (getX() >= getWorld().getWidth()) {
            getWorld().removeObject(this);
        }else {
            checkCollision(); // Verificar colisión con balas
        }
    }
    
    // Verificar colisión con enemigos
    public void checkCollision() {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            getWorld().removeObject(this); // Eliminar el enemigo
            // No eliminar la bala, dejarla continuar su movimiento
        }
    }
}
