/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.Threads;

/**
 *
 * @author T-101
 * Cración de un Thread heredando la clase Thread
 */
public class MiPrimerThread extends Thread{

    @Override
    public void run() {
        System.out.println("soy un thread y me llamo" +this.getName());
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }

  
    }

