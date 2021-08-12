package Rahul.day02.Robot;

public class TestMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        try {
            robot.setPosition("left");
        } catch (RobotException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println(robot.getPosition());
        }
    }
}
