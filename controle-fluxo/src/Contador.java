import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, count;

        System.out.println("Digite o 1° número: ");
        numero1 = input.nextInt();

        System.out.println("Digite o 2° número: ");
        numero2 = input.nextInt();

        try{
            count = contador(numero2, numero1);
            //System.out.printf("A diferença entre o número1 e o numero2 é de: %d", count);
            for(int i = numero1; i<numero2; i++){
                System.out.printf("Imprimindo o número %d \n", i+1);
            }
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
            System.out.println("O segundo número tem que ser maior q primeiro.");
        }
        
    }

    static int contador(int num2, int num1) throws ParametrosInvalidosException{
        int contar = num2 - num1;
        if(contar <= 0){
            throw new ParametrosInvalidosException();
        }
        return contar;
    }
}
