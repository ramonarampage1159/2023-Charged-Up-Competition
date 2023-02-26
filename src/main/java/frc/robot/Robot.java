// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.MecanumDriver;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.ElbowSubsystem;
import frc.robot.subsystems.PistonClampSubsystem;
import frc.robot.subsystems.WristSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
 
 //Establishing instances of nessesarry classes 

 public static MecanumDrive m_robotDrive;
 public static DriveTrainSubsystem m_driveTrain = new DriveTrainSubsystem();

 public static MecanumDriver m_mecanumDriver = new MecanumDriver();

  public static PistonClampSubsystem m_pistonClamp = new PistonClampSubsystem();

  public static ElbowSubsystem m_elbow = new ElbowSubsystem();
  
  public static WristSubsystem m_wrist = new WristSubsystem();

  private Command m_autonomousCommand;

  public static RobotContainer m_robotContainer = new RobotContainer();
  
  
  

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    m_robotContainer = new RobotContainer();
   

  }

 
  
  @Override
  public void robotPeriodic() {
  
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    
    CommandScheduler.getInstance().cancelAll();
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    

  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}