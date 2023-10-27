import greenfoot.*;

public class Correa extends Actor {
    private static final int SPEED = 2;

    public void act() {
        move(SPEED);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
