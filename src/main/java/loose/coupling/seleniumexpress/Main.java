package loose.coupling.seleniumexpress;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setCheat(new ScienceCheat());

        student.cheating();
    }
}
