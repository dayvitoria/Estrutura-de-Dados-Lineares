/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dayan
 */
public class Quick {
    
    int[] array = null;
    
    public static int particao(int[] s, int inicio, int fim){
      
        int c = s[inicio];
        int i = inicio + 1;
        int j = fim;
        int t;
        
        while(i<=j){
            if(s[i] <= c){
                i++;
            }else if(c < s[j]){
                j--;
            }else{
                t = s[i];
                s[i] = s[j];
                s[j] = t;
                i++;
                j--;
            }
        }
        
        s[inicio] = s[j];
        s[j] = c;
        
        return j;
    }
    
    public void quicksort(int[] s, int inicio, int fim){
        
        int j;
        if(inicio<fim){
            j = particao(s,inicio, fim);
            quicksort(s,inicio, j-1);
            quicksort(s,j+1, fim);
        }
        
        array = s;
    }
    
}
