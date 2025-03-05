import java.lang.Comparable;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        if (age < other.age) return -1;
        if (age > other.age) return 1;
        // age == other.age
        return 0;

        // return this.age - other.age; // Сортировка по возрасту упрощённая
    }
}
