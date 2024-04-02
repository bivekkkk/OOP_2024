package Player_Statistics;

public class Main {
    public static void main(String[] args) {
        footballStats footballPlayer = new footballStats("runner_1", 43, 197, 69);
        footballPlayer.displayStats();

        cricketStats cricketPlayer = new cricketStats("runner_2", 22, 891, 99);
        cricketPlayer.displayStats();
    }
}