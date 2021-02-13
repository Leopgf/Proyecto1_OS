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
public class Productor_joysticks extends Thread{
    Semaphore mutex;
    private int almacen_joysticks = 20;
    private int productores_joystickis = 1;
    
    public void run_joysticks(){
        
        try {
            
            this.mutex.acquire();
            
            this.mutex.release();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
