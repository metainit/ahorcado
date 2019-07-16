import java.awt.Color;


import javax.swing.*;

public class Vista extends JFrame {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JLabel jlPalabra , texto, imagen, info;
	 protected JTextField jtLetra;
	 protected JButton aceptar;
	 
	 	 
	 public Vista()  {
		 
		super("Ahorcado");
		setLayout(null);
		setBackground(Color.GREEN);
		setSize(500, 670);
		setLocationRelativeTo(null);
		
		
		imagen = new JLabel();
		imagen.setBounds(40, 50, 450, 450);
		ImageIcon icono =new ImageIcon("1.PNG");
		imagen.setIcon(icono);
		add(imagen);
		
		info = new JLabel();
		info.setText("!! TE QUEDAN 6 FALLOS !!");
		info.setBounds(180,20,200,20);
		add(info);
		
		jlPalabra = new JLabel();		
		jlPalabra.setBounds(150, 520, 300, 20);
		add(jlPalabra);
		
		texto = new JLabel();
		texto.setText("Introduce una letra");
		texto.setBounds(120, 560 , 150, 20);
		add(texto);
		
		jtLetra = new JTextField();
		jtLetra.setBounds(250, 560, 20, 20);
		add(jtLetra);
		
		aceptar = new JButton("Validar");
		aceptar.setBounds(300, 560, 80, 20);
		add(aceptar);
		
		
		setVisible(true);
	}
	 

	 public void conectaPalabra(Palabra p) {
		 aceptar.addActionListener(p);
	 }





	
	 
}
