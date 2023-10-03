public class StudentList{
    int ClassRoom1;
    int ClassRoom2;
    int ClassRoom3;
    int ClassRoom4;

    StudentList() {
        System.out.println("No parameter");
    }

    StudentList(int ClassRoom1) {
        this();
        System.out.println("Single parameter");
    }

    StudentList(int ClassRoom1, int ClassRoom2) {
        this(60);
        System.out.println("Two parameters");
    }

    StudentList(int ClassRoom1, int ClassRoom2, int ClassRoom3) {
        this(ClassRoom1, 70);
        System.out.println("Three parameters");
    }

    StudentList(int ClassRoom1, int ClassRoom2, int ClassRoom3, int ClassRoom4) {
        this(ClassRoom1, ClassRoom2, 80);
        System.out.println("Four parameters");
    }

    public static void main(String[] args) {
        new StudentList(76, 88, 76, 90);
    }
}
