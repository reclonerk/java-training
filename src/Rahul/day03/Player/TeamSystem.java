package Rahul.day03.Player;

import java.util.ArrayList;

public class TeamSystem {
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();

    public  Boolean searchPlayer(String name, String type){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getName() == name && players.get(i).getTeam().getType() == type){
                System.out.println("We have player!");
                return true;
            }
        }
        return false;
    }

    public void printPlayers(){
        for(Player p : players){
            System.out.println(p);
        }
    }

    public void addTeam(Team t){
        teams.add(t);
    }

    public void addPlayer(Player p){
        players.add(p);
    }

}