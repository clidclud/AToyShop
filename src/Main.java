public class Main {
    public static void main(String[] args) {
        ToyBox toyBox = new ToyBox();
        addToyBox(toyBox);
        ManagerToys.playToySurprise(toyBox);
    }
    private static void addToyBox(ToyBox toyBox) {
        toyBox.addToy(new Toy(0, "Pop puck и магнитные кольца-антистресс – задачки на ловкость", 100));
        toyBox.addToy(new Toy(1, "GooJitZu из «Гуджитсу»", 110));
        toyBox.addToy(new Toy(2, "Осьминожки-вывернушки", 120));
        toyBox.addToy(new Toy(3, "Игрушки с прозрачным корпусом и вращающимися шестеренками", 130));
        toyBox.addToy(new Toy(4, "Infinity Nado по мотивам мультфильмов в жанре аниме", 140));
        toyBox.addToy(new Toy(5, "Куклы-сюрприз", 150));
        toyBox.addToy(new Toy(6, "Мягкие подушки-игрушки", 160));
        toyBox.addToy(new Toy(7, "Вертолет на инфракрасном управлении", 170));
        toyBox.addToy(new Toy(8, "Магнитные конструкторы", 180));
        toyBox.addToy(new Toy(9, "«Умный зайка»", 190));
    }
}