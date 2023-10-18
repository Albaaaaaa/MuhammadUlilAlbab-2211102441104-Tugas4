import greenfoot.*; 

public class MyWorld extends World
{
    
    public MyWorld()
    {    
        super(800, 450, 1); 
        GreenfootImage img = new GreenfootImage("sky.jpeg");
        prepare();
    }
    
    private void prepare()
    {
        Character character = new Character();
        addObject(character,311,365);
        character.setLocation(82,222);
        character.setLocation(60,274);
        character.setLocation(58,274);
        character.setLocation(53,333);
    }
    
    public void act (){
            if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Enemy(),853,Greenfoot.getRandomNumber(479));
        }
            if(Greenfoot.getRandomNumber(100)<1){
            addObject(new ObjectSpecial(),853,Greenfoot.getRandomNumber(479));
        }
    }
}

