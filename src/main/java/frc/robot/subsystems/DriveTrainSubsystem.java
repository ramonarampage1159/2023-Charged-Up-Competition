// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveTrainSubsystem extends SubsystemBase {
  private CANSparkMax frontLeft = new CANSparkMax(Constants.Motors.DriveMotors.m_frontleft,MotorType.kBrushless);
  private CANSparkMax rearLeft = new CANSparkMax(Constants.Motors.DriveMotors.m_rearleft, MotorType.kBrushless);
  private CANSparkMax frontRight = new CANSparkMax(Constants.Motors.DriveMotors.m_frontRight, MotorType.kBrushless);
  private CANSparkMax rearRight = new CANSparkMax(Constants.Motors.DriveMotors.m_rearRight, MotorType.kBrushless);
  
  /** Creates a new DriveTrain. */
  public DriveTrainSubsystem() {
    Robot.m_robotDrive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);
   //setDefaultCommand(new MecanumDriver());
   rearRight.setInverted(true);
   frontRight.setInverted(true);

   
   
  }

  @Override
  public void periodic() {
    
  }

  public void setMotorSpeed(double xAxis, double yAxis, double  zAxis){
    Robot.m_robotDrive.driveCartesian(xAxis, yAxis, zAxis);
  } 
}