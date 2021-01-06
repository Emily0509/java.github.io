public class F16_H extends Player{
  private double p = 0.15;
  private int ccdc, cddd;
  private int run;
  private Move oppLastMove;
  
  public F16_H(int nr){
    setName("F16_H");
    ccdc = cddd = 0;
    run = 0;
    oppLastMove = COOPERATE;
  }
  
  public Move move(){
    if(run == 0) return COOPERATE;

 
    if(oppLastMove != COOPERATE) return DEFECT;
    else{
 if(ccdc - cddd >= 0) return Math.random() < p ? DEFECT : COOPERATE;
      else return COOPERATE;
    }
  }
  
  public void receiveOpponentMove(Move mm){
    oppLastMove = mm;
    if(oppLastMove == COOPERATE) ccdc ++;
    else cddd ++;
    run ++; /* added by JLHuang @ 20161223 */
  }
}

// if cooperate, then we defect
// if opponent defect, then we check their past performance, if they cooperate more, they we still defect
// but if they defect more, they we cooperate?