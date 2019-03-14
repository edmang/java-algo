import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        boolean infinity = true;
        try {
            Robot robot = new Robot();
            moveTheMouse(robot);



        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void moveTheMouse(Robot robot) throws InterruptedException {
        int xCordStart = 683;
        int yCordStart = 384;

        robot.mouseMove(xCordStart, yCordStart);
        TimeUnit.SECONDS.sleep(2);
        robot.mouseMove(xCordStart + new Random().nextInt(100), yCordStart + new Random().nextInt(100));
        TimeUnit.SECONDS.sleep(2);
    }
}

