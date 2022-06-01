import com.revrobotics.CANSparkMax;

class Turret {
   private CANSparkMax angleMotor;
   private CANSparkMax speedMotor;
   private RelativeEncoder encoder;
  
  public Turret(){
    this.angleMotor = new CANSparkMax(Motor.0, CANSparkMax.MotorType.kBrushless);
    this.speedMotor = new CANSparkMax(Motor.1, CANSparkMax.MotorType.kBrushless);
    this.encoder = this.angleMotor.getEncoder();
  }
  
  public void setAngle(double angle){
    this.encoder.setPosition(angle);
  }
   
  public void getAngle(){
    return this.encoder.getPosition();
  }
  
  public void setSpeed(double power){
    this.speedMotor.setPower(power);
  }
    
}
