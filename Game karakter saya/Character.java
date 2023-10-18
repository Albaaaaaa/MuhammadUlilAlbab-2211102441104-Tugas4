import greenfoot.*;

public class Character extends Actor
{
    private int score = 0;
    int lastNameNo = 1;
    int animationDelay = 10;
    
    public Character(){
        setImage("character.png");
        GreenfootImage img = this.getImage();
        img.scale(120,120);
        this.setImage(img);
    }
    
    
    
    public void act()
    {
        if (isTouching(Enemy.class)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new game_over());
            Greenfoot.playSound("death.mp3");
        }
        if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+10);
        }
        if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-10);
        }
        checkForCollision();
        
        animate();
        super.act();
    }
    
    
    
    void animate(){
        if(animationDelay<10){
            animationDelay++;
            return;
        }
        animationDelay = 0;
        if(lastNameNo==4){
            lastNameNo = 1;
        }else{
            lastNameNo++;
        }
        
        this.setImage(new GreenfootImage("naga"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(120,120);
        this.setImage(img);
    }
    
    
    
    public void checkForCollision(){
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
    }
    
    
    
    
    
    public void increaseScore(){
        score += 10;
        getWorld().showText("Score: " + score,50, 25);
    }
}
