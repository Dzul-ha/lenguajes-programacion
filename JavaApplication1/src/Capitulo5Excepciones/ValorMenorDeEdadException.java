/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5Excepciones;

/**
 *
 * @author T-101
 */
public class ValorMenorDeEdadException extends Exception{
    
    /**
     *
     */
    public ValorMenorDeEdadException(){
        super("No puede acceder un menor de edad");
    }
    
}


