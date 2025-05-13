import javax.swing.JOptionPane;

public class BinarySum {

    public static void BinarySoma(double num1, double num2) {
        double soma = num1 + num2;

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Resultado da soma:\n");
        mensagem.append("Valor real: ").append(soma).append("\n");

        if (soma == (int) soma) {
            int somaInteira = (int) soma;
            mensagem.append("Valor inteiro: ").append(somaInteira).append("\n");
            mensagem.append("Valor binário: ").append(Integer.toBinaryString(somaInteira));
        } else {
            mensagem.append("Valor binário (parte inteira apenas): ")
                    .append(Integer.toBinaryString((int) soma));
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public static void main(String[] args) {
        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número (inteiro ou real):")
                                .replace(",", ".");
        double num1 = Double.parseDouble(entrada1);

        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número (inteiro ou real):")
                                .replace(",", ".");
        double num2 = Double.parseDouble(entrada2);

        BinarySoma(num1, num2);
    }
}
