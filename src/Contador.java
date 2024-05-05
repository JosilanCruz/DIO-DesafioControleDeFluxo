import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        contador();
    }
    static void contador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoNumero = scanner.nextInt();
        try {
            contar(primeiroNumero, segundoNumero);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.\n");
            contador();
        }
    }
    static void contar(int n1, int n2 ) throws ParametrosInvalidosException {
        if( n1 >= n2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = n2 - n1;
            for(int i = 1 ; i <= contagem; i++){
                System.out.println("Imprimindo o numero "+i);
            }
        }
    }
}
