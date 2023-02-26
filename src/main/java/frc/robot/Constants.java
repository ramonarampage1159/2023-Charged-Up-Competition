// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
 public class Motors{
    public  class DriveMotors{
        public static final int m_frontleft = 1;
        public static final int m_rearleft = 2;
        public static final int m_frontRight = 3;
        public static final int m_rearRight = 4;

    }

    
  }

  public final class ElbowMotors{
      public static final int m_elbowLeft = 6;
      public static final int m_elbowRight = 7;
    }
   
    public final class WristMotors{
      public static final int m_wristMotor = 5;
    }


  public final class Pneumatics{
    public static final int kSolenoid30ForwardChannel = 0;
    public static final int kSolenoid30ReverseChannel = 1;

    public static final int kSolenoid60ForwardChannel = 2;
    public static final int kSolenoid60ReverseChannel = 3;
  }
   

   public final class Autonomous{
    
    public static final double m_autonomousTime = 40;
}
    
  

   public final class DriverController{

    public static final int m_driverController = 0;
    
       
      public final class Joystick{

       public static final int m_leftStickY = 0;
       public static final int m_leftStickX = 1;
       public static final int m_rightStickX = 2;
  
    }
    
   }
  
   public final class OperatorController{

    public static final int m_operatorController = 1; 

      public final class JoystickButtons{

        public static final int m_xButton = 1;
        public static final int m_aButton = 2;
        public static final int m_bButton = 3;
        public static final int m_yButton = 4; 
        public static final int m_leftBumper = 5; //solenoid30 open
        public static final int m_rightBumper = 6; // solenoid60 open
        public static final int m_leftTrigger = 7; //solenoid30 close
        public static final int m_rightTrigger = 8; //solenoid60 close
        public static final int m_backButton = 9;
        public static final int m_startButton = 10;
        public static final int m_leftStickButton = 11;
        public static final int m_rightStickButton = 12;

      }

      public final class JoystickAxis{
        public static final int m_leftStickY = 1;
        public static final int m_leftStickX = 0;
        public static final int m_rightStickX = 2;
        public static final int m_rightStickY = 3;
      }

   }

    public static final double m_autonomousXSpeed = .25;

    public static final double m_autonomousYSpeed = .25;

    public static final double m_autonomousZSpeed = .25;

   

    

    public static final double m_limiter = 0.8;

    public static final double m_elbowLimiter = 0.5;

    public static final double m_wristLimiter = 0.5;

    public static final double m_deadbandvalue = 0.5;

  
}