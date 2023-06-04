import java.util.HashMap;

public class RobotFactory {

    HashMap<String,RobotBodyInterface> robotObject = new HashMap<>();

    public RobotBodyInterface getObject(String typeOfRobot){
        //System.out.println("Type of Robot is " + typeOfRobot);
        if(robotObject.containsKey(typeOfRobot)){
            System.out.println("Returning object of " + typeOfRobot);
            return robotObject.get(typeOfRobot);
        }
        else if(typeOfRobot=="Human-Robot"){
            System.out.println("Creating Human Robot object");
            robotObject.put("Human-Robot",new HumanRobot("Human-Robot",new RobotBody()));
            return robotObject.get(typeOfRobot);
        }
        else{
            System.out.println("Creating Animal Robot object");
            robotObject.put("Animal-Robot",new AnimalRobot("Animal-Robot",new RobotBody()));
            return robotObject.get(typeOfRobot);
        }
    }
}
