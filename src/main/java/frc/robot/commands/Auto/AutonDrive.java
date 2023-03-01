// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class AutonDrive extends CommandBase {
  /** Creates a new AutonDrive. */
  Timer m_timer = new Timer();
  double m_time;
  double m_xAxis;
  double m_yAxis;
  double m_zAxis;
  public AutonDrive(double time, double xAxis, double yAxis, double zAxis) {
    // Use addRequirements() here to declare subsystem dependencies.

    m_time = time;
    m_xAxis = xAxis;
    m_yAxis = yAxis;
    m_zAxis = zAxis;

    addRequirements(Robot.m_driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.m_driveTrain.setMotorSpeed(m_xAxis, m_yAxis, m_zAxis);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
 if (m_timer.hasElapsed(m_time)){
      Robot.m_driveTrain.setMotorSpeed(0 , 0, 0);
      return true;
    }else{
    return false;
  }
 }  
}
