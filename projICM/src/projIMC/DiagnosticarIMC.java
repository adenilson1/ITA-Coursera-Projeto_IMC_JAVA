/**
 * Classe que receber o resuldado do calculo do IMC , e o utiliza
 * para realizar a analise e selecionar a opção adequada ao valor
 */
package projIMC;

public class DiagnosticarIMC {
	String msg;
	
	public String Resultado(CalcularIMC p) {
		
		if(p.resultadoIMC < 16) {
			msg = "Baixo peso muito grave";
		}
		
		if(p.resultadoIMC >= 16 && p.resultadoIMC < 16.99) {
			msg = "Baixo peso grave";
		}
		
		if(p.resultadoIMC >= 17 && p.resultadoIMC < 18.49) {
			msg = "Baixo peso";
		}
		
		if(p.resultadoIMC >= 18.50 && p.resultadoIMC < 24.99) {
			msg = "Peso normal";
		}
		
		if(p.resultadoIMC >= 25 && p.resultadoIMC < 29.99) {
			msg = "Sobrepeso";
		}
		
		if(p.resultadoIMC >= 30 && p.resultadoIMC < 34.99) {
			msg = "Obesidade grau I";
		}
		
		if(p.resultadoIMC >= 35 && p.resultadoIMC < 39.99) {
			msg = "Obesidade grau II";
		}
		
		if(p.resultadoIMC >= 40) {
			msg = "Obesidade grau III";
		}
		
		return msg;
	}	
	

}
