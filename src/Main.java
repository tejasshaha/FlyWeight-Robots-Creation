public class Main {
    public static void main(String[] args) {

        //Creating Human Robots
        RobotFactory robotFactory = new RobotFactory();
        for(int i=0;i<10;i++){
            RobotBodyInterface robotBodyInterface = robotFactory.getObject("Human-Robot");
            robotBodyInterface.display(i+1,i+1);
        }

        //Creating Animal Robots
        for(int i=0;i<10;i++){
            RobotBodyInterface robotBodyInterface = robotFactory.getObject("Animal-Robot");
            robotBodyInterface.display(i+1,i+1);
        }
    }
}
