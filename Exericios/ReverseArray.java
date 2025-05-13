import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReverseArray {

    public static int[] reverseArray(int[] lista) {
        int[] reversed = new int[lista.length];
        int j = 0;
        for (int i = lista.length - 1; i >= 0; i--) {
            reversed[j] = lista[i];
            j++;
        }
        return reversed;
    }

    public static void main(String[] args) {
        
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do incremento:"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final:"));

        ArrayList<Integer> sequencia = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        output.append("Sequência gerada:\n");
        for (int i = inicio; i <= fim; i += incremento) {
            sequencia.add(i);
            output.append(i).append(" ");
        }

        int[] arraySequencia = new int[sequencia.size()];
        for (int i = 0; i < sequencia.size(); i++) {
            arraySequencia[i] = sequencia.get(i);
        }

        output.append("\n\nArray original:\n");
        for (int num : arraySequencia) {
            output.append(num).append(" ");
        }

        int[] reversedArray = reverseArray(arraySequencia);

        output.append("\n\nArray invertido:\n");
        for (int num : reversedArray) {
            output.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
