// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import frc.robot.Robot;

public class WristSubsystem extends SubsystemBase {
  /** Creates a new WristSubsystem. */

  private CANSparkMax wristMotor = new CANSparkMax(Constants.WristMotors.m_wristMotor, MotorType.kBrushless);

  private  SparkMaxPIDController m_wristPidController;

  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;

  public WristSubsystem() {

    m_wristPidController = wristMotor.getPIDController();

    kP = Constants.ElbowPIDCoefficients.m_ElbowkP; 
    kI = Constants.ElbowPIDCoefficients.m_ElbowkI;
    kD = Constants.ElbowPIDCoefficients.m_ElbowkD; 
    kIz = Constants.ElbowPIDCoefficients.m_ElbowkIz; 
    kFF = Constants.ElbowPIDCoefficients.m_ElbowkFF; 
    kMaxOutput = Constants.ElbowPIDCoefficients.m_ElbowkMaxOutput; 
    kMinOutput = Constants.ElbowPIDCoefficients.m_ElbowkMinOutput;

   setPIDValues(kP,kI,kD,kIz,kFF,kMinOutput,kMaxOutput);

    SmartDashboard.putNumber("Wrist P Gain", kP);
    SmartDashboard.putNumber("Wrist I Gain", kI);
    SmartDashboard.putNumber("Wrist D Gain", kD);
    SmartDashboard.putNumber("Wrist I Zone", kIz);
    SmartDashboard.putNumber("Wrist Feed Forward", kFF);
    SmartDashboard.putNumber("Wrist Max Output", kMaxOutput);
    SmartDashboard.putNumber("Wrist Min Output", kMinOutput);
    SmartDashboard.putNumber("Wrist Set Rotations", 0);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void setMotorSpeed(double opRightStickY) {
  wristMotor.set(opRightStickY);
}

public void setWristReference(double speed, CANSparkMax.ControlType type) {

    m_wristPidController.setReference(speed, type);

  }

   public void setPIDValues(double kP, double kI, double kD, double kIz, double kFF, double kMinOutput, double kMaxOutput){

    System.out.println("setting PID Values");

    m_wristPidController.setP(kP);
    m_wristPidController.setI(kI);
    m_wristPidController.setD(kD);
    m_wristPidController.setIZone(kIz);
    m_wristPidController.setFF(kFF);
    m_wristPidController.setOutputRange(kMinOutput, kMaxOutput);
 
  }
}
