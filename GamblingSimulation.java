public class GamblingSimulation {
    public static void main(String[] args) {
        System.out.println("*Welcome To Gambling*");
        GamblingStimulation G = new GamblingStimulation();
        G.winOrLose();
    }
    void winOrLose(){
        int stakePerDay = 100;
        int bet = 1;
        System.out.println("Stake per day: $"+stakePerDay);
        System.out.println("Bet in each game: $"+bet);
    }
}
