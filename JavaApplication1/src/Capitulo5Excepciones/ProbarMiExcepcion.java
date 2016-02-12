/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5Excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiExcepcion {
    public static void main(String[] args) {
        try {
            Cliente c=new Cliente();
            c.setEdad(-19);
            ValidarEdad valida=new ValidarEdad();
            valida.ChecarEdadNegativa(-18);
            ValidarValida.ChecarMenorEdad(<18);
        }catch (ValorNoNegativoException ex) {
            System.out.println(ex.getMessage());
            
         catch (ValorMenorDeEdadException ex) {
            System.out.println(e.getMessage());        
                    }
        }finally{
            System.out.println("Este siempre se ejecuta se lance o no la e");
        }
              
    }
}
