import java.awt.Robot;
import java.awt.event.*;

public class Clicker {
    Robot robot;
    int delay;

    public Clicker(int delay) {
        this.delay = delay;
        try {
            robot = new Robot();
        }catch (Exception e) {}
    }

    public void click(int button, boolean autoWalk) {
        try {
            if (autoWalk) {
                robot.keyPress(KeyEvent.VK_W);
            }
            robot.mousePress(button);
            robot.delay(delay);
            robot.keyRelease(KeyEvent.VK_W);
            robot.mouseRelease(button);
            robot.delay(100);
        }catch (Exception e) {}
    }
}