/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yancarloshuacre;

/**
 *
 * @author Yancarlos
 */
public class Calculadora1 {
    //Atributos
    int a;
    int d;

    public void suma(int f, int c){
     a= f+c;
        System.out.println(a);
    }
    public void resta(int f, int c){
     a= f-c;
     System.out.println(a);
    }
    public void multiplicacion(int f, int c){
     a= f+c;
     System.out.println(a);
    }
    public void division(int f, int c){
     a= f/c;
     System.out.println(a);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora1 aea = new Calculadora1();
        aea.suma(9, 8);
        aea.resta(15, 2);
        aea.multiplicacion(13, 5);
        aea.division(80, 5);
        Calculadora2 a = new Calculadora2();
        // Suma
        a.respuestas();
        
    }
    
}
    

