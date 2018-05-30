/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dayan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quick q = new Quick();
        int[] n = {10, 5, 2, -1, 50, 8, 100, 200, 1000, 1};
        int[] aux;
        
        q.quicksort(n, 0, 9);
        aux = q.array;
        
        
        for (int i = 0; i < q.array.length; i++) {
            System.out.println(aux[i]);
        }
    }
    
}
