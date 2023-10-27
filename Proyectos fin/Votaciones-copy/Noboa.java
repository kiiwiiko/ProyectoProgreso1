import greenfoot.*;

public class Noboa extends Actor {
    private static final int SPEED = 4;

    public void act() {
        handleMovement();
        checkShoot();
    }

    private void handleMovement() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - SPEED, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + SPEED, getY());
        }
    }

    private void checkShoot() {
        if (Greenfoot.isKeyDown("space")) {
            getWorld().addObject(new Bullet(), getX(), getY() - 30);
        }
    }
}
