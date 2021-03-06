package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command {

    private OI oi;
    private Drivetrain drivetrain;

    //Getting OI and Drivetrain instances to run commands with.
    public Drive(){

        oi = OI.getInstance();
        drivetrain = Drivetrain.getInstance();

        requires(drivetrain);

    }

    //Execute runs when the robot is active.
    // Here we call the setSpeed function from the Drivetrain Class, using values from the OI class's Joysticks.
    public void execute(){

        drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());

    }

    //We never want this command to stop, so we return false for the abstract isFinished method.
    @Override
    protected boolean isFinished() {

        return false;

    }
}