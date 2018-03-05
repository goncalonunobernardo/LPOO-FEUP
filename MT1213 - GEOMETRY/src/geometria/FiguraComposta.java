package geometria;

import java.util.ArrayList;

public class FiguraComposta extends Figura implements Countable {

	private ArrayList<Figura> figuras = new ArrayList<>();
	
	public FiguraComposta(Figura[] figuras) {
		for(Figura f: figuras) {
			this.figuras.add(f);
		}
	}
	
	@Override
	public double getArea() {
		double result = 0;
		for(Figura elem : figuras)
		{
			result += elem.getArea();
		}
		
		return result;
	}

	@Override
	public double getPerimetro() {
		double result = 0;
		for(Figura elem : figuras)
		{
			result += elem.getPerimetro();
		}
		
		return result;
		
	}
	@Override
	public int count() {
		return this.figuras.size();
	}

}
