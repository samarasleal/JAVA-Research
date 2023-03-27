/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula17;

import java.util.Random;

/**
 *
 * @author samara
 */
public class Pesquisa {

    // Retorna o índice do registro que contém a chave informada na pesquisa
    public static int pesquisa(int chave, int vet[]) {
        vet[0] = chave; // sentinela 
        int i = vet.length-1;
        while (vet[i] != chave) {
            i--;
        }
        return i;
    }

    public static void main(String args[]) {
        int v[] = new int[4];
        Random random;
        random = new Random();
        for (int j = 0; j < v.length; j++) {
            v[j] = random.nextInt(10);
            System.out.println(v[j]);
        }
        int retorno = pesquisa(3, v);
        System.out.println(retorno);
    }
}
