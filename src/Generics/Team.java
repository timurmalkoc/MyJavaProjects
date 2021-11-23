package Generics;

import java.util.ArrayList;

public class Team<T> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied =0;

    public Team(String name) {
        this.name = name;
    }

    ArrayList<T> team = new ArrayList<>();

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (team.contains(player)){
            System.out.println("player is already in the team");
            return false;
        }
        else if (player == null){
            System.out.println("null player");
            return false;
        }
        else
            team.add(player);
            return true;
    }

    public int teamSize(){
        return team.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
            System.out.println("We won !!");
        }
        else if (ourScore < theirScore){
            lost++;
            System.out.println("we lost !!");
        }
        else {
            tied++;
            System.out.println("It was tied");
        }

        if (opponent != null)
            opponent.matchResult(null,theirScore,ourScore);

    }


}
