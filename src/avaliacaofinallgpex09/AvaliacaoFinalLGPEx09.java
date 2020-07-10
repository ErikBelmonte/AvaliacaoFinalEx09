package avaliacaofinallgpex09;

import javax.swing.JOptionPane;

/**
 * @author Erik
 */
public class AvaliacaoFinalLGPEx09 {
    public static void main(String[] args) {
        int cont, result;
        
        cont = 0;
        result = 0;
        
        while(cont>=0 && cont<=500){
        cont++;
        if(cont%2 != 0 && cont%3 == 0){
        result+=cont;
        }
        }
        
        JOptionPane.showMessageDialog(null, "A soma deu dos números deu: " +result);
        
    }
    
}    

