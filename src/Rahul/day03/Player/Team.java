package Rahul.day03.Player;

public class Team {
    public String type;
    public int numberOfPlayers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "type='" + type + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }
}
