package olioOhjelmointi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.InputEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TekstiEditori {
	private static JMenuItem mb11;

	public static void main(String[] args) {
		JEditorPane editorPane = new JEditorPane();
		

		JFrame ikkuna = new JFrame();
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setSize(473, 400);

		JMenuBar mb = new JMenuBar();
		ikkuna.setJMenuBar(mb);

		JMenu mb1 = new JMenu("Tiedosto");
		mb.add(mb1);

		mb11 = new JMenuItem("Avaa");
		mb11.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				JFileChooser valinta = new JFileChooser();
				valinta.showOpenDialog(null);
				String rivi = "";
				String uusiTiedosto = valinta.getSelectedFile().getAbsolutePath();
				
				try {
					Scanner lukija = null;
					
					File tiedosto = new File(uusiTiedosto);
					
					lukija = new Scanner(tiedosto);
				
				} catch (FileNotFoundException p) {
					System.out.println("Tiedostoa ei löytynyt");
				}
				editorPane.setText(rivi);
				
			}
		});
		mb11.setIcon(
				new ImageIcon(TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mb11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mb1.add(mb11);

		JMenuItem mb12 = new JMenuItem("Tallenna");
		mb12.setIcon(new ImageIcon(TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mb12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mb1.add(mb12);

		JMenuItem mb13 = new JMenuItem("Lopeta");
		mb13.setIcon(new ImageIcon(TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mb1.add(mb13);

		JMenuItem mb14 = new JMenuItem("Sulje");
		mb14.setIcon(new ImageIcon(
				TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/close-pressed.gif")));
		mb1.add(mb14);

		JMenu mb2 = new JMenu("Muokkaa");
		mb.add(mb2);

		JMenuItem mb21 = new JMenuItem("Etsi");
		mb2.add(mb21);

		JMenuItem mb22 = new JMenuItem("Korvaa");
		mb2.add(mb22);

		JMenu mb3 = new JMenu("Tietoja");
		mb.add(mb3);

		JMenuItem mb31 = new JMenuItem("Tietoja ohjelmasta");
		mb3.add(mb31);

		JToolBar toolBar = new JToolBar();
		ikkuna.getContentPane().add(toolBar, BorderLayout.NORTH);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(
				new ImageIcon(TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		toolBar.add(btnNewButton);

		JButton btnTallenna = new JButton("");
		btnTallenna.setIcon(
				new ImageIcon(TekstiEditori.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		toolBar.add(btnTallenna);

		JButton btnLeikkaa = new JButton("");
		btnLeikkaa.setIcon(new ImageIcon(
				TekstiEditori.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Cut-Black.png")));
		toolBar.add(btnLeikkaa);

		
		ikkuna.getContentPane().add(editorPane, BorderLayout.CENTER);

		ikkuna.setVisible(true);

		ikkuna.setVisible(true);

	}
	public JMenuItem getMb11() {
		return mb11;
	}
}