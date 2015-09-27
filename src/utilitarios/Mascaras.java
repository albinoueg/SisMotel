package utilitarios;

public class Mascaras {
    public static String mascaraTelefone(String telefone) {
		// máscara do telefone: (##) ####-####
                String numeroFormatado = (telefone.substring(0) + "(" + telefone.substring(0, 2) + ") " + 
                        telefone.substring(2, 6) + "-" + telefone.substring(6,10));
		return numeroFormatado;
	}
    
    public static String mascaraCEP(String CEP) {
		// máscara do cep: ##.###-###
		return(CEP.substring(0, 2) + "." + CEP.substring(2, 5) + "-" + 
                        CEP.substring(5, 8));
	}
}
