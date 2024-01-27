public class Toy implements Comparable<Toy> {
    int id;
    String name;
    int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Игрушка {" +
                "ID: " + id +
                ", Название: " + name +
                ", Вес: " + weight +
                '}';
    }
}