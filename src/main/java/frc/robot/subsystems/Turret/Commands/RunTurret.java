
class RunTurret extends CommandBase {
  public Turret turret;
  public double highAngle;
  public double lowAngle;
  
  public RunTurret(){
  this.turret = new Turret();
  }
  
 @Override
    public void init() {

    }   
  
    @Override
    public void execute(double power) {
        turret.setAngle(highAngle);
        turret.setPower(0.5);
    }   

    @Override
    public boolean isFinished() {
        turret.encoder.getAngle() - turret.encoder.getTargetAngle() == 0;
    }
  
   @Override
    public void end() {
        turret.setPower(0);
    }
}
  
