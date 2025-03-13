package exibicaotiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author raony
 */
public class ExibicaoTiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Insira sua nota:");    
        float nota = teclado.nextFloat();
        System.out.printf("%s, sua nota é %.1f \n",nome,nota);
        
    } 
    
}
