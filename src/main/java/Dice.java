import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numDice;

    public Dice() {
        this.numDice = 1;
    }

    public Dice(int rolls) {
        this.numDice = rolls;
    }

    public Integer tossAndSum() {
        Integer randN;
        Integer sum = 0;
        for (int i = 0; i < numDice; i++) {
            randN = random.nextInt(6) + 1;
            sum += randN;
        }
        System.out.println();
        return sum;
    }

}