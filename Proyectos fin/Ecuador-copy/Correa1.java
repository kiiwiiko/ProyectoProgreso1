import greenfoot.*;  

public class Correa1 extends Actor
{
    public void act()
    {
        move(2); // Mueve Correa1 hacia la izquierda
        
        World m = getWorld();
        
        if (getY() >= m.getHeight() - 5 || getY() <= 5) {
            turn(180); // Gira 180 grados si llega al borde superior o inferior
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) { // Ajusta el número para controlar la frecuencia de aparición
            // Crea un objeto que cae desde la derecha de la pantalla y lo añade al mundo
            ObjetoCaido objetoCaido = new ObjetoCaido();
            m.addObject(objetoCaido, m.getWidth() - 1, Greenfoot.getRandomNumber(m.getHeight())); // Aparece en el lado derecho y en una posición vertical aleatoria
            
            // Configura velocidad y rotación aleatorias para que se vea como un meteorito
            int velocidad = Greenfoot.getRandomNumber(4) + 1; // Velocidad entre 1 y 5
            objetoCaido.setVelocity(velocidad);
            objetoCaido.setRotation(Greenfoot.getRandomNumber(360)); // Rotación aleatoria entre 0 y 359 grados
        }
    }
    
    // Clase interna para el objeto que cae
    private class ObjetoCaido extends Actor
    {
        private int velocidad = 1;
        
        public void setVelocity(int vel) {
            velocidad = vel;
        }
        
        public void act()
        {
            move(velocidad); // Mueve el objeto con la velocidad asignada
            
            if (getX() <= 0) {
                getWorld().removeObject(this); // Elimina el objeto que cae cuando llega al borde izquierdo
            }
        }
    }
}
