package br.cesed.si.p3.arrays.atividade;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author aluno
 *
 */
public class ArrayListFacisa {

	private int tamanho;
	//ArrayList <Object> ArrayFacisa = new ArrayList<Object>(tamanho);
	Object [] ArrayFacisa = new Object[tamanho];
	private int contPosicoes;
	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.tamanho = tamanho;
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
			dobraTamanho;
		}
		ArrayFacisa[contPosicoes++] = obj;
		contPosicoes ++;
		
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void dobraTamanho(){
		Object [] ArrayFacisa = new Object[tamanho];
	}
	
	public void copiaElementos(){
		
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < ArrayFacisa.length; i++){
			if(ArrayFacisa[i] == obj){
				ArrayFacisa[i] = null;
				if (i++ <= ArrayFacisa.length && ArrayFacisa[i] == null){
					ArrayFacisa[i] = ArrayFacisa[i++];		
				}
				
			}
		}
	}
	
	public void ordenaArray(){
		for (int i = 0; i < ArrayFacisa.length; i++){
			if(ArrayFacisa[i] == null){
				ArrayFacisa[i] = ArrayFacisa[i++];
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
		
		return 0;
	}
	
	public void printAllElements() {
		
	}
	
	
	
}
