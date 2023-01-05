/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya;

import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tablero[][]=new String[3][3];
        jugador comprobar= new jugador();
        int turno=1;
        int c1=0,c2=0;
        boolean condicion=false;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j]=" ";
            }
        }
        comprobar.mostrarTablero(tablero);
        
        while(condicion==false){
            System.out.println("Jugador 1 ingrese las coordenadas de su marca");
            System.out.print(">>Coordenada en i:");
            c1=Integer.parseInt(sc.nextLine());
            while(c1>2 || c1<0){
                System.out.println("Coordenada invalida");
                System.out.print(">>Ingrese otra:");
                c1=Integer.parseInt(sc.nextLine());
            }
            System.out.print("\n>>Coordenada en j:");
            c2=Integer.parseInt(sc.nextLine());
            while(c2>2 || c2<0){
                System.out.println("Coordenada invalida");
                System.out.print(">>Ingrese otra:");
                c1=Integer.parseInt(sc.nextLine());
            }
            while(!tablero[c1][c2].equals(" ")){
                System.out.println("\nEsta posicion ya esta ocupada");
                System.out.println("Jugador 1 ingrese las coordenadas de su marca");
                System.out.print(">>Coordenada en i:");
                c1=Integer.parseInt(sc.nextLine());
                System.out.print("\n>>Coordenada en j:");
                c2=Integer.parseInt(sc.nextLine());  
            }
            tablero[c1][c2]="X";
            comprobar.mostrarTablero(tablero);
            
            if(comprobar.estaLleno(tablero)==true && comprobar.ganador(1,tablero)==false && comprobar.ganador(2,tablero)==false){
                System.out.println("\nES UN EMPATE");
                System.out.println("Fin del juego");
                condicion=true;
            }else if(comprobar.ganador(1, tablero) == true){
                System.out.println("El ganador es el jugador 1");
                condicion=true;
            }else if(comprobar.ganador(2,tablero) == true){
                System.out.println("El ganador es el jugador 2");
                condicion=true;
            }
            
            if(condicion==false){
            
            System.out.println("Jugador 2 ingrese las coordenadas de su marca");
            System.out.print(">>Coordenada en i:");
            c1=Integer.parseInt(sc.nextLine());
            while(c1>2 || c1<0){
                System.out.println("Coordenada invalida");
                System.out.print(">>Ingrese otra:");
                c1=Integer.parseInt(sc.nextLine());
            }
            System.out.print("\n>>Coordenada en j:");
            c2=Integer.parseInt(sc.nextLine());
            while(c2>2 || c2<0){
                System.out.println("Coordenada invalida");
                System.out.print(">>Ingrese otra:");
                c1=Integer.parseInt(sc.nextLine());
            }
            
            while(!tablero[c1][c2].equals(" ")){
                System.out.println("\nEsta posicion ya esta ocupada o es invalida");
                System.out.println("Jugador 1 ingrese las coordenadas de su marca");
                System.out.print(">>Coordenada en i:");
                c1=Integer.parseInt(sc.nextLine());
                System.out.print("\n>>Coordenada en j:");
                c2=Integer.parseInt(sc.nextLine());  
            }
            tablero[c1][c2]="O";
            comprobar.mostrarTablero(tablero);
            
            if(comprobar.estaLleno(tablero)==true && comprobar.ganador(1,tablero)==false && comprobar.ganador(2,tablero)==false){
                System.out.println("\nES UN EMPATE");
                System.out.println("Fin del juego");
                condicion=true;
            }else if(comprobar.ganador(1, tablero) == true){
                System.out.println("El ganador es el jugador 1");
                condicion=true;
            }else if(comprobar.ganador(2,tablero) == true){
                System.out.println("El ganador es el jugador 2");
                condicion=true;
            }
           }
        }
        
    }
}