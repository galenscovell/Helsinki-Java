
/**
 * Main class for Ex90, creating teams and players
 */

public class Main {

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        barcelona.setMaxSize(3);

        Player matti = new Player("Matti");
        Player pekka = new Player("Pekka", 39);
        Player joni = new Player("Joni", 48);

        barcelona.addPlayer(matti);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.addPlayer(joni);

        System.out.println("Number of players: " + barcelona.size());
        System.out.println("Total player goals: " + barcelona.totalGoals());
    }
}