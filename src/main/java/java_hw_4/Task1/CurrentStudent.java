package java_hw_4.Task1;

public class CurrentStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Optimus", "Prime", 1111);
        Student student2 = new Student ("Bumble", "Bee", 22);
        Student student3 = new Student ("Megatron", "Dread", 1102);
        Student student4 = new Student ("Jazz", "Sonic", 898);
        Student student5 = new Student ("Iron", "Hide", 567);

        System.out.println(student1);

        System.out.println(student1.studentsFullName());

        Student[] newArray = {student1,student2, student3,student4, student5};

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i].studentsFullName());

        }
    }
}