package Player_Statistics;

class cricketStats extends playerStats {
    int runs;
    int wickets;

    public cricketStats(String name, int age, int runs, int wickets) {
        super(name, age);
        this.runs = runs;
        this.wickets = wickets;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Cricket Stats: Runs: " + runs + ", Wickets: " + wickets);
    }
}
