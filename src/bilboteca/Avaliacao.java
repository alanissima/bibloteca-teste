
package bilboteca;

public class Avaliacao{

	private String discente;
	private String curso;
	private String turma;
	private int matricula;
	private int bimestre;
	private String comentario;
	
	private Genero genero;//SOCOROR
	
	
	public String getDiscente() {
		return discente;
	}
	
	public void setDiscente(String discente) {
		this.discente = discente;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getBimestre() {
		return bimestre;
	}
	
	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public  void  crialivro () {}
	
	public  void  expoeLivro () {
		System.out.println("Titulo do livro: " + discente);
		System.out.println("Autor: " + curso);
		System.out.println("ano: " + turma);
		System.out.println("Editora: " + bimestre);
		System.out.println("Genero: " + genero);
		System.out.println("Sinopse: " + comentario);
	}

	public Avaliacao() {}

}