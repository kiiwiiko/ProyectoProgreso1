import greenfoot.*; 

public class Bullet extends Actor {
    public void act() {
        move(5); // Mover hacia arriba
        
        // Eliminar la bala si alcanza el borde superior del mundo
        if (getY() <= 0) {
            getWorld().removeObject(this);
        } else {
            checkCollision(); // Verificar colisión con enemigos
        }
    }
    
    // Verificar colisión con enemigos
    public void checkCollision() {
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            getWorld().removeObject(this); // Eliminar la bala
            getWorld().removeObject(enemy); // Eliminar el enemigo
        }
    }
}
