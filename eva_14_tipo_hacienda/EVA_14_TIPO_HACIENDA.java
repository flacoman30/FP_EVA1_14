/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el tipo de personas f:(fisica)o M:(moral");
        //rd uns cadena de texto
        //el primera cadena es 0
        tipo = captu.nextLine().charAt(0);
        System.out.println("EL CARACTER ES"+ tipo);
        if(tipo == 'f')
            System.out.println("persona fisica");
        else
            System.out.println("persona moral");
    }
    
}
