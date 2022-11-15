
package question27;

import javax.swing.JOptionPane;

public class QUESTION27 {

    
    public static void main(String[] args) {
    
        double celsius, fahrenheit, kelvin;
        
        String mostrar = "";
        
        for(celsius = 0; celsius < 100; celsius++)
        {
            fahrenheit = celsius * 1.8 + 32;
            
            kelvin = celsius + 273.15;
            
            mostrar = mostrar + celsius + "ºC" + " = " + fahrenheit + "ºF" + " = " + kelvin + "K" + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
}
