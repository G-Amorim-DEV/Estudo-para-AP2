import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IterativeReverseArray {

    public static void iterativeReverseArray(int[] lista) {
        int left = 0;
        int right = lista.length - 1;

        while (left < right) {
            int temp = lista[left];
            lista[left] = lista[right];
            lista[right] = temp;

            left++;
            right--;
        }
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

        iterativeReverseArray(arraySequencia);

        output.append("\n\nArray invertido:\n");
        for (int num : arraySequencia) {
            output.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
