package bilboteca;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Principal extends JFrame implements ActionListener{
	Container c;
	JMenuBar barra;
	JMenu menuSala;
	JMenuItem cadastro, busca;
	JDesktopPane painel;
	Color corFundo;
	ImageIcon imagem;
	JLabel label;
	
	void instanciarcomponentes() {
		barra = new JMenuBar();
		menuSala = new JMenu("Sala de Avaliações");
		cadastro = new JMenuItem("Avaliar Alunos");
		painel = new JDesktopPane();
		corFundo = new Color(37, 57, 67);
		imagem = new ImageIcon(getClass().getResource("Bilboteca Federal do Paraná.png"));
		label = new JLabel(imagem);
	}
	
	void atribuirvalores() {
		setSize(1380,729);
		setJMenuBar(barra);
		cadastro.addActionListener(this);
	}
	
	void montartela() {
		menuSala.add(cadastro);
		barra.add(menuSala);
		setVisible(true);
		add(painel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastro) {
		Sala b = new Sala();
		painel.add(b);
		b.setVisible(true);
		}
	}
	
	public Principal() {
		add(label);
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.instanciarcomponentes();
		p.atribuirvalores();
		p.montartela();
	}


}