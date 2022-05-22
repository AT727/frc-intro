package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.subsystems.drivetrain.commands.TurnByAngle;
import frc.robot.subsystems.drivetrain.commands.TurnToAngle;

public class StandardAuto extends SequentialCommandGroup {
    public StandardAuto(Intake intake){
        addCommands(
          new RunCommand(() ->
            {
              intake.execute(1);
            }),
          
          new RunCommand(()->
            {
              intake.end();
            })
          
        );

        addRequirements(intake);
    }
}
