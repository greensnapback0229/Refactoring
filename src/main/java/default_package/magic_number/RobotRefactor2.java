package default_package.magic_number;

public class RobotRefactor2 {
    //permute type code to `class`
    public enum Command{ //type code class
        WALK,
        STOP,
        JUMP;
    };

    private final String _name;

    public RobotRefactor2(String name){
        _name = name;
    }

    public void order(RobotRefactor2.Command command) {

        //change magic number to symbolic constant
        if (command == Command.WALK) {
            System.out.println(_name + " walks");
        } else if (command == Command.STOP) {
            System.out.println(_name + " stops");
        } else if (command == Command.JUMP) {
            System.out.println(_name + " jumps");
        } else {
            System.out.println("Command error.command = " + command);
        }
    }
}
