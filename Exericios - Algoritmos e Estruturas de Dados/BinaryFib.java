import javax.swing.JOptionPane;

public class BinaryFib {

    public static int fibonacci(int k) {
        int a = 0, b = 1;
        for (int i = 0; i < k; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor de k:");
        int k = Integer.parseInt(input);

        int fib = fibonacci(k);
        String binario = Integer.toBinaryString(fib);

        String mensagem = "O " + k + "º número de Fibonacci é: " + fib +
                          "\nO " + k + "º número de Fibonacci em binário é: " + binario;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
