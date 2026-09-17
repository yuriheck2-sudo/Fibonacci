
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.print("Digite o número de termos : ");
        int n = inf.nextInt();
        System.out.println("Primeiros " + n + " termos da sequência de SequenciaFibonati.Fibonacci:");
        int termoAnterior = 0;
        int termoAtual = 1;

        for(int i = 0; i < n; ++i) {
            System.out.print(termoAnterior + " ");
            int proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }

        inf.close();
    }
}
