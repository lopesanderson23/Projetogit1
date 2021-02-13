import java.util.Scanner;

public class Menu {
    
    public static void menu(){
        System.out.println(" **** Opções ****  ");
        System.out.println(" 0. Fim ");
        System.out.println(" 1. opcao 1 ");
        System.out.println(" 2. opcao 2 ");
    }
    public static void main(String[] args) {
        int opção;
        Scanner menu = new Scanner(System.in);
        
        do{
            menu();
            opção = menu.nextInt();
        
            switch(opção){

            case 1:
            System.out.print("Você escolheu a primeira alternativa");
                break;
                
            case 2:
            System.out.print("Você escolheu a segunda alternativa");
                break;

            default:
            System.out.println("O Programa Terminou.");
            }
        } while(opção !=0);
    }
}
