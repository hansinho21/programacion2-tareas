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
public class Tarea6_Progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread tortuga1 = new Thread(new Tortuga()); //creación del proceso tortuga1
        Thread liebre1 = new Thread(new Liebre()); //creación del proceso liebre1

        tortuga1.start();
        tortuga1.setPriority(Thread.MIN_PRIORITY);
        liebre1.start();
        liebre1.setPriority(Thread.MAX_PRIORITY);
        
        String ganador = "";
        while(tortuga1.isAlive() || liebre1.isAlive()){
            if(!tortuga1.isAlive() || liebre1.isAlive()){
                ganador = "El ganador es la tortuga";
            } else if(tortuga1.isAlive() || !liebre1.isAlive()){
                ganador = "El ganador es la liebre";
            }
        }
        
        System.out.println(ganador);
        
    }

}
