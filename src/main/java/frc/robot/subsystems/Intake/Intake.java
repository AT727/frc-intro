import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

class Intake extends SubsystemBase{
  public CANSparkMax intake; 
  
  public Intake(){
    this.intake = new CANSparkMax(Motor.kPort, CANSparkMax.MotorType.kBrushless);   
  }
  
  public void setPower(double power){
    this.intake.set(power);
  }

}
