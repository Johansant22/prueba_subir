package Strategy;

public class NormalRobotBehavior implements RobotBehavior {

    @Override
    public int moveComand() {
        return 0;
    }

    @Override
    public String toString() {
        return "NormalRobotBehavior;" + "si encuentra otro robot ignorar";
    }
    
}
