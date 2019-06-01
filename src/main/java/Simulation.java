public class Simulation {
    private int roll;
    private int dice;
    private int[] arr;
    private Bins result;

    public Simulation(int d, int r) {
        this.dice = d;
        this.roll = r;
        this.arr = new int[(dice * 6) + 1];
        this.result = new Bins();
    }

    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 100000);

        sim.runSimulation();

        sim.printResults();
    }
    public void runSimulation(){
        result = new Bins(dice,roll);

    }
    public void printResults() {
        System.out.println("\n\n");
        for (int i = dice; i < arr.length; i++) {
            int resultNum = result.getBin(i);
            System.out.printf("%7d : %7d :  %.2f       ",i,resultNum,(double)resultNum/roll);
            for (int j = 0; j < resultNum; j = j + 1000) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}