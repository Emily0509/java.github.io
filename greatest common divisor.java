import javax.swing.JOptionPane;
public class GCD{
  public static void main(String[] args){
    String msg1 = "Enter the first integer:";
    msg1 = JOptionPane.showInputDialog(msg1);
    String msg2 = "Enter the second integer:";
    msg2 = JOptionPane.showInputDialog(msg2);
    
    int x = Integer.parseInt(msg1);
    int y = Integer.parseInt(msg2);
        
    if(x<y){
      int temp = x;
      x = y;
      y = temp;
    }
    do{
      x=x%y;
      if(x != 0){
        int temp = x;
        x = y;
        y = temp;
      }
    }while(x!=0);
    
    
    JOptionPane.showMessageDialog(null,"GCD"+"("+ msg1 +","+ msg2 +")"+"="+y);
  }
}
