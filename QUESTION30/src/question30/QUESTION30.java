
package question30;

import javax.swing.JOptionPane;


public class QUESTION30 {

      public static int ePrimo(int y){
    int w, divisores = 0;

    for(w = 1; w <= y; w++){
      if(y % w == 0)
        divisores++;
    }
    if(divisores == 2)
      return 1;
    else
      return 0;
  }
    
    public static void main(String[] args) {
    
        int w = 0;
    
        for(int y = 1; y <= 1000; y++)
        {
        if(ePrimo(y) == 1)
        {
            w = w + 1;
        }
        }
        JOptionPane.showMessageDialog(null,"Número primos de 1 a 1000 = " + w);
    }
    
}
