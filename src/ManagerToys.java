import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ManagerToys {

    public static void playToySurprise(ToyBox toyBox) {

        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Toy> toysForDelivery = new PriorityQueue<>();

        while (true) {
            System.out.println("Введите номер команды\n1. Выиграть игрушку\n2. Выйти и сохранить список выйгранных игрушек");
            try {
                int input = scanner.nextInt();
                if (input == 1) {
                    if (toyBox.getRemainingToys() == 0) {
                        System.out.println("Игрушки закончились, для выхода нажмите 2");
                        continue;
                    }
                    Toy winningToy = toyBox.getRandomToy();
                    toysForDelivery.add(winningToy);
                    toyBox.removeToy(winningToy);
                    System.out.println("Игрушка выиграна и добавлена в список");
                } else if (input == 2) {
                    if (!toysForDelivery.isEmpty()) {
                        try {
                            FileWriter writer = new FileWriter("toys_delivery.txt");
                            for (Toy t : toysForDelivery) {
                                writer.write(t.toString() + "\n");
                            }
                            writer.close();
                            System.out.println("Данных сохранены\nПрограмма завершена");
                            break;
                        } catch (IOException e) {
                            System.out.println("Ошибка при записи в файл: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Программа завершена");
                        break;
                    }
                } else {
                    System.out.println("Ошибка: Введите 1 или 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите 1 или 2");
                scanner.next();
            }
        }
        scanner.close();
    }
}
