package Rahul.day02.Robot;

public class Robot {
    String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) throws RobotException{
        if(position != "straight"){
            throw new RobotException("Abnormal Condition");
        }else{
            this.position = position;
        }

    }
}
