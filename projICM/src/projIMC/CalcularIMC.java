/**
 * Classe que pega os atributos do paciente ja parametrizados e os 
 * usar para realizar o calculo do IMC.
 */
package projIMC;

public class CalcularIMC {
	double resultadoIMC ;
	
	public double calculoIMC(PacienteIMC p) {
		resultadoIMC = p.pesoPaciente/(p.alturaPaciente*p.alturaPaciente);
		return resultadoIMC;
		
	}

}
