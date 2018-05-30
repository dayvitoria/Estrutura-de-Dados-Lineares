/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dayan
 */
public class Merge2{
    
    int[] array;
    public void ordena(int[] array, int indiceInicio, int indiceFim) {

		// Condicional que verifica a validade dos parâmetros passados.
		if (array != null && indiceInicio < indiceFim && indiceInicio >= 0 &&
		 indiceFim < array.length && array.length != 0) {
			int meio = ((indiceFim + indiceInicio) / 2);

			ordena(array, indiceInicio, meio);
			ordena(array, meio + 1, indiceFim);

			merge(array, indiceInicio, meio, indiceFim);
		}
                
	}
    public void merge(int[] array, int indiceInicio, int meio, int indiceFim) {

		int[] auxiliar = new int[array.length];
		//Copiando o trecho da lista que vai ser ordenada
		for (int i = indiceInicio; i <= indiceFim; i++) {
			auxiliar[i] = array[i];
		}

		//Índices auxiliares
		int i = indiceInicio;
		int j = meio + 1;
		int k = indiceInicio;

		//Junção das listas ordenadas
		while (i <= meio && j <= indiceFim) {
                    if(auxiliar[i] < auxiliar[j]){
                                    array[k] = auxiliar[i];
                                    i++;
                            } else {
                                    array[k] = auxiliar[j];
                                    j++;
                            }
                            k++;
                    }
			
		

		//Append de itens que não foram usados na Junção
		while (i <= meio) {
			array[k] = auxiliar[i];
			i++;
			k++;
		}

		//Append de itens que não foram usados na Junção
		while (j <= indiceFim) {
			array[k] = auxiliar[j];
			j++;
			k++;
		}
                
                this.array = array;
	}

    public int[] exibir(){
          return this.array;  
    }
}
