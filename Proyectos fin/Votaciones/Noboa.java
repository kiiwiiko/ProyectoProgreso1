import greenfoot.*; 

public class Noboa extends Actor {
    public void act() {
        // Verificar colisión con Enemy y terminar el juego
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    
        // Mover hacia la izquierda
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        
        // Mover hacia la derecha
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
        
        // Mover hacia arriba
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        
        // Mover hacia abajo
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        
        // Disparar balas al presionar la barra espaciadora
        if (Greenfoot.isKeyDown("space")) {
            shoot();
        }
        
    }
    
    public void shoot() {
    // Agregar 3 balas
    for (int i = 0; i < 3; i++) {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY() - 30);
    }
}

}


