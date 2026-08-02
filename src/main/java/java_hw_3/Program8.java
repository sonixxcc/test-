package java_hw_3;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        System.out.println("Please enter the name of the program you want to install");
        String nameOfTheProgram = aa.nextLine();

        System.out.println("Please enter your OS");
        String nameOfTheOs = aa.nextLine();

        String result = userFlow(nameOfTheProgram, nameOfTheOs);
        System.out.println(result);
    }

    public static String userFlow(String nameOfTheProgram, String nameOfTheOs) {

        switch (nameOfTheProgram) {

            case "IntelliJ IDEA":
                switch (nameOfTheOs) {

                    case "Linux":
                        return "https://www.jetbrains.com/idea/download/?section=linux";

                    case "MacOS":
                        return "https://www.jetbrains.com/idea/download/?section=mac";

                    case "Windows":
                        return "https://www.jetbrains.com/idea/download/?section=windows";

                    default:
                        return "The entered OS doesn't exist";
                }

            case "Git":
                switch (nameOfTheOs) {

                    case "Linux":
                        return "https://git-scm.com/download/linux";

                    case "MacOS":
                        return "https://git-scm.com/download/mac";

                    case "Windows":
                        return "https://git-scm.com/download/win";

                    default:
                        return "The entered OS doesn't exist";
                }

            case "Java":
                switch (nameOfTheOs) {

                    case "Linux":
                        return "https://www.oracle.com/java/technologies/downloads/#linux";

                    case "MacOS":
                        return "https://www.oracle.com/java/technologies/downloads/#macos";

                    case "Windows":
                        return "https://www.oracle.com/java/technologies/downloads/#windows";

                    default:
                        return "The entered OS doesn't exist";
                }

            default:
                return "The entered program doesn't exist";
        }
    }
}