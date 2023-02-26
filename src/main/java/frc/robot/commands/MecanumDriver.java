// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;


public class MecanumDriver extends CommandBase {
  /** Creates a new MecanumDrive. */
  public MecanumDriver() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_driveTrain);

  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {

    double leftStickX = -(Robot.m_robotContainer.GetDriverRawAxis(Constants.DriverController.Joystick.m_leftStickX));
    double leftStickY = (Robot.m_robotContainer.GetDriverRawAxis(Constants.DriverController.Joystick.m_leftStickY));
    double leftStickZ = (Robot.m_robotContainer.GetDriverRawAxis(Constants.DriverController.Joystick.m_rightStickX));
    
    Robot.m_driveTrain.setMotorSpeed(leftStickX, leftStickY, leftStickZ);

    MathUtil.applyDeadband(leftStickY, Constants.m_deadbandvalue);
    MathUtil.applyDeadband(-leftStickX, Constants.m_deadbandvalue);
    MathUtil.applyDeadband(leftStickZ, Constants.m_deadbandvalue);

    
  }

 
  @Override
  public void end(boolean interrupted) {
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
 

}