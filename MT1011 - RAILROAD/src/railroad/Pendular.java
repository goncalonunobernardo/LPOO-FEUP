package railroad;

public class Pendular extends Comboio {
	public Pendular(String nome) {
		super(nome);
		this.servico = new ServicoSemEnjoos();
	}
}
