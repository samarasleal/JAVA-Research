/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula16;

/**
 *
 * @author samara
 */
import java.util.Random;
public class selecao_bublesort {
    
public static void main(String[] args){
    int v[] = new int[4];
    Random random;
    random = new Random();
    for (int j=0;j<v.length;j++){
        v[j]= random.nextInt(10);
        System.out.println(v[j]);
    }
    System.out.println("Ordenado");
    bubleSort(v.length,v);
}
    
public static void selecao (int n, int v[]){
    int min, x;
    for (int i = 0; i <= n-1; ++i) {
        min = i;
        for (int j = i+1; j <= n-1; ++j)
            if (v[j] <= v[min])  
                min = j;
        x = v[i]; 
        v[i] = v[min]; 
        v[min] = x;
    }
    for (int j=0;j<v.length;j++){
        System.out.println(v[j]);
    }
}

public static void bubleSort(int n, int vet[]){
    int aux;
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n-1; j++){
            if(vet[j] > vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
    for (int j=0;j<vet.length;j++){
        System.out.println(vet[j]);
    }
}
    
}
