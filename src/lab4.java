import java.util.Arrays;
import java.util.Comparator;

public class lab4 {
    public static void main(String [] args){
        class Student{
            private final String name;
            private final String lastname;
            private final int age;
            private final String gender;
            private final String speciality;
            private final String group;

            public Student(String name, String lastname, int age, String gender, String speciality, String group){
                this.name = name;
                this.lastname = lastname;
                this.gender = gender;
                this.age = age;
                this.speciality = speciality;
                this.group = group;
            }
            public void show(){
                System.out.println(String.join(" ", this.name, this.lastname + " " + this.age, this.gender, this.speciality, this.group));
            }
            public String getName(){
                return this.name;
            }
            public Integer getAge(){
                return this.age;
            }
        }

        Student[] students = {
                new Student("Anna", "Galchinskaya", 17, "m", "123", "IV-93"),
                new Student("Natalia", "Kazanovskaya", 19, "w", "121", "IP-93"),
                new Student("Boris", "Vandilovskiy", 18, "m", "123", "IO-91"),
                new Student("Alexandr", "Smirnov", 20, "w", "123", "IV-91"),
        };
        /*for(int i = 0; i < students.length; i++) {
            students[i].show();
        }*/
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
        for(int i = 0; i < students.length; i++) {
            students[i].show();
        }

        System.out.println();
        Arrays.sort(students, Comparator.comparing(Student::getName).reversed());
        for(int i = 0; i < students.length; i++) {
            students[i].show();
        }

    }
}
