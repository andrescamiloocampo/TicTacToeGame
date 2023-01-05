/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya;

/**
 *
 * @author ANDRES
 */
public class jugador {
    
    public void mostrarTablero(String tablero[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public boolean estaLleno(String tablero[][]){
        boolean condicion=false;
        int contador=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!tablero[i][j].equals(" ")){
                    contador+=1;
                }
            }
        }
        if(contador==9){
            condicion=true;
        }
        return condicion;
    }
    
    public boolean ganador(int turno,String tablero[][]){
        boolean condicion=false;
        
        if(turno==1){
            if(tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X")){
                condicion=true;
            }else if(tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X")){
                condicion=true;
            }else if(tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")){
                condicion=true;
            }else if(tablero[0][0].equals("X") && tablero[1][0].equals("X") && tablero[2][0].equals("X")){
                condicion=true;
            }else if(tablero[0][1].equals("X") && tablero[1][1].equals("X") && tablero[2][1].equals("X")){
                condicion=true;
            }else if(tablero[0][2].equals("X") && tablero[1][2].equals("X") && tablero[2][2].equals("X")){
                condicion=true;
            }else if(tablero[0][0].equals("X") && tablero[1][1].equals("X") && tablero[2][2].equals("X")){
                condicion=true;
            }else if(tablero[0][2].equals("X") && tablero[1][1].equals("X") && tablero[2][0].equals("X")){
                condicion=true;
            }else{
                condicion=false;
            }
        }else if(turno==2){
            if(tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("0")){
                condicion=true;
            }else if(tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O")){
                condicion=true;
            }else if(tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("O")){
                condicion=true;
            }else if(tablero[0][0].equals("O") && tablero[1][0].equals("O") && tablero[2][0].equals("O")){
                condicion=true;
            }else if(tablero[0][1].equals("O") && tablero[1][1].equals("O") && tablero[2][1].equals("O")){
                condicion=true;
            }else if(tablero[0][2].equals("O") && tablero[1][2].equals("O") && tablero[2][2].equals("O")){
                condicion=true;
            }else if(tablero[0][0].equals("O") && tablero[1][1].equals("O") && tablero[2][2].equals("O")){
                condicion=true;
            }else if(tablero[0][2].equals("O") && tablero[1][1].equals("O") && tablero[2][0].equals("O")){
                condicion=true;
            }else{
                condicion=false;
            }
        }
        return condicion;
    }
}
