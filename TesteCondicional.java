
public class TesteCondicional {

    public static void main(String[] args) {
        System.out.println("TesteCondicional");
        int idade = 16;
        int pessoa = 2;
        if (idade >= 18) {
            System.out.println("Pode entrar");
        } else {
            if (idade < 18 && pessoa > 1) {
                System.out.println("Você é menor mas está Acompanhado, "
                        + "pode entrar!");
            } else {
                System.out.println("Você tem menos de 18 anos, "
                        + "Só pode entrar acompanhado!");
            }

        }

    }

}
