/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_4;


/**
 *
 * @author Люба
 */
public class MyThread implements Runnable{
    private int value = 0;
    private final Object flag = new Object();

    
    @Override
    public void run(){
        while(Practical1_4.start){
            synchronized(flag){
                if(Thread.currentThread().getName().equals("Thread " + value)){
                    System.out.println(Thread.currentThread().getName());
                    if (value == 0){
                        value = 1;
                    }else if (value == 1){
                        value = 0;
                     }
                    }
                }
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
            }
            
        }
        
    }
}
    
    
            
      
