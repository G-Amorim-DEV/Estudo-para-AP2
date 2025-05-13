import javax.swing.JOptionPane;

public class RecursiveFactorial {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite o número que quer saber o seu fatorial:");
        int entrada = Integer.parseInt(input);

        RecursiveFactorial rf = new RecursiveFactorial();
        int resultado = rf.factorial(entrada);

       
        JOptionPane.showMessageDialog(null, "Fatorial de " + entrada + " é: " + resultado);
    }
}
