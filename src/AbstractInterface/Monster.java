package AbstractInterface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoint;
    private int strength;

    public Monster(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> monsters = new ArrayList<>();
        monsters.add(this.name);
        monsters.add(String.valueOf(this.hitPoint));
        monsters.add(String.valueOf(this.strength));
        return monsters;
    }

    @Override
    public void read(List<String> list) {

        if (list != null && list.size()>0){
            this.name = list.get(0);
            this.hitPoint = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name +
                "', hitPoint=" + hitPoint +
                ", strength=" + strength +
                '}';
    }
}
