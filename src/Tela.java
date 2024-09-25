import java.util.Scanner;

public class Tela {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a,b;
        double c,d;

        System.out.println("Digite qual calculo deseja fazer: \n 1.Somar \n 2.Subtrair \n 3.Multiplicar \n 4.Dividir \n 0.Sair");
        int valor = sc.nextInt();

        switch (valor){
            case(1):
                System.out.println("Digite o primeiro valor:");
                a = sc.nextInt();
                System.out.println("Digite o Segundo Valor");
                b = sc.nextInt();
                int soma = Operacao.Somar(a,b);
                System.out.println("O resultado de " + a + "+" + b + " é igual a: " + soma);
               break;
            case(2):
                System.out.println("Digite o primeiro valor:");
                a = sc.nextInt();
                System.out.println("Digite o Segundo Valor");
                b = sc.nextInt();
                int subtrair = Operacao.Subtrair(a,b);
                System.out.println("O resultado de " + a + "-" + b + " é igual a: " + subtrair);
                break;
            case(3):
                System.out.println("Digite o primeiro valor:");
                c = sc.nextDouble();
                System.out.println("Digite o Segundo Valor");
                d = sc.nextDouble();
                double multiplicar = Operacao.Multiplicar(c,d);
                System.out.println("O resultado de " + c + "x" + d + " é igual a: " + multiplicar);
                break;
            case(4):
                System.out.println("Digite o primeiro valor:");
                c = sc.nextDouble();
                System.out.println("Digite o Segundo Valor");
                d = sc.nextDouble();
                double dividir = Operacao.Dividir(c,d);
                System.out.println("O resultado de " + c + "/" + d + " é igual a: " + dividir);
                break;
            case(0):
                System.out.println("Obrigado Por usar nosso programa!");
                break;
        }













    }
}