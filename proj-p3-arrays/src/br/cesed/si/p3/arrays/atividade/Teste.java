package br.cesed.si.p3.arrays.atividade;

public class Teste {
	public static void main(String[] args) {
		ArrayListFacisa nomes = new ArrayListFacisa(10);
		
		nomes.add("Teste 01");
		nomes.add("Teste 02");
		nomes.add("Teste 03");
		nomes.add("Teste 04");
		nomes.add("Teste 05");
		nomes.add("Teste 06");
		
		System.out.println(nomes.size());
	//	System.out.println(nomes.findPosition("Teste 04"));
		nomes.remove("Teste 05");
		System.out.println(nomes.size());
	}

}
