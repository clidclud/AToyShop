import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private List<Toy> toyList;
    private int remainingToys;

    public ToyBox() {
        this.toyList = new ArrayList<>();
        this.remainingToys = 0;
    }

    public void addToy(Toy toy) {
        toyList.add(toy);
        remainingToys = toyList.size();
    }

    public void removeToy(Toy toy) {
        if (toyList.contains(toy)) {
            toyList.remove(toy);
            remainingToys -= 1;
        }
    }

    public Toy getRandomToy() {
        if (remainingToys > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(toyList.size());
            Toy randomToy = toyList.get(randomIndex);
            return randomToy;
        } else {
            return null;
        }
    }

    public int getRemainingToys() {
        return remainingToys;
    }
}