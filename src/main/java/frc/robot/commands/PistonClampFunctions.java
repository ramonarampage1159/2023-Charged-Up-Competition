// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class PistonClampFunctions extends CommandBase {
  /** Creates a new PistonClampFunctions. */
  public PistonClampFunctions() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_pistonClamp);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_leftBumper)){
      System.out.println("left bumper running, button pressed");
      Robot.m_pistonClamp.solenoid30Open();
      Robot.m_pistonClamp.solenoid60Off();
    } else if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_leftTrigger)){
      System.out.println("left trigger running, button pressed");
      Robot.m_pistonClamp.solenoid30Close();
      Robot.m_pistonClamp.solenoid60Off();
    } else if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_rightBumper)){
       System.out.println("right bumper running, button pressed");
       Robot.m_pistonClamp.solenoid60Open();
       Robot.m_pistonClamp.solenoid30Off();
    } else if (Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_rightTrigger)){
      System.out.println("right trigger running, button pressed");
      Robot.m_pistonClamp.solenoid60Close();
      Robot.m_pistonClamp.solenoid30Off();
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
