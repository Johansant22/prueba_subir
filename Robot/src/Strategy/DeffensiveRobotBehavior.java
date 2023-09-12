package Strategy;

public class DeffensiveRobotBehavior implements RobotBehavior {

    @Override
    public int moveComand() {
        return -1;
    }

    @Override
    public String toString() {
        return "DeffensiveRobotBehavior " + "si encuentra otro robot corre";
    }
    
}
