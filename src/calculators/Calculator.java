package calculators;

public class Calculator {
	private double OperandOne;
	private String Operation;
	private double OperandTwo;
	private double Results;
	
	public Calculator() {
		
	}
	public double getOperandOne() {
		return OperandOne;
	}
	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public double getOperandTwo() {
		return OperandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	public double getResults() {
		return Results;
	}
	public void setResults(double results) {
		Results = results;
	}
	
	public void performOperation() {
		if(Operation.equals("+")){
			Results = OperandOne + OperandTwo;

		}
		else if(Operation.equals("-")) {
			Results = OperandOne - OperandTwo;
		}
	}
	
	
}
