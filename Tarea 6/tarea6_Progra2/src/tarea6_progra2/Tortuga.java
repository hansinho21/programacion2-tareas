/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_progra2;

/**
 *
 * @author hvill
 */
public class Tortuga implements Runnable{

    @Override
    public void run() {
        int i = 0;
        System.out.println("arranco la tortuga");
        while (i < 5) {
            try {
                Thread.sleep(3000);
                System.out.println("soy la tortuga");
            } catch (InterruptedException ex) {
            }
            i++;
        }
        System.out.println("termina la tortuga");
    }
}
