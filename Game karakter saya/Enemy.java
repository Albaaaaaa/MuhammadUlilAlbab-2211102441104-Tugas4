import greenfoot.*; 

public class Enemy extends Actor
{
    public Enemy(){
        GreenfootImage img = this.getImage();
        img.scale(200,100);
        this.setImage(img);
    }
    public void act()
    {
        move(-6);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
