package repeticao_2;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        
        int maior, menor = 0;
        
        String num1 = JOptionPane.showInputDialog(null, "Insira um numero");
        int n1 = Integer.parseInt(num1);
        
        String num2 = JOptionPane.showInputDialog (null, "Insira outro numero");
        int n2 = Integer.parseInt(num2);
        
        if (n1 > n2){
        maior = n1;
        menor = n2;
        }else{
        maior = n2;
        menor = n1;
        }
        
        for (int i = menor; i <= maior; i++){
            if (i % 2 != 0) {
                JOptionPane.showMessageDialog(null, i);
            }
        }
    }
}