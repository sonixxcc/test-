package java_hw_5.Task3;

public class Program {
    public static void main(String[] args) {

        Music song = new Music("Trouble Man", 3, "Marvin Gaye");
        Video videoClip = new Video("Marvin Gaye - Trouble Man", 3, "1920x1080");

        song.play();
        videoClip.play();

    }
}
