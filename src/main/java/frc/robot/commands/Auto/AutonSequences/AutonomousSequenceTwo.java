// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
 
package frc.robot.commands.Auto.AutonSequences;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.commands.Auto.AutonClamp;
import frc.robot.commands.Auto.AutonDrive;
import frc.robot.commands.Auto.AutonElbow;
import frc.robot.commands.Auto.AutonWrist;


public class AutonomousSequenceTwo extends SequentialCommandGroup {
  
  public AutonomousSequenceTwo() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new SequentialCommandGroup(
     new AutonElbow(0.15, 5.5),
     new WaitCommand(0.5),
      new AutonWrist(0.15, 2.7),
      new WaitCommand(0.5),
      new AutonClamp(),
      new WaitCommand(0.5),
      new AutonWrist(0, 0),
      new WaitCommand(0.5),
      new AutonElbow(0, 0),
      new WaitCommand(0.5),
      new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeOneSeconds,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoback,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero)
    
     )
     );
  }
}
