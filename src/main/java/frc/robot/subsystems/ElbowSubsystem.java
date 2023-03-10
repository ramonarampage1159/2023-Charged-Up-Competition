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

import frc.robot.Constants;

public class ElbowSubsystem extends SubsystemBase {
  /** Creates a new ElbowSubsystem. */   

  private CANSparkMax elbowLeft = new CANSparkMax(Constants.ElbowMotors.m_elbowLeft, MotorType.kBrushless);
  private CANSparkMax elbowRight = new CANSparkMax(Constants.ElbowMotors.m_elbowRight, MotorType.kBrushless);

  private SparkMaxPIDController m_elbowLeftPidController;
 


  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;
  public double rotations;


  MotorControllerGroup m_elbowMotors = new MotorControllerGroup(elbowLeft, elbowRight);

  public ElbowSubsystem() {    


    elbowRight.follow(elbowLeft);

    m_elbowLeftPidController = elbowLeft.getPIDController();
    
    
    kP = Constants.ZeroPIDCoefficients.m_ZerokP; 
    kI = Constants.ZeroPIDCoefficients.m_ZerokI;
    kD = Constants.ZeroPIDCoefficients.m_ZerokD; 
    kIz = Constants.ZeroPIDCoefficients.m_ZerokIz; 
    kFF = Constants.ZeroPIDCoefficients.m_ZerokFF; 
    kMaxOutput = Constants.ZeroPIDCoefficients.m_ZerokMaxOutput; 
    kMinOutput = Constants.ZeroPIDCoefficients.m_ZerokMinOutput;

    setAllPIDValues(kP,kI,kD,kIz,kFF,kMinOutput,kMaxOutput);

  
    
    SmartDashboard.putNumber("Elbow P Gain", kP);
    SmartDashboard.putNumber("Elbow I Gain", kI);
    SmartDashboard.putNumber("Elbow D Gain", kD);
    SmartDashboard.putNumber("Elbow I Zone", kIz);
    SmartDashboard.putNumber("Elbow Feed Forward", kFF);
    SmartDashboard.putNumber("Elbow Max Output", kMaxOutput);
    SmartDashboard.putNumber("Elbow Min Output", kMinOutput);
    SmartDashboard.putNumber("Elbow Set Rotations", 0);
 
    double ElbowPValue = m_elbowLeftPidController.getP();
    SmartDashboard.putNumber("Elbow P Value", ElbowPValue);

    
    
    
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("elbow right",elbowRight.getEncoder().getPosition());
    SmartDashboard.putNumber("elbow left",elbowLeft.getEncoder().getPosition());
    SmartDashboard.putNumber("elbow lrft current",elbowLeft.getOutputCurrent());
    SmartDashboard.putBoolean("elbow at setpoint", isAtSetpoint());

  }

  public void setMotorSpeed(double opLeftStickY) {
    m_elbowMotors.set(opLeftStickY);
  }

  public void setElbowReference(double speed, CANSparkMax.ControlType type) {

    this.rotations = speed;
    m_elbowLeftPidController.setReference(speed, type);

  }

  public boolean isAtSetpoint() {
    return Math.abs(elbowLeft.getEncoder().getPosition() - rotations) <= 0.5;
  }
 
  public void setAllPIDValues(double kP, double kI, double kD, double kIz, double kFF, double kMinOutput, double kMaxOutput){


    m_elbowLeftPidController.setP(kP);
    m_elbowLeftPidController.setI(kI);
    m_elbowLeftPidController.setD(kD);
    m_elbowLeftPidController.setIZone(kIz);
    m_elbowLeftPidController.setFF(kFF);
    m_elbowLeftPidController.setOutputRange(kMinOutput, kMaxOutput);
 
   
  }


  public void setPIDValues(double kP, double kMinOutput, double kMaxOutput) {

    m_elbowLeftPidController.setP(kP);
  }
  
}
