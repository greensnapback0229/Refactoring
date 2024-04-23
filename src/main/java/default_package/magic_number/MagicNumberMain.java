package default_package.magic_number;

public class MagicNumberMain {
    public void run(){

    //  <<Before refactor>>
        /*Robot robot = new Robot("Andrew");
        robot.order(0); //walk
        robot.order(1); //stop
        robot.order(2); //jump*/

    //  <<After refactor1>>
        RobotRefactor1 robotRefactor1 = new RobotRefactor1("Andrew");
        robotRefactor1.order(robotRefactor1.COMMAND_WALK); //walk
        robotRefactor1.order(robotRefactor1.COMMAND_STOP); //stop
        robotRefactor1.order(robotRefactor1.COMMAND_JUMP); //jump

    //  <<After refactor2>>
        RobotRefactor2 robotRefactor2 = new RobotRefactor2("Andrew");
        robotRefactor2.order(RobotRefactor2.Command.WALK);
        robotRefactor2.order(RobotRefactor2.Command.STOP);
        robotRefactor2.order(RobotRefactor2.Command.JUMP);

    }
}
