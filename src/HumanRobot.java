public class HumanRobot implements RobotBodyInterface{
    private String type;
    private RobotBody robotBody;

    public HumanRobot(String type, RobotBody robotBody) {

        this.type = type;
        this.robotBody = robotBody;
    }

    @Override
    public void display(int x, int y) {
        //System.out.println("X co-ordinate is " + x + " and Y co-ordinate is " + y);
    }
}
