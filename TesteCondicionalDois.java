package TesteCondicionalDois;

public class TesteCondicionalDois{
    public static void main(String[] args) {
        
        System.out.println("Só pde entrar maior de idade,"
                + " ou menor acompanhado!");
        
        int idade = 17;
        int quantidadePessoas = 2;
        
        if(idade >= 18 || quantidadePessoas > 1){
            System.out.println("Seja bem vindo!");
        }else{
            System.out.println("Sinto muito mas no pode entrar!");
        }
        
}
}