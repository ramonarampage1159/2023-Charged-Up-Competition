// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auto.AutonSequences;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
//import edu.wpi.first.wpilibj2.command.WaitCommand;
//import frc.robot.Constants;
//import frc.robot.commands.Auto.AutonClamp;
import frc.robot.commands.Auto.AutonElbow;

public class AutonomousSequenceOne extends SequentialCommandGroup {
  public AutonomousSequenceOne() {  
    // Drive Backwards out of community 
    addCommands(
    new SequentialCommandGroup(
     new AutonElbow(0.15, 6)
    )
    );
  }    
   
}
