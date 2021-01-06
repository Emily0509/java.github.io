// AdditionOrSubstractionQuiz.java
import javax.swing.JOptionPane;
public class AdditionOrSubstractionQuiz{
  public static void main(String[] args){
    int x = (int)(Math.random()*10);
    int y = (int)(Math.random()*10);
    int p = (int)(Math.random()*10);
    if (p>=5){
      if(x<y){
        int temp = x;
        x = y;
        y = temp;
      };
      String msg = x + " - " + y + " = ? ";
      msg = JOptionPane.showInputDialog(msg);
      int z = Integer.parseInt(msg);
      if (x-y==z)
        msg = "Great!";
      else
        msg = x + " - " + y +" = " + (x-y) + ",not" + z;
      JOptionPane.showMessageDialog(null,msg);
    };
    if (p<5){
     String msg = x + " + " + y + " = ? ";
      msg = JOptionPane.showInputDialog(msg);
      int z = Integer.parseInt(msg);
      if (x+y==z)
        msg = "Great!";
      else
        msg = x + " + " + y + " = " + (x+y) + ",not" + z ;
      JOptionPane.showMessageDialog(null,msg);
  }
  }
}