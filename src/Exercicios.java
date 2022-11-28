import java.util.Scanner;

public class Exercicios {


        public static void main(String[] args) {

            //Escreva um programa Java para imprimir 'Hello' na tela e depois imprima seu nome em uma linha separada
            System.out.println("Ola mundo!!!");
            System.out.println("Meu nome é Gustavo");

            System.out.println();

            //Escreva um programa Java para imprimir a soma de dois números
            int soma = 74 + 36;
            System.out.println(soma);

            System.out.println();

            // Escreva um programa Java para dividir dois números e imprima na tela
            double dividir = 1 / 4;
            System.out.println(dividir);

            System.out.println();

            //Escreva um programa Java para imprimir o resultado das seguintes operações
            double op1 = -5 + 8 * 6;
            double op2 = (55+9) % 9;
            double op3 = 20 + -3 * 5 / 8;
            double op4 = 5 + 15 / 3 * 2 - 8 % 3;

            System.out.printf("%.2f \n%.2f\n%.2f \n%.2f", op1, op2, op3, op4);

            System.out.println();

            // Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números
            Scanner teclado = new Scanner(System.in);

            int num1 = teclado.nextInt();
            int num2 = teclado.nextInt();
            System.out.println(num1 * num2);

            // Escreva um programa Java para imprimir a soma (adição), multiplicar, subtrair, dividir e o resto de dois números
            int num3 = teclado.nextInt();
            int num4 = teclado.nextInt();

            System.out.printf("%d \n%d \n%d \n%d ", num3 + num4, num3 - num4, num3 * num4, num3 / num4);
            teclado.close();



        }

}
