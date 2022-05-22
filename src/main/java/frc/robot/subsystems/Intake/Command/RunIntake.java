class RunIntake extends CommandBase{
public Intake intake; 
  
public void RunIntake(){
    this.intake = new Intake();
}
  
    @Override
    public void init() {

    }   
  
    @Override
    public void execute(double power) {
        intake.setPower(power);
    }   

    @Override
    public boolean isFinished() {
        return false;
    }
  
   @Override
    public void end() {
        intake.setPower(0);
    }
  
}
