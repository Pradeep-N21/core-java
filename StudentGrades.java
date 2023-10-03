public class StudentGrades {
    int math;
    int science;
    int history;
    int english;

    StudentGrades() {
        System.out.println("No parameter");
    }

    StudentGrades(int math) {
        this();
        System.out.println("Single parameter");
    }

    StudentGrades(int math, int science) {
        this(95);
        System.out.println("Two parameters");
    }

    StudentGrades(int math, int science, int history) {
        this(math, 88);
        System.out.println("Three parameters");
    }

    StudentGrades(int math, int science, int history, int english) {
        this(math, science, 78);
        System.out.println("Four parameters");
    }

    public static void main(String[] args) {
        new StudentGrades(90, 85, 75, 88);
    }
}
