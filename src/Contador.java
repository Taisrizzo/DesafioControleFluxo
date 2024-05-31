import java.util.Scanner;
public class Contador {
    public static void main(String[] args)  {
      Scanner terminal = new Scanner(System.in);
      System.out.println("Insira o 1º número:");
      int num1 = terminal.nextInt();
      System.out.println("Insira o 2º número:");
      int num2 = terminal.nextInt();

      try{
        contar(num1, num2);
      }catch(ParametrosInvalidosException e) {
        if(num2<num1)
        System.out.println("2º número deve ser maior que o 1º");
      }
    }
      static void contar(int num1, int num2) throws ParametrosInvalidosException {
        int contagem = num2 - num1;
        for(int i = 1; i<=contagem; i++) {
            System.out.println("Imprimindo o número: "+(i));
          }
         
        }
    
      
    }
