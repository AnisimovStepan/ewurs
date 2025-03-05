import java.util.ArrayList;

public class ComparatorMain {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Юлия", 24));
        students.add(new Student("Алина", 27));
        students.add(new Student("Евгений", 18));

        StudentsByNameComparator studentsByNameComparator = new StudentsByNameComparator();

        students.sort(studentsByNameComparator);

        for (Student student : students) {
            System.out.println(student.name + ", " + student.age);
        }
    }
}
