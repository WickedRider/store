package SupermercadoOnline;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Miscellaneous implements Serializable{
    public Miscellaneous(){

    }

    public int intCheck(int k, boolean state){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                if(state)
                    System.out.println("1 -> Mostrar Produtos disponiveis. \n2 -> Comprar Produto de Mobiliario. \n3 -> Comprar Produtos de Limpeza. \n4 -> Comprar Produtos Alimentares");
                
                k = Integer.parseInt(sc.next());
                return k;
            } catch (NumberFormatException e){
                System.out.println("Input invalido. Tente Novamente.");
                intCheck(k, state);
            }
        }
        
    }


    public int getInt(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                return sc.nextInt();
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Input Invalido");
            }
        }
    }
}
