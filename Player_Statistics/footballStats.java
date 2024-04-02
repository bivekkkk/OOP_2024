package Player_Statistics;

class footballStats extends playerStats {
    int goals;
    int assists;

    public footballStats(String name, int age, int goals, int assists) {
        super(name, age);
        this.goals = goals;
        this.assists = assists;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Football Stats: Goals: " + goals + ", Assists: " + assists);
    }
}