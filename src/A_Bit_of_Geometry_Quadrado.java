import java.util.Scanner;

//Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.
// Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
public class A_Bit_of_Geometry_Quadrado {
    public static void main(String[] args) {
        System.out.println("Calculando a área Quadrado");
        System.out.println("Digite a base e a altura do Quadrado");

        System.out.print("Base: ");
        Scanner inputBase = new Scanner(System.in);
        int base = inputBase.nextInt();

        System.out.print("Altura: ");
        Scanner inputAltura = new Scanner(System.in);
        int altura = inputAltura.nextInt();

        int area = altura * base;

        System.out.println("A área do retângulo é " + area);
    }
}

