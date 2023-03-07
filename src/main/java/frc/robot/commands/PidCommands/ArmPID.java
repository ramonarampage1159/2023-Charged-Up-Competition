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
        double elbowPValue = Constants.HighNodePIDCoefficients.m_HighNodeElbowP;
        Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
        double elbowRotations = Constants.HighNodePIDCoefficients.m_HighNodeElbowRotations;
        Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
       // if(Robot.m_elbow.isAtSetpoint()) 
        isFinishedStep =true;
      }
      
      

      if(isFinishedStep) {
        double wristPValue = Constants.HighNodePIDCoefficients.m_HighNodeWristP;
        Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
        double wristRotations = Constants.HighNodePIDCoefficients.m_HighNodeWristRotations;
        Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }
      isFinishedStep = false;
      
      
      
    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_aButton)){
      
      if(!isFinishedStep){
      double elbowPValue = Constants.MidNodePIDCoefficients.m_MidNodeElbowP;
      Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.MidNodePIDCoefficients.m_MidNodeElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
     // if(Robot.m_elbow.isAtSetpoint()) 
      isFinishedStep =true;

      }


      if(isFinishedStep){
      double wristPValue = Constants.MidNodePIDCoefficients.m_MidNodeWristP;
      Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.MidNodePIDCoefficients.m_MidNodeWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;



    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_xButton)){

      if(!isFinishedStep){
      double elbowPValue = Constants.HighShelfPIDCoefficients.m_HighShelfElbowP;
      Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.HighShelfPIDCoefficients.m_HighShelfElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
     // if(Robot.m_elbow.isAtSetpoint()) 
      isFinishedStep =true;

      }

      if(isFinishedStep){
      double wristPValue = Constants.HighShelfPIDCoefficients.m_HighShelfWristP;
      Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.HighShelfPIDCoefficients.m_HighShelfWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;


    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_bButton)){
      
      if(!isFinishedStep){
      double elbowPValue = Constants.MidShelfPIDCoefficients.m_MidShelfElbowP;
      Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.MidShelfPIDCoefficients.m_MidShelfElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
      //if(Robot.m_elbow.isAtSetpoint()) 
      isFinishedStep =true;

      }
      
      if(isFinishedStep){
      double wristPValue = Constants.MidShelfPIDCoefficients.m_MidShelfWristP;
      Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.MidShelfPIDCoefficients.m_MidShelfWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;


    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_backButton)){

      if(!isFinishedStep){
      double elbowPValue = Constants.FloorPickupPID.m_FloorPickupElbowP;
      Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.FloorPickupPID.m_FloorPickupElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
      //if(Robot.m_elbow.isAtSetpoint()) 
      isFinishedStep =true;

      }

      if(isFinishedStep){
      double wristPValue = Constants.FloorPickupPID.m_FloorPickupWristP;
      Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.FloorPickupPID.m_FloorPickupWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      }

      isFinishedStep = false;


    } else if(Robot.m_robotContainer.operatorController.getRawButtonPressed(Constants.OperatorController.JoystickButtons.m_startButton)){

      if(!isFinishedStep){
        double wristPValue = Constants.ClosedArmPID.m_closedWristP;
      Robot.m_wrist.setPIDValues(wristPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double wristRotations = Constants.ClosedArmPID.m_closedWristRotations;
      Robot.m_wrist.setWristReference(wristRotations, CANSparkMax.ControlType.kPosition);
      
      isFinishedStep =true;

      }
       

      if(isFinishedStep){
        double elbowPValue = Constants.ClosedArmPID.m_closedElbowP;
      Robot.m_elbow.setPIDValues(elbowPValue, Constants.ZeroPIDCoefficients.m_ZerokMinOutput, Constants.ZeroPIDCoefficients.m_ZerokMaxOutput);
      double elbowRotations = Constants.ClosedArmPID.m_closedElbowRotations;
      Robot.m_elbow.setElbowReference(elbowRotations, CANSparkMax.ControlType.kPosition);
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
