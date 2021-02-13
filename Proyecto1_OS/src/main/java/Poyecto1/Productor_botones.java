/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poyecto1;

import java.util.concurrent.Semaphore;
/**
 *
 * @author leonp
 */
public class Productor_botones extends Thread {
    Semaphore mutex;
    private int almacen_botones = 45;
    private int productores_botones = 1; // Valor inicial, se debe poder indicar de manera dinamica
    
    public void run_botones(){
        
        try {
            
            this.mutex.acquire();
            
            this.mutex.release();
            
        } catch (Exception e) {
            System.out.println(e);
        }
           
    }
}
