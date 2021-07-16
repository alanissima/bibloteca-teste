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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Sala extends JInternalFrame implements Busca, ActionListener{
	ArrayList<Avaliacao> boletim = new ArrayList<Avaliacao>();
	Container c;
	JPanel pCabecalho, p1, p2, p3, p4, p5, p6, p7, pCadastro, pBusca, pDiscente, pCurso, pTurma, pMatricula, pBimestre, pConceito, pComentario, pRodape;
	JTextField txtDiscente, txtCurso, txtTurma, txtMatricula, txtBimestre, txtConceito, txtComentario;
	JLabel lbBilbo, lbDiscente, lbCurso, lbTurma, lbMatricula, lbBimestre, lbConceito, lbComentario;
	JButton btSalvar;
	JRadioButton opA, opB, opC, opD;
	
	public Sala () {
		super("Notas <3");
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
	    pDiscente = new JPanel();
	    pCurso = new JPanel();
	    pTurma = new JPanel();
	    pMatricula = new JPanel();
	    pBimestre = new JPanel();
	    pConceito = new JPanel();
	    pComentario = new JPanel();
	    pRodape = new JPanel();
	    txtDiscente = new JTextField(20);
	    txtCurso = new JTextField(20);
	    txtTurma = new JTextField(20);
	    txtMatricula = new JTextField(20);
	    txtBimestre = new JTextField(20);
	    txtConceito = new JTextField(20);
	    txtComentario = new JTextField(50);
	    lbBilbo = new JLabel("Bilboteca Federal do Paraná");
	    lbDiscente = new JLabel("Discente: ");
	    lbCurso = new JLabel("Curso:   ");
	    lbTurma = new JLabel("Turma:  ");
	    lbMatricula = new JLabel("Matrícula:    ");
	    lbBimestre= new JLabel("Bimestre:");
	    lbConceito= new JLabel("Conceito:    ");
	    lbComentario = new JLabel("Comentário:");
	    opA = new JRadioButton("A");
	    opB = new JRadioButton("B");
	    opC = new JRadioButton("C");
	    opD = new JRadioButton("D"); 
	    btSalvar = new JButton("Salvar");
   }
   
   void atribuirValor() {
	    setSize(1066,650);
	    setClosable(true);
	    c = getContentPane();
	    c.setLayout(new GridLayout(9,1));
	    pCadastro.setLayout(new GridLayout(7,1));
	    pRodape.setLayout(new GridLayout(1, 1));
	    btSalvar.addActionListener(this);
   }
   
   void montarTela() {
	   	pCabecalho.add(lbBilbo);
	    c.add(pCabecalho);
	    p1.add(lbMatricula);
	    p1.add(txtMatricula);
	    pMatricula.add(p1);
	    p2.add(lbDiscente);
	    p2.add(txtDiscente);
	    pDiscente.add(p2);
	    p3.add(lbCurso);
	    p3.add(txtCurso);
	    pCurso.add(p3);
	    p4.add(lbTurma);
	    p4.add(txtTurma);
	    pTurma.add(p4);
	    p5.add(lbBimestre);
	    p5.add(txtBimestre);
	    pBimestre.add(p5);
	    p6.add(lbConceito);
	    p6.add(opA);
	    p6.add(opB);
	    p6.add(opC);
	    p6.add(opD);
	    pConceito.add(p6);
	    p7.add(lbComentario);
	    p7.add(txtComentario);
	    pComentario.add(p7);
	    c.add(pCurso);
	    c.add(pTurma);
	    c.add(pDiscente);
	    c.add(pMatricula);
	    c.add(pBimestre);
	    c.add(pConceito);
	    c.add(pComentario);
	    pRodape.add(btSalvar);
	    c.add(pRodape);
   }
   
   @Override
	public void actionPerformed(ActionEvent e) {
		Avaliacao a = new Avaliacao();
		a.setTurma(txtTurma.getText());
		a.setCurso(txtCurso.getText());
		a.setBimestre(Integer.parseInt(txtBimestre.getText()));
		
		Genero g = new Genero();
		g.nome = txtConceito.getText();
		a.setGenero(g);
		
		a.setMatricula(Integer.parseInt(txtMatricula.getText()));
		a.setComentario(txtComentario.getText());
		a.setDiscente(txtDiscente.getText());
		
		boletim.add(a);
		
		for (Avaliacao avaliacao : boletim) {
		System.out.println("Título: " + avaliacao.getDiscente());
		System.out.println("Autor: " + avaliacao.getCurso());
		}
	}
   
	public void armazenarLivro() {
		Avaliacao a = new Avaliacao();
		a.getTurma();
		a.getBimestre();
	} 
	
	public void  expoeLivro(String tipo) {
		//concluir
	
	}
	
	//	
	//@Override public void buscaGenero() {
	//	for (Avaliacao avaliacao : acervo) {
	//		if(txtConceito.getText() == avaliacao.getGenero().nome) {
	//			//SHOW no jframe ne
	//			System.out.println("Livro semelhante: " + avaliacao.getDiscente());
	//		}
	//	}
	//}
	
	@Override
	public void buscaTurma() {
		for (Avaliacao avaliacao : boletim) {
			if(txtTurma.getText() == avaliacao.getTurma()) {
				//SHOW
			}
		}
	}
	
	@Override
	public void buscaDiscente() {
		for (Avaliacao avaliacao : boletim) {
			if(txtDiscente.getText() == avaliacao.getDiscente()) {
				//SHOW
			}
		}
	}
	
	@Override
	public void buscaCurso() {
		for (Avaliacao avaliacao : boletim) {
			if(txtCurso.getText() == avaliacao.getCurso()) {
				//SHOW
			}
		}
	}
}