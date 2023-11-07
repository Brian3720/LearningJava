import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
public class Hello_Clarice {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String usuario = nome.nextLine();

        System.out.println("Olá, " + usuario);
    }
}
