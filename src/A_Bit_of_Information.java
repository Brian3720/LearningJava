import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
//Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
public class A_Bit_of_Information {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        Scanner userIdade = new Scanner(System.in);

        System.out.print("Qual seu nome?: ");
        String nome = userName.nextLine();
        System.out.print("Qual sua idade: ");
        Integer idade = userIdade.nextInt();


        System.out.println("Olá " + nome + " , sua idade é " + idade);


    }
}
