import java.lang.Thread;

public class Main {
    static Clicker autoClicker;
    static boolean isRunning = true;

    static int minutes = 10;
    static int delayInSeconds = 60*minutes;

    public static void main(String[] args) {
        autoClicker = new Clicker(delayInSeconds*1000);

        try { Thread.sleep(3000); }
        catch (Exception e) {}

        autoClicker.click(16, true);
    }
}