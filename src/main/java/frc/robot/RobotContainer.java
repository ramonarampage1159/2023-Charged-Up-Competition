// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.MecanumDriver;
import frc.robot.commands.PistonClampFunctions;
import frc.robot.commands.PidCommands.ArmPID;

//import frc.robot.commands.ElbowFunctions;
//import frc.robot.commands.WristFunctions;

public class RobotContainer {
  private final SendableChooser<Command> m_chooser = new SendableChooser<>();

  public final Joystick driverController = new Joystick(Constants.DriverController.m_driverController);
  public final Joystick operatorController = new Joystick(Constants.OperatorController.m_operatorController);
 

  public double GetDriverRawAxis(int axis){
    return driverController.getRawAxis(axis);
     
  }
  
  public boolean getRawButtonPressed(int button){
    return operatorController.getRawButton(button);
  }
    
  public double GetOperatorRawAxis(int axis){
    return operatorController.getRawAxis(axis);
     
  }
  
  private void configureButtonBindings() {
    Robot.m_driveTrain.setDefaultCommand(new MecanumDriver());
    Robot.m_pistonClamp.setDefaultCommand(new PistonClampFunctions());
    //Robot.m_elbow.setDefaultCommand(new ElbowFunctions());
    //Robot.m_wrist.setDefaultCommand(new WristFunctions());
    Robot.m_elbow.setDefaultCommand(new ArmPID());
    Robot.m_wrist.setDefaultCommand(new ArmPID());

    //Commands.sequence()

   
    m_chooser.setDefaultOption("Auto Sequence 1", new frc.robot.commands.Auto.AutonSequences.AutonomousSequenceOne());
    m_chooser.addOption("Auto Sequence 2", new frc.robot.commands.Auto.AutonSequences.AutonomousSequenceTwo());
    SmartDashboard.putData(m_chooser);
  }

  public RobotContainer() {
   
    // Configure the button bindings
    configureButtonBindings();

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
  public Command getAutonomousCommand() {
    //An ExampleCommand will run in autonomous
    return m_chooser.getSelected();
  }
  
}