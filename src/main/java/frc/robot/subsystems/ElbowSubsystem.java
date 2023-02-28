// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import com.revrobotics.RelativeEncoder;

import frc.robot.Constants;
//import frc.robot.Robot;

public class ElbowSubsystem extends SubsystemBase {
  /** Creates a new ElbowSubsystem. */   

  private CANSparkMax elbowLeft = new CANSparkMax(Constants.ElbowMotors.m_elbowLeft, MotorType.kBrushless);
  private CANSparkMax elbowRight = new CANSparkMax(Constants.ElbowMotors.m_elbowRight, MotorType.kBrushless);

  private SparkMaxPIDController m_elbowLeftPidController;
  private SparkMaxPIDController m_elbowRightPidController;

  //private RelativeEncoder m_elbowLeftEncoder;
  //private RelativeEncoder m_elbowRightEncoder;


  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;


  MotorControllerGroup m_elbowMotors = new MotorControllerGroup(elbowLeft, elbowRight);

  public ElbowSubsystem() {    
    //elbowRight.follow(elbowLeft);

    System.out.println("ElbowSubsystem Initiated");
    elbowRight.setInverted(true);
    elbowLeft.setInverted(false);

    m_elbowLeftPidController = elbowLeft.getPIDController();
    m_elbowRightPidController = elbowRight.getPIDController();
    //m_elbowLeftEncoder = elbowLeft.getEncoder();
    //m_elbowRightEncoder = elbowRight.getEncoder();
    
    kP = Constants.ElbowPIDCoefficients.m_ElbowkP; 
    kI = Constants.ElbowPIDCoefficients.m_ElbowkI;
    kD = Constants.ElbowPIDCoefficients.m_ElbowkD; 
    kIz = Constants.ElbowPIDCoefficients.m_ElbowkIz; 
    kFF = Constants.ElbowPIDCoefficients.m_ElbowkFF; 
    kMaxOutput = Constants.ElbowPIDCoefficients.m_ElbowkMaxOutput; 
    kMinOutput = Constants.ElbowPIDCoefficients.m_ElbowkMinOutput;

    setPIDValues(kP,kI,kD,kIz,kFF,kMinOutput,kMaxOutput);

  

    SmartDashboard.putNumber("Elbow P Gain", kP);
    SmartDashboard.putNumber("Elbow I Gain", kI);
    SmartDashboard.putNumber("Elbow D Gain", kD);
    SmartDashboard.putNumber("Elbow I Zone", kIz);
    SmartDashboard.putNumber("Elbow Feed Forward", kFF);
    SmartDashboard.putNumber("Elbow Max Output", kMaxOutput);
    SmartDashboard.putNumber("Elbow Min Output", kMinOutput);
    SmartDashboard.putNumber("Elbow Set Rotations", 0);
 
  
    
    
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotorSpeed(double opLeftStickY) {
    m_elbowMotors.set(opLeftStickY);
  }

  public void setElbowReference(double speed, CANSparkMax.ControlType type) {

    m_elbowLeftPidController.setReference(speed, type);
    m_elbowRightPidController.setReference(speed, type);

  }
 
  public void setPIDValues(double kP, double kI, double kD, double kIz, double kFF, double kMinOutput, double kMaxOutput){

    System.out.println("setting PID Values");

    m_elbowLeftPidController.setP(kP);
    m_elbowLeftPidController.setI(kI);
    m_elbowLeftPidController.setD(kD);
    m_elbowLeftPidController.setIZone(kIz);
    m_elbowLeftPidController.setFF(kFF);
    m_elbowLeftPidController.setOutputRange(kMinOutput, kMaxOutput);
 
    m_elbowRightPidController.setP(kP);
    m_elbowRightPidController.setI(kI);
    m_elbowRightPidController.setD(kD);
    m_elbowRightPidController.setIZone(kIz);
    m_elbowRightPidController.setFF(kFF);
    m_elbowRightPidController.setOutputRange(kMinOutput, kMaxOutput);

  }
  
}
