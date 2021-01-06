import javax.swing.JOptionPane;

public class  EstimatePi041{
  public static void main(String[] args){
    double k = 0;
    int numPoints;
    String msg = "Enter the number of points:";
    msg = JOptionPane.showInputDialog(msg);
    numPoints = Integer.parseInt(msg);
    
    double[][] array2 = new double[numPoints][2];
    for(int p = 0;p < numPoints;p ++){
      for(int q = 0;q < 2;q ++)
        array2[p][q] = Math.random();};// random numbers
    
    boolean[] inYellow = new boolean[numPoints]; 
    for(int p = 0;p < numPoints;p ++){
      inYellow[p] = array2[p][0]*array2[p][0]+array2[p][1]*array2[p][1] < 1;
    }
    for(int q = 0;q < numPoints;q ++){
      if(inYellow[q] =array2[q][0]*array2[q][0]+array2[q][1]*array2[q][1] < 1)
        k ++;
    }
    JOptionPane.showMessageDialog(null,"pi =" + (k/numPoints*4));
  }
}