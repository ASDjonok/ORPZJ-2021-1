package ia91.suyusanova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Клас букет з масивом квітів
 */

public class Bucket {

    /** Поле списка квітів */
    private List<Flower> bucketList = new ArrayList<>();

    /**
     * Функція гетер букету
     * @return повертає bucketList квітів
     */
    public List<Flower> getBucketList() {
        return bucketList;
    }

    /**
     * Функція додавання квітів у букет
     */
    public void addFlowerToBucket(Flower fl) {
        this.bucketList.add(fl);
    }

    /**
     * Сортування за рівнем свіжості
     */
    public void sortByLvl()
    {
        Collections.sort(bucketList, new Comparator() {
            public int compare(Object o1, Object o2) {// сортировка
                Integer x1 = ((Flower) o1).getLvlLife();
                Integer x2 = ((Flower) o2).getLvlLife();
                return x1.compareTo(x2);
            }
        });
    }

    /**
     * Функція визначення ціни
     */
    public double getPrice()
    {
        double sum = 0;
        for (Flower fl :
                bucketList) {
            sum += fl.getPrice();
        }
        return sum;
    }

    /**
     * Знаходимо квіти в діапазоні від мін до дакс
     */
    public Flower flowerInDiapason(int min, int max)
    {
        for (Flower fl :
                bucketList) {
            if (fl.getLength() >= min || fl.getLength() <= max)
            {
                return fl;
            }
        }
        return null;
    }
}
