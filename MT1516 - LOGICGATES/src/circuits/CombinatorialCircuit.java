package circuits;

import java.util.ArrayList;

public class CombinatorialCircuit {
	private ArrayList<LogicVariable> variables = new ArrayList<LogicVariable>();
	
	public CombinatorialCircuit( ) {};
	
	public boolean addVariable(LogicVariable var) {
		for(LogicVariable element : variables) {
			if(element.equals(var))
					return false;
		}
		
		variables.add(var);
		return true;
	}

	public LogicVariable getVariableByName(String string) {
		for(LogicVariable element : variables) {
			if(element.getName().equals(string))
					return element;
		}
		
		return null;
	}
}
