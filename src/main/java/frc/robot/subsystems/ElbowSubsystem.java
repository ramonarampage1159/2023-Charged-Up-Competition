// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import com.revrobotics.SparkMaxPIDController ;
//import com.revrobotics.RelativeEncoder;

import frc.robot.Constants;
//import frc.robot.Robot;

public class ElbowSubsystem extends SubsystemBase {
  /** Creates a new ElbowSubsystem. */   

  private CANSparkMax elbowLeft = new CANSparkMax(Constants.ElbowMotors.m_elbowLeft, MotorType.kBrushless);
  private CANSparkMax elbowRight = new CANSparkMax(Constants.ElbowMotors.m_elbowRight, MotorType.kBrushless);

  //private SparkMaxPIDController m_elbowPidController;
 // private RelativeEncoder m_elbowEncoder;

  //public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;


  MotorControllerGroup m_elbowMotors = new MotorControllerGroup(elbowLeft, elbowRight);

  
   


  public ElbowSubsystem() {
    //elbowRight.follow(elbowLeft);
    elbowRight.setInverted(true);
    elbowLeft.setInverted(false);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotorSpeed(double opLeftStickY) {
    m_elbowMotors.set(opLeftStickY);
  }


  
}
