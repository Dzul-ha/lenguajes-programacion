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
public class ValidarEdad {
    public void ChecarEdadNegativa(int edad)throws ValorNoNegativoException{
        if(edad<0)throw new ValorNoNegativoException();
    }
    
    public void ChecarMenorEdad (int edad)throws ValorMenorDeEdadException{
        if(edad<18)throw new ValorMenorDeEdadException();
    }
}