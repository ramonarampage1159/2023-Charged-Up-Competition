// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auto.AutonSequences;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.commands.Auto.AutonDrive;

public class AutonomousSequenceOne extends SequentialCommandGroup {
  /** Creates a new AutonomousSequenceOne. */
  public AutonomousSequenceOne() {
    // Drive Backwards out of community 
    addCommands(
      new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeTwoSeconds,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoback, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero)
    );
  }    
   


}
