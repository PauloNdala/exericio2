package exericio2;

public class testaporta {

	public static void main(String[] args) {
		// Instanciando o Objecto-----
		Porta c1 = new Porta();
		c1.aberta="aberta";
        c1.abre();
        c1.fecha();
        System.out.println( c1.estaAberta());
        c1.pinta("branco");
        c1.cor="preto";
        System.out.println(c1.cor);
	}

}
