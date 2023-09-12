package Strategy;

public class AgressiveRobotBehavior implements RobotBehavior {

    @Override
    public int moveComand() {
        return 1;
    }

    @Override
    public String toString() {
        return "AgressiveRobotBehavior;" + "si encuentra otro robot ataca";
    }
    
}
