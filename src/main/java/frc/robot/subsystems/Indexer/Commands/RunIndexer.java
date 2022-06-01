class RunIndexer extends CommandBase{
public Indexer indexer;
  
public RunIndexer(){
  this.indexer = new Indexer();
}
  
  @Override
    public void init() {

    }   
  
    @Override
    public void execute(double power) {
        indexer.ascend();
        indexer.descend();
    }   

    @Override
    public boolean isFinished() {
        return false;
    }
  
   @Override
    public void end() {
        indexer.stop();
    }
  
}
