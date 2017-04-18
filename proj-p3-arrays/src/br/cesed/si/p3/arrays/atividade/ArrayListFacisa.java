package br.cesed.si.p3.arrays.atividade;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author Mysael
 *
 */
public class ArrayListFacisa {

	private int tamanho;
	//ArrayList <Object> ArrayFacisa = new ArrayList<Object>(tamanho);
	private Object [] ArrayFacisa; 
	private int contPosicoes;
	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.tamanho = tamanho;
		ArrayFacisa = new Object[tamanho];
	}

	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		return contPosicoes;
	}
	
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		if(contPosicoes == ArrayFacisa.length){
			dobraTamanho();
		}
		ArrayFacisa[contPosicoes+1] = obj;
		contPosicoes ++;
		
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void dobraTamanho(){
		Object [] ArrayFacisa2 = new Object[ArrayFacisa.length *2];
		for (int i = 0; i <= ArrayFacisa.length; i++){
			ArrayFacisa2[i] = ArrayFacisa[i];
		}
		ArrayFacisa = null;
		ArrayFacisa = ArrayFacisa2;
	} 
	
	public void copiaElementos(){
		
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < ArrayFacisa.length; i++){
			if(ArrayFacisa[i] == obj){
				ArrayFacisa[i] = null;
				ordenaArray();
				}
				
			}
		}
	
	public void ordenaArray(){
		for (int i = 0; i < ArrayFacisa.length; i++){
			if(ArrayFacisa[i] == null){
				if (i+1 <= ArrayFacisa.length){
				ArrayFacisa[i] = ArrayFacisa[i++];
				}
			}
		}
	}
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 */
	public Object getByIndex(int index) {
		
		return null;
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {
		for(int i = 0; i <= ArrayFacisa.length; i++){
			if(ArrayFacisa[i] == obj){
				int posicao = i;
			}return posicao;
		}
	}
	
	public void printAllElements() {
		
	}
	
	
	
}
