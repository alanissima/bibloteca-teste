package bilboteca;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Biblioteca extends JInternalFrame implements Busca, ActionListener{
	ArrayList<Livro> acervo = new ArrayList<Livro>();
	Container c;
	JPanel pCabecalho, p1, p2, p3, p4, p5, p6, p7, pRodape, pCadastro, pBusca, pConteudo;
	JTextField txtTitulo, txtAutor, txtAno, txtId, txtEditora, txtGenero, txtSinopse;
	JLabel lbTitulo, lbAutor, lbAno, lbId, lbEditora, lbGenero, lbSinopse;
	JButton btCadastrar, btBuscar, btSalvar;
	JCheckBox gRomance, gFiccao, gNacional, gFantasia;
	
	public Biblioteca () {
		super("Livros <3");
		instanciarComponentes();
		atribuirValor();
		montarTela();
	}
   void instanciarComponentes() {
	    pCadastro = new JPanel();
	    p1 =  new JPanel();
	    p2 =  new JPanel();
	    p3 =  new JPanel();
	    p4 =  new JPanel();
	    p5 =  new JPanel();
	    p6 =  new JPanel();
	    p7 =  new JPanel();
	    pCabecalho =  new JPanel();
	    pConteudo = new JPanel();
	    pRodape =  new JPanel();
	    txtTitulo = new JTextField(20);
	    txtAutor = new JTextField(20);
	    txtAno = new JTextField(20);
	    txtId = new JTextField(20);
	    txtEditora = new JTextField(20);
	    txtGenero = new JTextField(20);
	    txtSinopse = new JTextField(20);
	    lbTitulo = new JLabel("Titulo");
	    lbAutor = new JLabel("Autor");
	    lbAno = new JLabel("Ano");
	    lbId = new JLabel("ID   ");
	    lbEditora= new JLabel("Editora");
	    lbGenero= new JLabel("Gênero: ");
	    lbSinopse = new JLabel("Sinopse");
	    btCadastrar = new JButton("Novo livro");
	    btBuscar = new JButton("Buscar");
	    btSalvar = new JButton("Salvar");
	    gRomance = new JCheckBox("Romance");
	    gFiccao = new JCheckBox("Ficção-científica");
	    gNacional = new JCheckBox("Nacional");
	    gFantasia = new JCheckBox("Nacional");
   }
   
   void atribuirValor() {
	    setSize(700,700);
	    setClosable(true);
	    c = getContentPane();
	    c.setLayout(new GridLayout(3,1));
	    pCadastro.setLayout(new GridLayout(7,1));
	    pCabecalho.setLayout(new GridLayout(3,1));
	    pRodape.setLayout(new GridLayout(3,1));
	    btSalvar.addActionListener(this);
	    
   }
   
   void montarTela() {
	    pCabecalho.add(btCadastrar);
	    pCabecalho.add(btBuscar);
	    c.add(pCabecalho);
	    p1.add(lbId);
	    p1.add(txtId);
	    pCadastro.add(p1);
	    p2.add(lbTitulo);
	    p2.add(txtTitulo);
	    pCadastro.add(p2);
	    p3.add(lbAutor);
	    p3.add(txtAutor);
	    pCadastro.add(p3);
	    p4.add(lbAno);
	    p4.add(txtAno);
	    pCadastro.add(p4);
	    p5.add(lbEditora);
	    p5.add(txtEditora);
	    pCadastro.add(p5);
	    p6.add(lbGenero);
	    p6.add(gRomance);
	    p6.add(gFiccao);
	    p6.add(gNacional);
	    p6.add(gFantasia);
	    pCadastro.add(p6);
	    p7.add(lbSinopse);
	    p7.add(txtSinopse);
	    pCadastro.add(p7);
	    pConteudo.add(pCadastro);
	    c.add(pConteudo);
	    pRodape.add(btSalvar);
	    c.add(pRodape);
   }
   
   @Override
	public void actionPerformed(ActionEvent e) {
		Livro l = new Livro();
		l.setAno(Integer.parseInt(txtAno.getText()));
		l.setAutor(txtAutor.getText());
		l.setEditora(txtEditora.getText());
		
		Genero g = new Genero();
		g.nome = txtGenero.getText();
		l.setGenero(g);
		
		l.setId(Integer.parseInt(txtId.getText()));
		l.setSinopse(txtSinopse.getText());
		l.setTitulo(txtTitulo.getText());
		
		acervo.add(l);
		
		for (Livro livro : acervo) {
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		}
	}
   
	public void armazenarLivro() {
		Livro l = new Livro();
		l.setAno(0);
		l.setAutor(null);
		l.getEditora();
	} 
	
	public void  expoeLivro(String tipo) {
		//concluir
	
	}
	
	@Override
	public void buscaGenero() {
		for (Livro livro : acervo) {
			if(txtGenero.getText()==livro.getGenero().nome) {
				//SHOW no jframe ne
				System.out.println(livro.getTitulo());
			}
		}
	}
	
	@Override
	public void buscaAno() {
		for (Livro livro : acervo) {
			if(Integer.parseInt(txtAno.getText())==livro.getAno()) {
				//SHOW
			}
		}
	}
	
	@Override
	public void buscaLivro() {
		for (Livro livro : acervo) {
			if(txtTitulo.getText()==livro.getTitulo()) {
				//SHOW
			}
		}
	}
	
	@Override
	public void buscaAutor() {
		for (Livro livro : acervo) {
			if(txtAutor.getText()==livro.getAutor()) {
				//SHOW
			}
		}
	}
}