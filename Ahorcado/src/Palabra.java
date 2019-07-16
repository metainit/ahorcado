import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Palabra implements ActionListener {
	
	private String lista [] = {"AMOVER","ABUHADO","JIPIAR","UEBOS","BARBIAN","ORATE","SAPENCO","HAIGA","BURDEGANO","MURCIELAGO",
			"VITUPERIO","BLUYIN","NEFELIBATA","INEFABLE","AGIBILIBUS","APAPACHAR","ZANGOLOTEAR","ACECINAR","SERENDIPIA","FUTBOL",
			"HEROE","HEROES","ABABOL","COLOR","RADIO","CUCURUCHO","HELADO","BUNBURY","AMASAR","FUTBOOLIN",
			"MANZANA","PERA","JABALI","CONDON","LONDRES","ESPAÑA","ZANAHORIA","CAFE","RELAMPAGO","JABON"};
	private Vista vista;
	private String palabra;
	private boolean marca[] = new boolean[15];
	
	private int oportunidades = 6, fallos=1, ganar=0;

	public Palabra(Vista vista) {
		this.vista = vista;
		
		
	}

	
	public void numeroAleatorio() {
		int tam = lista.length;
		int numero = (int) (Math.random() * tam);
		palabra = lista[numero];
		imprime(palabra, marca);
		
		
		
	}
	
	public void imprime(String palabra, boolean[] marca) {
		String pal = " ";
		System.out.println(palabra);
		for (int i = 0; i < palabra.length(); i++) {
			
			if(marca[i]==false) {
			String im = " __   ";
			pal = pal + im;
			}
			
			if(marca[i]==true) {
				String im = palabra.charAt(i) + "   ";
				pal = pal + im;
			}
			
		}

		this.vista.jlPalabra.setText(pal);
	}
	
	public void comprueba(char letra) {
		
		boolean encontrada = false;
	
		
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == letra) {
				encontrada=true;
				marca[i] = true;
				ganar ++;
				
			}
		}
		if(encontrada == true) {
			if(ganar==palabra.length()) {
				this.vista.info.setText("!! ENHORABUENA HAS GANADO !!");
			}
			imprime(palabra,marca);
		}
		if(encontrada == false) {
			 oportunidades --;
			 fallos++;
			 this.vista.info.setText("!! TE QUEDAN " + oportunidades + " FALLOS !!");
			 ImageIcon icono = new ImageIcon(fallos + ".png");
			 this.vista.imagen.setIcon(icono);
		}
		if(oportunidades==0) {
			 this.vista.info.setText("!! HAS PERDIDO !!");

		}
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
		if(ganar ==palabra.length()) {
			System.exit(0);
		}
		if (oportunidades == 0) {
			System.exit(0);
		}
		String introducir = this.vista.jtLetra.getText();
		introducir = introducir.toUpperCase();
		char letra = introducir.charAt(0);
		System.out.println(letra);
		comprueba(letra);
		this.vista.jtLetra.setText("");
		}catch( java.lang.StringIndexOutOfBoundsException e) {
			System.out.println("!! INTRODUCE UNA LETRA ZOPENCO !!");
		}
		
	}
	
	
	

}
