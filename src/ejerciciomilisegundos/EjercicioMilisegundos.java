/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomilisegundos;

import java.util.Scanner;

/**
 *
 * @author abreg
 */
public class EjercicioMilisegundos {

    /**
     * Se ingresa por teclado una cntidad de milisegundos.
     * Mostrar por pantalla la cantidad de Dias , Horas , minutos y milisegundos correspondientes.
     * Datos para el calculo : 
     *  1 seg = 1000 milisegundos
     *  1 minuto = 60 segundos
     *  1 hora = 60 minutos
     *  1 dia = 24 horas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos de entrada
        long milisegundos, segundos, minutos, horas, dias;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de milisegundos");
        milisegundos = scanner.nextInt();
        
        // Cálculos correspondientes
        segundos = milisegundos / 1000;
        minutos = segundos / 60;
        horas = minutos / 60;
        dias = horas / 24;
    
        // Salida
        System.out.println(milisegundos + " milisegundos equivalen a:");
        System.out.println(segundos + " segundos");
        System.out.println(minutos + " minutos");
        System.out.println(horas + " horas");
        System.out.println(dias + " dias");
        
    }
    
}
