import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private List<Toy> toyList;
    private int remainingToys;

    public ToyBox() {
        this.toyList = new ArrayList<>();
        initializeToyBox();
        this.remainingToys = toyList.size();
    }

    private void initializeToyBox() {
        toyList.add(new Toy(0, "Pop puck и магнитные кольца-антистресс – задачки на ловкость", 100));
        toyList.add(new Toy(1, "GooJitZu из «Гуджитсу»", 110));
        toyList.add(new Toy(2, "Осьминожки-вывернушки", 120));
        toyList.add(new Toy(3, "Игрушки с прозрачным корпусом и вращающимися шестеренками", 130));
        toyList.add(new Toy(4, "Infinity Nado по мотивам мультфильмов в жанре аниме", 140));
        toyList.add(new Toy(5, "Куклы-сюрприз", 150));
        toyList.add(new Toy(6, "Мягкие подушки-игрушки", 160));
        toyList.add(new Toy(7, "Вертолет на инфракрасном управлении", 170));
        toyList.add(new Toy(8, "Магнитные конструкторы", 180));
        toyList.add(new Toy(9, "«Умный зайка»", 190));
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