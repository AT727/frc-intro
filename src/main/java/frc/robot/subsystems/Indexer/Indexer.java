class Indexer {
  public CANSparkMax indexer; 
  
  public Indexer(){
    this.indexer = new CANSparkMax(Motor.3, CANSparkMax.MotorType.kBrushless);
}
  public void ascend(){
    this.indexer.setPower(1);
  }
  
  public void descend(){
    this.indexer.setPower(-1)
  }
    
}
