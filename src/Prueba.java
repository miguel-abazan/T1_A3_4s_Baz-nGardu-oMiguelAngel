import javax.swing.*;
import java.awt.*;


class EJemploGridBagLayout extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public EJemploGridBagLayout() {
		
		
		
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad 3");
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lbl1=new JLabel("El formulario clasico incluye todo lo visible en esta lista");
		metodoMagico(lbl1, 0, 0, 20, 1);
		add(lbl1);

		JLabel lbl2 = new JLabel("Opciones de Formulario.");
		metodoMagico(lbl2, 1, 1, 1, 2);
		add(lbl2);

		JLabel lbl3 = new JLabel("Incluye lo Siguente: ");
		metodoMagico(lbl3, 0, 2, 1, 1);
		add(lbl3);
		
		JCheckBox checkboxFirst = new JCheckBox("Un Titulo Para Tu Formulario");
		metodoMagico(checkboxFirst, 0, 3, 1, 1);
		add(checkboxFirst);
		
		JTextArea areaTexto = new JTextArea("Suscribete A la Lista de correos. ", 10,10);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		metodoMagico(areaTexto, 0, 4, 1, 1);
		add(areaTexto);
		
		ButtonGroup bg = new ButtonGroup();
	
		JRadioButton radiobtnFirst = new JRadioButton("Solo Campos Requeridos.");
		bg.add(radiobtnFirst);
		metodoMagico(radiobtnFirst, 0, 5, 1, 1);
		add(radiobtnFirst);
		
		JRadioButton radiobtnSecond = new JRadioButton("Todos los Campos.");
		bg.add(radiobtnSecond);
		metodoMagico(radiobtnSecond, 0, 6, 1, 1);
		add(radiobtnSecond);
		
		JLabel lblfifth = new JLabel("(editar campos requeridos en el generador del formulario) ");
		metodoMagico(lblfifth, 0, 7, 1, 1);
		add(lblfifth);
		
		JCheckBox checkboxSecond = new JCheckBox("Campos de grupo de interes");
		metodoMagico(checkboxSecond, 0, 8, 1, 1);
		add(checkboxSecond);
		
		JCheckBox checkboxThird = new JCheckBox("Indicador de campos requeridos");
		metodoMagico(checkboxThird, 0, 9, 1, 1);
		add(checkboxThird);
		
		
		JLabel lblSixth = new JLabel("Establecer anchura del formulario");
		metodoMagico(lblSixth, 0, 10, 1, 1);
		add(lblSixth);
		
		JTextArea areaTexto2 = new JTextArea("", 10,10);
		areaTexto2.setLineWrap(true);
		areaTexto2.setWrapStyleWord(true);
		metodoMagico(areaTexto2, 0, 11, 1, 1);
		add(areaTexto2);
		
		JCheckBox checkboxFourth = new JCheckBox("Habilitar modo emergente malvado");
		metodoMagico(checkboxFourth, 0, 12, 1, 1);
		add(checkboxFourth);
		JCheckBox checkboxFifth = new JCheckBox("Deshabilitar todo JavaScript");
		metodoMagico(checkboxFifth, 0, 13, 1, 1);
		add(checkboxFifth);
		JCheckBox checkboxSixth = new JCheckBox("Enlace de archivo incluido");
		metodoMagico(checkboxSixth, 0, 14, 1, 1);
		add(checkboxSixth);
		JCheckBox checkboxSeventh = new JCheckBox("Enlace de MonkeyRewars Incluido");
		metodoMagico(checkboxSeventh, 0, 15, 1, 1);
		add(checkboxSeventh);
		
		JPanel panel1= new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Visualizacion"));
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.WHITE);
		panel1.setPreferredSize(new Dimension(1000,1000));
		panel1.setBounds(450, 5, 500, 300);
		
		JLabel lbl11 = new JLabel("Correo Electronico:");
		metodoMagico(lbl11, 0, 15, 1, 1);
		panel1.add(lbl11);
		
		
		
		JTextField t1= new JTextField(20);
		metodoMagico(t1, 0, 15, 1, 1);
		panel1.add(t1);
		
		JLabel lbl22 = new JLabel("Nombre: ");
		metodoMagico(lbl22, 0, 15, 1, 1);
		panel1.add(lbl22);
		
		panel1.add(new JTextField(10));
		panel1.add(new JLabel("Apellido"));
		panel1.add(new JTextField(10));
		panel1.add(new Button("Suscribete"));
		add(panel1);
		
		
		
		JLabel lbl10 = new JLabel("Copia/Pega Dentro del Sitio");
		metodoMagico(lbl10, 0, 15, 1, 1);
		add(lbl10);
		
		JTextArea areaTexto3 = new JTextArea("", 1000,1000);
		areaTexto3.setLineWrap(true);
		areaTexto3.setWrapStyleWord(true);
		metodoMagico(areaTexto3, 0, 15, 1, 1);
		add(areaTexto3);
		//pack();
		
	}//main
	
	public void metodoMagico(JComponent c, int gx, int gy, int gw, int gh) {
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridwidth = gw;
		gbc.gridheight = gh;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	
}

public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new EJemploGridBagLayout();
			}
		});
	}
}





