package railroad;

public class TGV extends Comboio {
	
	public TGV(String nome) {
		super(nome);
		this.servico = new ServicoPrioritario();
	}
	
	@Override
	public String toString() {
		String result = "TGV " + this.getNome() + ", " + this.getNumCarruagens() + " carruagem, " + this.getNumLugares() + " lugar, " + this.getNumPassageiros() + " passageiros";
		return result;
		
	}
	
}
