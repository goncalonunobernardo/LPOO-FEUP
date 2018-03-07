package railroad;

import java.util.ArrayList;

public class Comboio {
	private String nome;
	private ArrayList<Carruagem> carruagens = new ArrayList<Carruagem>();
	private int passageiros;
	protected ServicoABordo servico;

	public Comboio(String nome){
		this.nome = nome;
		this.servico = new ServicoRegular();
	}
	
	public int getNumPassageiros() {
		return passageiros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCarruagens() {
		return carruagens.size();
	}

	public void addCarruagem(Carruagem a) {
		carruagens.add(a);
	}

	public int getNumLugares() {
		int result = 0;
		for (Carruagem c : carruagens) {
			result += c.getNumLugares();
		}
		return result;
	}

	public Carruagem getCarruagemByOrder(int i) {
		return carruagens.get(i);
	}

	public void removeAllCarruagens(int capacity) {
		ArrayList<Carruagem> temp = new ArrayList<Carruagem>();

		for (Carruagem c : carruagens) {
			if (c.getNumLugares() != capacity)
				temp.add(c);
		}

		this.carruagens = temp;
	}

	public int getLugaresLivres() {
		return this.getNumLugares() - this.passageiros;
	}

	public void addPassageiros(int value)  throws PassengerCapacityExceeded{
		if(passageiros + value > this.getNumLugares())
			throw new PassengerCapacityExceeded();
		
		passageiros += value;
	}

	public void removePassageiros(int value)  throws PassengerCapacityExceeded{
		passageiros -= value;
	}
	public void removePassageiros()  throws PassengerCapacityExceeded{
		passageiros = 0;
	}

	@Override
	public String toString() {
		String result = "Comboio " + this.getNome() + ", " + this.getNumCarruagens() + " carruagens, " + this.getNumLugares() + " lugares, " + this.getNumPassageiros() + " passageiros";
		return result;
	}


	public boolean equals(Object c2)
	{
		if(c2!=null && c2 instanceof Comboio && carruagens.size() == ((Comboio) c2).carruagens.size())
		{
			for(int i =0;i<carruagens.size();i++)
			{
				if(carruagens.get(i).getNumLugares()!=((Comboio)c2).carruagens.get(i).getNumLugares())
					return false;
			}
			
			return true;
		}
		
		return false;
	}

	public ServicoABordo getServicoABordo() {
		return servico;
	}
	
	public String getDescricaoServico() {
		return servico.getDescricaoServico();
	}
	
	public void setServicoABordo(ServicoABordo servico) {
		this.servico = servico;
	}

	
}
