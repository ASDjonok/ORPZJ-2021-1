import java.util.Comparator;
import java.util.Arrays;

/**
 * Клас слугує для зберігання масиву об'єктів-студентів з властивостями
 *
 * @author Анастасія Гриценко
 * @version 1.0
 */
public class Student {
    /**
     * Поле - ім'я
     */
    public String name;
    /**
     * Поле - прізвище
     */
    public String surname;
    /**
     * Поле - вік
     */
    public int age;
    /**
     * Поле - номер у списку групи
     */
    public int group_num;
    /**
     * Поле - факультет
     */
    public String faculty;
    /**
     * Поле - курс
     */
    public int course;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name      - ім'я
     * @param surname   - прізвище
     * @param age       - вік
     * @param group_num - номер у списку групи
     * @param faculty   - факультет
     * @param course    - курс
     */
    public Student(String name, String surname, int age, int group_num, String faculty, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group_num = group_num;
        this.faculty = faculty;
        this.course = course;
    }

    /**
     * Функція отримання значення поля {@link Student#age}
     *
     * @return повертає вік студента
     */
    public int getAge() {
        return age;
    }

    /**
     * Функція отримання значення поля {@link Student#group_num}
     *
     * @return повертає номер студента у списку групи
     */
    public int getGroup_num() {
        return group_num;
    }

    /**
     * Головний метод програми.
     * Створює масив з 7 об'єктів та встановлює для них значення властивостей.
     * Сортує об'єкти за віком {@link Student#getAge()} у порядку зростання та за номером у списку групи {@link Student#getGroup_num()} у порядку спадання за допомогою Comparator.
     * Виводить на екран відсортований масив об'єктів.
     */
    public static void main(String[] args) {

        Student[] students = {
                new Student("Anastasia", "Gritsenko", 19, 6, "FIOT", 3),
                new Student("Uliana", "Dzhigil", 18, 8, "FIOT", 3),
                new Student("Albina", "Suyusanova", 20, 25, "FIOT", 3),
                new Student("Egor", "Sidorchuk", 16, 4, "FBMI", 1),
                new Student("Alex", "Ivanov", 22, 11, "FSP", 4),
                new Student("Nikita", "Mironov", 17, 2, "TEF", 1),
                new Student("Mark", "Ponomaryov", 24, 32, "FBMI", 4)};


        Comparator<Student> studentsComparator
                = Comparator.comparing(Student::getAge);
        Arrays.sort(students, studentsComparator);

        System.out.println("Сортування масиву за віком");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].surname + " - " + students[i].age);
        }

        System.out.println("---------------------");

        Comparator<Student> studentsComparator2
                = Comparator.comparing(Student::getGroup_num).reversed();
        Arrays.sort(students, studentsComparator2);

        System.out.println("Сортування масиву за номером у групі");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].surname + " - " + students[i].group_num);
        }
    }
}
