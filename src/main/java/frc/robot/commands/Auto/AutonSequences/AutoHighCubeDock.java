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


public class AutoHighCubeDock extends SequentialCommandGroup {
  
  public AutoHighCubeDock() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new SequentialCommandGroup(

     new AutonWrist(0.35, 2.2),

     new WaitCommand(0.3),

     new AutonElbow(0.25, 5.5),

     new WaitCommand(0.3),

     new AutonWrist(0.37, 3.6),

     new WaitCommand(0.3),

     new AutonElbow(0.31, 10.5),

     new WaitCommand(0.4),

     new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeOneSeconds,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoPos,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero),

     new WaitCommand(0.3),

     new AutonClamp(),

     new WaitCommand(0.35),

     new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeOneSeconds,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoback,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero),

     new WaitCommand(0.35),

     new AutonWrist(0.35, 2.2),
      
     new WaitCommand(0.3),

     new AutonWrist(0.1, 0),

     new WaitCommand(0.3),

     new AutonElbow(0.15, 0),

     new WaitCommand(0.4),

     new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeFiveSeconds,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoback,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero),

     new WaitCommand(0.2),

     new AutonDrive(Constants.AutonomousValues.AutoTimes.m_autonomousTimeFourSeconds,
     Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_yAutoPos,
      Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_xAutoZero, Constants.AutonomousValues.MotorSpeeds.DriveMotors.m_zAutoZero)
    )
   );
  
  }
}
