import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Regua {

    public static void main(String[] args){
        
        ArrayList<Integer> lista = new ArrayList<>(); 
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para criar uma régua: "));
        
        for (int i = 0; i < num; i++){
            lista.add(i * 10);
            System.out.print(lista.get(i) + "----");
        }
        
        System.out.println(num * 10);
        
        for (int j = 0; j <= num; j++){
            System.out.print(j);
            System.out.print("     ");
        }
    }
}
