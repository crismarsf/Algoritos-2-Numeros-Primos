
package numerosprimos;

import javax.swing.*;

/**
 *
 * @author crist
 */
public class NumerosPrimos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 0,i,c = 0; //1
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero")); //1
        
        for(i=1;i<=n;i++){ //n + 1
            if(n%i==0){ //1 + n
                c++; //n + 1           
            }
        }if(c!=2){ //1
            JOptionPane.showMessageDialog(null,n+" No es primo"); //1
        }else{
            JOptionPane.showMessageDialog(null,n+" Es primo"); //1              
        
    }
        /*
        3n+8
        */
                
    }
    
}
