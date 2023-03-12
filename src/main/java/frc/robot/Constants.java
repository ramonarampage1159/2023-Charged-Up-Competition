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
      public static final int m_wristUpper = 5;
      public static final int m_wristLower = 8;

    }


  public final class Pneumatics{
    public static final int kSolenoid30ForwardChannel = 0;
    public static final int kSolenoid30ReverseChannel = 1;

    public static final int kSolenoid60ForwardChannel = 2;
    public static final int kSolenoid60ReverseChannel = 3;
  }
   
    
  public final class ZeroPIDCoefficients{
    public static final double m_ZerokP = 0; 
    public static final double m_ZerokI = 0;
    public static final double m_ZerokD = 0; 
    public static final double m_ZerokIz = 0; 
    public static final double m_ZerokFF = 0; 
    public static final double m_ZerokMaxOutput = 0.1500000596046448; 
    public static final double m_ZerokMinOutput = -0.159999964237213;
    


  }

  public final class HighPIDCoefficients{
    public static final double m_HighElbowP = 0.15;
    public static final double m_HighElbowRotations = 9 ;
    public static final double m_HighWristP = 0.15;
    public static final double m_HighWristRotations = 3.7;
  }

  public final class MidPIDCoefficients{
    public static final double m_MidElbowP = 0.15;
    public static final double m_MidElbowRotations = 4.7;
    public static final double m_MidWristP = 0.15;
    public static final double m_MidWristRotations = 2.1;
  }

  
  public final class FloorPickupPID{
    public static final double m_FloorPickupElbowP = 0.15;
    public static final double m_FloorPickupElbowRotations = 0;
    public static final double m_FloorPickupWristP = 0.15;
    public static final double m_FloorPickupWristRotations = 2.7;
  }

  public final class ClosedArmPID{
    public static final double m_closedElbowP = 0.1;
    public static final double m_closedElbowRotations = 0;
    public static final double m_closedWristP = 0.1;
    public static final double m_closedWristRotations = 0;
  }

   
  public final class MidWayPoint{
    public static final double m_MidWayElbowP = 0.1;
    public static final double m_MidWayElbowRotations = 3;
    public static final double m_MidWayWristP = 0.1; 
    public static final double m_MidWayWristRotations = 0;
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

  

   

    

    public static final double m_limiter = 0.8;

    public static final double m_elbowLimiter = 0.3;

    public static final double m_wristLimiter = 0.3;

    public static final double m_deadbandvalue = 0.05;

  
    public final class AutonomousValues{

      public final class AutoTimes{
        public static final double m_autonomousTimeOneSeconds = 1;
        public static final double m_autonomousTimeTwoSeconds = 2;
        public static final double m_autonomousTimeThreeSeconds = 3.09;
        public static final double m_autonomousTimeFourSeconds = 4;
        public static final double m_autonomousTimeFiveSeconds = 5;
      }

      public final class AutoPIDValues{
        public static final double m_wristRotationsFloor = 2.7;
        public static final double m_wristPValueFloor = 0.1;

        public static final double m_wristRotationsClose = 0;
        public static final double m_wristPValueClose = 0.1;

      }

      public final class MotorSpeeds{

        public final class DriveMotors{
          public static final double m_xAutoZero = 0;
          public static final double m_yAutoZero = 0;
          public static final double m_yAutoback = -0.35;
          public static final double m_yAutoPos = 0.4;
          public static final double m_zAutoZero = 0;
          public static final double m_zAutoZero2 = 0;

        }

      }


    }
}