// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.PidCommands;

import com.revrobotics.CANSparkMax;

//import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
//import frc.robot.subsystems.ElbowSubsystem;

public class ElbowPID extends CommandBase {
  /** Creates a new ElbowPID. */
  public ElbowPID() {
    // Use addRequirements() here to declare subsystem dependencies.

    System.out.print("Elbow comand...");
    addRequirements(Robot.m_elbow);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //double p = SmartDashboard.getNumber("P Gain", 0);
    //double i = SmartDashboard.getNumber("I Gain", 0);
    //double d = SmartDashboard.getNumber("D Gain", 0);
    //double iz = SmartDashboard.getNumber("I Zone", 0);
    //double ff = SmartDashboard.getNumber("Feed Forward", 0);
    //double max = SmartDashboard.getNumber("Max Output", 0);
    //double min = SmartDashboard.getNumber("Min Output", 0);

    
    if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_yButton)){
      double rotations = SmartDashboard.getNumber("Set Rotations", 0);
      Robot.m_elbow.setElbowReference(rotations, CANSparkMax.ControlType.kPosition);

  
      System.out.println("rotations:"+ rotations);
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
