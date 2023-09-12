package Strategy;
public class Robot {
    private RobotBehavior behavior;
    private String name;
    public Robot () {}
    public RobotBehavior getBehavior() {
        return behavior;
    }
    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void move () {
        int comand = behavior.moveComand();
        System.out.println("Move command: " 
        + comand + ". " + behavior.toString());
    }
}