/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_4;

import java.io.IOException;

/**
 *
 * @author Люба
 */
public class Practical1_4 {
    
    public static boolean start = true;

    public Practical1_4(boolean start) {
        this.start = start;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Степеренкова Любовь, РИБО-02-22, Практическое задание 1.14, Вариант 4");
        System.out.println("Нажмите 'Enter', чтобы прервать работу программы");
        int input;
        Runnable myThread = new MyThread();
        Thread tr1 = new Thread(myThread,"Thread 0");
        Thread tr2 = new Thread(myThread,"Thread 1");
        tr1.start();
        tr2.start();
        System.in.read();
        start = false;
    }
}
    
    

