/*
 peça para usuários inserir 10 números
após inserido os 10 numeros, descobrir qual a maior diferença entre os números
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();        
        int index = 1;
        
        System.out.println("Digite 10 numeros: ");
        
        do {
            System.out.println("Numero "+ index + ": ");
            numeros.add(ler.nextInt());
            
            index++;
           
            
        } while(numeros.size() < 10);
        
        Collections.sort(numeros);
        
        int diferenca = numeros.get(9) - numeros.get(0);
        
        System.out.println("Os numeros digitados : \n"
                + numeros);
        
        System.out.println("maior diferença: "+ numeros.get(9) +
                " e " + numeros.get(0) + " = " + diferenca);
    }
    
}
