// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.PidCommands;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import com.revrobotics.CANSparkMax;


public class ArmPID extends CommandBase {
  /** Creates a new ArmPID. */

  boolean isFinishedStep = false;

  public ArmPID() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_elbow);
    addRequirements(Robot.m_wrist);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

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

      if(!isFinishedStep) {
        double elbowPValue = Constants.HighPIDCoefficients.m_HighElbowP;
        double elbowIValue = Constants.HighPIDCoefficients.m_HighElbowI;
        double elbowDValue = Constants.HighPIDCoefficients.m_HighElbowD;
        Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
        double elbowRotations = Constants.HighPIDCoefficients.m_HighElbowRotations;
        Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
       // if(Robot.m_elbow.isAtSetpoint()) 
        isFinishedStep =true;
      }
      
      

      if(isFinishedStep) {
        double wristPValue = Constants.HighPIDCoefficients.m_HighWristP;
        double wristIValue = Constants.HighPIDCoefficients.m_HighWristI;
        double wristDValue = Constants.HighPIDCoefficients.m_HighWristD;
        Robot.m_wrist.setPIDValues(wristPValue, wristIValue, wristDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
        double wristRotations = Constants.HighPIDCoefficients.m_HighWristRotations;
        Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }
      isFinishedStep = false;
      
      
      
    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_aButton)){
      
      if(!isFinishedStep){
      double elbowPValue = Constants.MidPIDCoefficients.m_MidElbowP;
      double elbowIValue = Constants.MidPIDCoefficients.m_MidElbowI;
      double elbowDValue = Constants.MidPIDCoefficients.m_MidElbowD;
      Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.MidPIDCoefficients.m_MidElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
     // if(Robot.m_elbow.isAtSetpoint()) 
      isFinishedStep =true;

      }

      
      if(isFinishedStep){
      double wristPValue = Constants.MidPIDCoefficients.m_MidWristP;
      double wristIValue = Constants.MidPIDCoefficients.m_MidWristI;
      double wristDValue = Constants.MidPIDCoefficients.m_MidWristD;
      Robot.m_wrist.setPIDValues(wristPValue, wristIValue, wristDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.MidPIDCoefficients.m_MidWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;
      


    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_bButton)){

      if(!isFinishedStep){
      double elbowPValue = Constants.FloorPickupPID.m_FloorPickupElbowP;
      double elbowIValue = Constants.FloorPickupPID.m_FloorPickupElbowI;
      double elbowDValue = Constants.FloorPickupPID.m_FloorPickupElbowD;
      Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.FloorPickupPID.m_FloorPickupElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
      //if(Robot.m_elbow.isAtSetpoint()) 

      isFinishedStep =true;

      }

      if(isFinishedStep){
      double wristPValue = Constants.FloorPickupPID.m_FloorPickupWristP;
      double wristIValue = Constants.FloorPickupPID.m_FloorPickupWristI;
      double wristDValue = Constants.FloorPickupPID.m_FloorPickupWristD;
      Robot.m_wrist.setPIDValues(wristPValue, wristIValue, wristDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.FloorPickupPID.m_FloorPickupWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;


    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_xButton)){

      if(!isFinishedStep){
      double wristPValue = Constants.ClosedArmPID.m_closedWristP;
      double wristIValue = Constants.ClosedArmPID.m_ClosedWristI;
      double wristDValue = Constants.ClosedArmPID.m_ClosedWristD;
      Robot.m_wrist.setPIDValues(wristPValue, wristIValue, wristDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.ClosedArmPID.m_closedWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      
      isFinishedStep =true;

      }
       

      if(isFinishedStep){
      double elbowPValue = Constants.ClosedArmPID.m_closedElbowP;
      double elbowIValue = Constants.ClosedArmPID.m_ClosedElbowI;
      double elbowDValue = Constants.ClosedArmPID.m_ClosedElbowD;
      Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.ClosedArmPID.m_closedElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;

    
    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_startButton)){

      if(!isFinishedStep){
        double elbowPValue = Constants.ShelfPickup.m_shelfElbowP;
        double elbowIValue = Constants.ShelfPickup.m_shelfElbowI;
        double elbowDValue = Constants.ShelfPickup.m_shelfElbowD;
        Robot.m_elbow.setPIDValues(elbowPValue, elbowIValue, elbowDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
        double elbowRotations = Constants.ShelfPickup.m_shelfElbowRotations;
        Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
      
      isFinishedStep =true;

      }
       

      if(isFinishedStep){

      double wristPValue = Constants.ShelfPickup.m_shelfWristP;
      double wristIValue = Constants.ShelfPickup.m_shelfWristI;
      double wristDValue = Constants.ShelfPickup.m_shelfWristD;
      Robot.m_wrist.setPIDValues(wristPValue, wristIValue, wristDValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.ShelfPickup.m_shelfWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
  
      }

      isFinishedStep = false;
    }

  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    isFinishedStep = false;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
