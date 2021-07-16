package bilboteca;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Principal extends JFrame implements ActionListener{
	Container c;
	JMenuBar barra;
	JMenu menuLivro;
	JMenuItem cadastro, busca, expo;
	JDesktopPane painel;
//	JButton btBusca, btExpo;
	Color corFundo;
//	JPanel pCabecalho, pConteudo, pRodape; 
	
	
	void instanciarcomponentes() {
		barra = new JMenuBar();
		menuLivro = new JMenu("Biblioteca");
		cadastro = new JMenuItem("Cadastrar Livro");
	//	busca = new JMenuItem("Buscar Livro");
	//	expo = new JMenuItem("Exposição de Livros");
		painel = new JDesktopPane();
		corFundo = new Color(37, 57, 67);
	//	btBusca = new JButton("Buscar");
	//	btExpo = new JButton("Ver Livros");
	///	pCabecalho =  new JPanel();
	 //   pConteudo = new JPanel();
	 //   pRodape =  new JPanel();
	}
	
	void atribuirvalores() {
		setSize(1024,780);
		setJMenuBar(barra);
		painel.setBackground(corFundo);
		cadastro.addActionListener(this);
	//	btBusca.addActionListener(this);
	//	btExpo.addActionListener(this);
	}
	
	void montartela() {
		menuLivro.add(cadastro);
		//menuLivro.add(busca);
	//	menuLivro.add(expo);
		barra.add(menuLivro);
		//pConteudo.add(btBusca);
	//	pConteudo.add(btExpo);
		setVisible(true);
		add(painel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastro) {
		Biblioteca b = new Biblioteca();
		painel.add(b);
	//	painel.add(btBusca);
//		painel.add(btExpo);
		b.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.instanciarcomponentes();
		p.atribuirvalores();
		p.montartela();
	}


}