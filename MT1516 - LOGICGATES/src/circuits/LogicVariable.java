package circuits;

public class LogicVariable {
	private String name;
	private boolean value;
	private LogicGate calculatedBy;
	
	public LogicVariable(String name, boolean value) {
		this.name = name;
		this.value = value;
	}
	public LogicVariable(String name) {
		this.name = name;
	}

	public boolean getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogicVariable other = (LogicVariable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	public LogicGate getCalculatedBy() {
		return calculatedBy;
	}
	
	public String getFormula() {
		if(calculatedBy == null)
			return name;
		
		return calculatedBy.getFormula();
	}
	
	public void setCalculatedBy(LogicGate value) {
		this.calculatedBy = value;
	}
}
