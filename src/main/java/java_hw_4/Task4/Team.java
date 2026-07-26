package java_hw_4.Task4;

import java.util.Arrays;

public class Team {

    private Student[] students;

    public void addStudent(Student student) {
        if (students == null) {
            students = new Student[] {student};
            return;
        }
        Student[] newArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }

        newArray[newArray.length - 1] = student;
        students = newArray;
    }

    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
