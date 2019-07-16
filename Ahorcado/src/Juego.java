
public class Juego {

	public static void main(String[] args) {
		//Si quisieramos guardar la persistencia de los datos en una base de datos , deberiamos hacer una clase para la conexión con la misma.
		//Para hacer una aplicación es aconsejable hacer una clase vista donde solo de el aspecto de la misma.
		//Por otro lado una clase controlador donde haremos todos los metodos de funcionabilidad de la aplicación.(Palabra)
		//en la clase vista el metodo para enlazarse con el controlador
		Vista vista = new Vista();		
		Palabra lista   = new Palabra(vista);
		vista.conectaPalabra(lista);
		lista.numeroAleatorio();
		
		
		

	}	

}
