import java.util.Comparator;

class StudentsByNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.name.compareTo(student2.name);
    }
}
