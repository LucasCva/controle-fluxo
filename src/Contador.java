import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.printf("Digite um valor");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite outro valor");
        int segundoNumero = terminal.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O primero número deve ser maior que o segundo");
        }
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        }
        int numeroContagem = 1 +(segundoNumero - primeiroNumero);
        for(int i = 1; i < numeroContagem; i++){
            System.out.println("Imprimindo valor " + i);
        }
    }
}