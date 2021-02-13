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
public class Ensamblador extends Thread {
    Semaphore mutex;
    private int consolas_listas = 0;
    private int ensambladores = 1;
    
    public void run_ensambladores(){
        
        try {
            
            this.mutex.acquire();
            
            this.mutex.release();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
