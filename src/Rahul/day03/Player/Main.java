package Rahul.day03.Player;

public class Main {


    public static void main(String[] args) {

        TeamSystem ts = new TeamSystem();

        Team t1 = new Team();
        t1.setNumberOfPlayers(11);
        t1.setType("Cricket");

        Player p1 = new Player();
        p1.setName("Rahul");
        p1.setTeam(t1);

        ts.addPlayer(p1);


        Team t2 = new Team();
        t2.setNumberOfPlayers(8);
        t2.setType("Football");

        Player p2 = new Player();
        p2.setName("Hello");
        p2.setTeam(t2);

        ts.addPlayer(p2);



        ts.printPlayers();

        ts.searchPlayer("Rahul", "Cricket");
    }
}