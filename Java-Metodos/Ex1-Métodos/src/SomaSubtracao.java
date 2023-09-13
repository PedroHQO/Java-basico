import java.util.Scanner;

public class SomaSubtracao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numa;
        int numb;

        int multiplicacao;
        int adicao;
        int subtracao;
        int divisao;
        int escolha;

        System.out.println("Digite primeiro numero: ");
        numa = sc.nextInt();

        System.out.println("Digite segundo numero: ");
        numb = sc.nextInt();
        
        System.out.print("Olá, atravéz dos dois numeros digitados ");
        System.out.print("Vou te mostrar a soma, subtração, divisão, produto. ");

        System.out.println("\nA soma é: " + (numa + numb));
        System.out.println("A subtração é: " + (numa - numb));
        System.out.println("A divisão é: " + (numa / numb));
        System.out.println("A multiplicação é: " + (numa * numb));
        System.out.println("Fim.");
    }
    
}