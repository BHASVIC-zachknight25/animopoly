import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private String name;
    private String token;
    private int money;
    private boolean playing;
    public Player(String playerName, String playerToken){
        name = playerName;
        if(playerToken.equals("*") || playerToken.equals("!")){
            token = playerToken;
        }
        else{
            token = "*";
        }
        money = 1500;
        playing = true;
    } 
    public String getName(){
        return name;
    }
    public String getToken(){
        return token;
    }
    public int getMoney(){
        return money;
    }
    public boolean isPlaying(){
        return playing;
    }
    public void addMoney(int amount){
        if(playing){
            money = money + amount;
        }
    }
    public void removeMoney(int amount){
        if(playing){
            money = money - amount;
            if(money <= 0){
                money = 0;
                playing = false;
                System.out.println(name + " has lost the game.");
            }
        }
    }
    public void takeTurn(){
        System.out.println("It is " + name + "'s turn.");
        System.out.println("Playing piece: " + token);
        System.out.println("Money: £" + money);
    }
}
