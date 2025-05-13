import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LinearSum {

    public int somaArray(int[] lista) {
        int soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        LinearSum ls = new LinearSum();

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

        int soma = ls.somaArray(arraySequencia);

        output.append("\n\nSoma da sequência: ").append(soma);

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
