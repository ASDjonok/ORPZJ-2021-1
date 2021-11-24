package ia91.suyusanova;
import java.util.Scanner;

/**
 * Класс Main
 * @autor Суюсанова Альбіна
 * @version 1.0
 */

public class Main {

    /**
     * Головна функція
     * Создає букет квітів та об'єкти роз і гвоздик
     * Додає квіти в букєт та виводе їх
     * Сортує квіти за рівнем життєвого вигляду
     * Пошук квітів, довжина яких лежить у діаапазоні мін-макс
     * Виводить квіти із заданого діапазону
     */

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Rose r1 = new Rose("red", 12, 30, 2);
        Rose r2 = new Rose("red", 19, 35, 2);
        Rose r3 = new Rose("red", 30, 50, 1);
        Carnation c1 = new Carnation("blue", 12, 9, 3);
        Carnation c2 = new Carnation("blue", 14, 1, 5);
        Carnation c3 = new Carnation("white", 30, 1, 4);
        bucket.addFlowerToBucket(r1);
        bucket.addFlowerToBucket(r2);
        bucket.addFlowerToBucket(r3);
        bucket.addFlowerToBucket(c1);
        bucket.addFlowerToBucket(c2);
        bucket.addFlowerToBucket(c3);

        for (Flower f: bucket.getBucketList()) {
            System.out.println(f.toString());
        }
        System.out.println("After sort\n");
        bucket.sortByLvl();
        
        for (Flower f: bucket.getBucketList()) {
            System.out.println(f.toString());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter down bound in diapason(min)");
        int min = scan.nextInt();

        System.out.println("Enter up bound in diapason(max)");
        int max = scan.nextInt();
        System.out.println(bucket.flowerInDiapason(min,max).toString());
    }
}
