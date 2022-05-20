class RunIntake{
   public CANSparkMax intake; 

  public RunIntake(){
    this.intake = new CANSparkMax(Motor.kPort, CANSparkMax.MotorType.kBrushless);   
  }
  
  public void setPower(double power){
    this.intake.set(power);
  }

  public void getPower(){
    this.intake.getPower();
  }
  
} 
