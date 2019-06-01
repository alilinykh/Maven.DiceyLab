import java.util.Random;

public class Bins {
    private int dice;
    private int roll;
    private int [] arr;

    public Bins () {
        dice = 2;
        roll = 12;
    }

    public Bins (int numDice, int numRolls) {
        this.dice = numDice;
        this.roll = numRolls;
        this.arr = new int[(dice * 6) + 1];
        Dice d = new Dice(dice);
        for (int i = 0; i < roll; i++) {
            int num = d.tossAndSum();
            arr[num]++;
        }

    }
    public void incrementBin(int num) {
        arr[num]++;
    }

    public Integer getBin(int num) {
        //System.out.println(arr[num]);
        return arr[num];
    }
}
