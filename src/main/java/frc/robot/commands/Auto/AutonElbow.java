// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Auto;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class AutonElbow extends CommandBase {
  /** Creates a new AutonArm. */

  double m_pValue;
  double m_rotations;

  public AutonElbow(double pValue, double rotations) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_elbow);

    m_pValue = pValue;
    m_rotations = rotations;



  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    Robot.m_elbow.setAutoPIDValues(m_pValue);
    Robot.m_elbow.setElbowReference(m_rotations, CANSparkMax.ControlType.kPosition);

   System.out.println("elbow execute");

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    System.out.println("elbow finished");
    return true;
  }
}
