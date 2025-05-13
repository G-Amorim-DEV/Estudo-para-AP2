import javax.swing.JOptionPane;

public class LinearFibonacci {

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

        int resultado = fibonacci(k);
        JOptionPane.showMessageDialog(null, "O " + k + "º número de Fibonacci é: " + resultado);
    }
}
