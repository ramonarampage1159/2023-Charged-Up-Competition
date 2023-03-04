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
    
  public final class ZeroPIDCoefficients{
    public static final double m_ZerokP = 0; 
    public static final double m_ZerokI = 0;
    public static final double m_ZerokD = 0; 
    public static final double m_ZerokIz = 0; 
    public static final double m_ZerokFF = 0; 
    public static final double m_ZerokMaxOutput = 0.3000000596046448; 
    public static final double m_ZerokMinOutput = -0.3099999964237213;
    


  }

  public final class HighNodePIDCoefficients{
    public static final double m_HighNodeElbowP = 0.1;
    public static final double m_HighNodeElbowRotations = 11;
    public static final double m_HighNodeWristP = 0.5;
    public static final double m_HighNodeWristRotations = 35;
  }

  public final class MidNodePIDCoefficients{
    public static final double m_MidNodeElbowP = 0.1;
    public static final double m_MidNodeElbowRotations = 8;
    public static final double m_MidNodeWristP = 0.5;
    public static final double m_MidNodeWristRotations = 23;
  }

  public final class HighShelfPIDCoefficients{
    public static final double m_HighShelfElbowP = 2;
    public static final double m_HighShelfElbowRotations = 10;
    public static final double m_HighShelfWristP = 0.5;
    public static final double m_HighShelfWristRotations = 30;
  }

  public final class MidShelfPIDCoefficients{
    public static final double m_MidShelfElbowP = 0.5;
    public static final double m_MidShelfElbowRotations = 5;
    public static final double m_MidShelfWristP = 0.5;
    public static final double m_MidShelfWristRotations = 15;
  }

  public final class FloorPickupPID{
    public static final double m_FloorPickupElbowP = 0.5;
    public static final double m_FloorPickupElbowRotations = 0;
    public static final double m_FloorPickupWristP = 0.5;
    public static final double m_FloorPickupWristRotations = 20;
  }

  public final class ClosedArmPID{
    public static final double m_closedElbowP = 0.1;
    public static final double m_closedElbowRotations = 0;
    public static final double m_closedWristP = 0.1;
    public static final double m_closedWristRotations = 0;
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

    public static final double m_elbowLimiter = 0.3;

    public static final double m_wristLimiter = 0.3;

    public static final double m_deadbandvalue = 0.5;

  
    public final class AutonomousValues{

      public final class AutoTimes{
        public static final double m_autonomousTimeOneSeconds = 1;
        public static final double m_autonomousTimeTwoSeconds = 2;
        public static final double m_autonomousTimeThreeSeconds = 3;
        public static final double m_autonomousTimeFiveSeconds = 5;
      }

      public final class AutoPIDValues{
        public static final double m_wristRotationsFloor = 22.0;
        public static final double m_wristPvalueFloor = 50.0;

        public static final double m_wristRotationsClose = 0;
        public static final double m_wristPValueClose = 50;

      }

      public final class MotorSpeeds{

        public final class DriveMotors{
          public static final double m_xAutoZero = 0;
          public static final double m_yAutoZero = 0;
          public static final double m_yAutoback = -0.5;
          public static final double m_yAutoPos = 0.4;
          public static final double m_zAutoZero = 0;
          public static final double m_zAutoZero2 = 0;

        }

      }


    }
}