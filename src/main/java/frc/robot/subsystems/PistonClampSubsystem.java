// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.Compressor; lc
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PistonClampSubsystem extends SubsystemBase {
  /** Creates a new PistonClamp. */
    
    DoubleSolenoid m_solenoid30 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,Constants.Pneumatics.kSolenoid30ForwardChannel,Constants.Pneumatics.kSolenoid30ReverseChannel);
    DoubleSolenoid m_solenoid60 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Pneumatics.kSolenoid60ForwardChannel,Constants.Pneumatics.kSolenoid60ReverseChannel);

    //Compressor compressor = new Compressor(null); lc

  public void solenoid30Open() {
    m_solenoid30.set(DoubleSolenoid.Value.kForward);
  }

  public void solenoid30Close() {
    m_solenoid30.set(DoubleSolenoid.Value.kReverse);
  }

  public void solenoid30Off(){
    m_solenoid30.set(DoubleSolenoid.Value.kOff);
  }

  public void solenoid60Open() {
    m_solenoid60.set(DoubleSolenoid.Value.kForward);
  }

  public void solenoid60Close() {
    m_solenoid60.set(DoubleSolenoid.Value.kReverse);
  }

  public void solenoid60Off(){
    m_solenoid60.set(DoubleSolenoid.Value.kOff);
  }

  public PistonClampSubsystem() {}
  
  @Override
  public void periodic() {}
}
