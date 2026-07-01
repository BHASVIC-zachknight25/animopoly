import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager extends Actor
{
    private Player[] players;
    private int currentPlayer;
    public GameManager(){
        players = new Player[2];
        players[0] = new Player("Player 1", "*");
        players[1] = new Player("Player2", "!");
        currentPlayer = 0;
    }
    public void nextTurn(){
        if(players[currentPlayer].isPlaying()){
            players[currentPlayer].takeTurn();
        }
        currentPlayer++;
        if(currentPlayer >= players.length){
            currentPlayer = 0;
        }
        checkWinner();
    }
    public void checkWinner(){
        int playersLeft = 0;
        Player winner = null;
        for(int i = 0; i < players.length; i++){
            if(players[i].isPlaying()){
                playersLeft++;
                winner = players[i];
            }
        }
        if(playersLeft == 1){
            System.out.println(winner.getName() + " has won the game!");
        }
    }
    public Player getPlayer(int index){
        return players[index];
    }
    public int getCurrentPlayer(){
        return currentPlayer;
    }
}
