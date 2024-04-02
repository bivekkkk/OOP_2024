package Player_Statistics;

class playerStats {
    String name;
    int age;

    public playerStats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayStats() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
