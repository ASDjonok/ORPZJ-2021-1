import java.util.Arrays;
import java.util.Comparator;

public class lab6 {
    public static void main(String[] args) {
        class Stone {
            private final String title;
            private int value;
            private double massa;
            private double transparency;

            public Stone(String title, int value, double massa, double transparency) {
                this.title = title;
                this.value = value;
                this.massa = massa;
                this.transparency = transparency;
            }
            public void show(){
                System.out.println(String.join(" ", this.title, this.value + " " + this.massa + " " + this.transparency));
            }
            public int getValue() {
                return this.value;
            }
        }
        class metalStone extends Stone {
            public metalStone(String title, int value, double massa, double transparency) {
                super(title, value, massa, transparency);
            }
        }
        class naturalStone extends Stone {

            public naturalStone(String title, int value, double massa, double transparency) {
                super(title, value, massa, transparency);
            }
        }
        class mineralStone extends Stone {

            public mineralStone(String title, int value, double massa, double transparency) {
                super(title, value, massa, transparency);
            }
        }
        Stone[] stones = {
                new naturalStone("Agat", 1, 10, 10),
                new mineralStone("Akvamarine", 5, 20, 15),
                new metalStone("Gold", 7, 15, 30),
                new metalStone("Silver", 6, 20, 25),
                new metalStone("Bronze", 4, 9, 50),
        };

        double transparency1 = 15;
        double transparency2 = 30;
        int n = 0;
        Stone [] listStones = new Stone[30];
        for (int i = 0; i < stones.length; i++) {
            if (stones[i].transparency >= transparency1 && stones[i].transparency <= transparency2){
                listStones[n] = stones[i];
                n++;
            }
        }
        Stone [] necklace = new Stone[n];
        for (int i = 0; i < n; i++){
            necklace[i] = listStones[i];
        }
        Arrays.sort(necklace, Comparator.comparing(Stone::getValue).reversed());
        for (int i = 0; i < necklace.length; i++){
            necklace[i].show();
        }
        double salary = 0;
        for (int i = 0; i < necklace.length; i++){
            salary += necklace[i].getValue();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Salary: " + salary);
    }
}