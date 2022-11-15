
package question26;

import javax.swing.JOptionPane;

public class QUESTION26 {

    
    public static void main(String[] args) {
    
        int tamanho, vezes = 0;
        
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        
        for(int y = 1; y <= tamanho; y++)
        {
            if(tamanho % y == 0)
            {
                vezes = vezes + 1;
            }
        }
            if(tamanho == 1)
            {
                JOptionPane.showMessageDialog(null, tamanho + " Não é um número primo");
            }
            else if(tamanho == 2)
            {
                JOptionPane.showMessageDialog(null, tamanho + " Não é um número primo");
            }
            else if(vezes > 2)
            {
                JOptionPane.showMessageDialog(null, tamanho + " Não é um número primo");
            }
            else
            {
                JOptionPane.showMessageDialog(null, tamanho + " É um número primo");
            }
    }
    
}
