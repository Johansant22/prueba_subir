import Strategy.AgressiveRobotBehavior;
import Strategy.DeffensiveRobotBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("roboto-E");
        roboto.setBehavior(new AgressiveRobotBehavior());
        roboto.move();
        Robot Walle = new Robot();
        Walle.setName("Wall-E");
        Walle.setBehavior(new DeffensiveRobotBehavior());
        roboto.move();
    }
// se puede crear más robots y sus comportamientos
}
