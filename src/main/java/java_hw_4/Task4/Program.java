package java_hw_4.Task4;

public class Program {
    public static void main(String[] args) {

        Student one = new Student("Bumble", "Bee");
        Student two = new Student("Optimus", "Prime");
        Student three = new Student("Megatron", "Dread");

        Team team = new Team();
        team.addStudent(one);
        team.addStudent(two);
        team.addStudent(three);

        System.out.println(team);

        team.showStudents();

    }
}
