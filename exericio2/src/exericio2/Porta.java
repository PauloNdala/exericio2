package exericio2;
public class Porta {
	String aberta;
	String cor;
	double dimensaox,dimensaoy,dimensaoz;
	/*Criando Metodos */
	String aux =this.cor;
    
	void getAbre() {
		System.out.println("Abrir Porta !");
		System.out.println("Abrir Porta !");
	}
	void getFecha() {
		System.out.println("Fechar Porta!");
	}
    void pinta(String s) {
    	  System.out.println("Pintura da Porta Cor:" +s);
    }
    boolean isEstaAberta() {
    	if(this.aberta=="aberta") {
    		return true;
    	}else {
    		return false;
    	}
    }
    
}
