package calculators;

/**
 * Simple calculator application class.
 * @author Felipe L.
 */
public class CalculatorApplication {

	/**
	 * Application entry point
	 * @param args the runtime arguments (left operand, operator, right operand)
	 * @throws IllegalArgumentException if the given operator symbol is illegal
	 */
	static public void main (final String[] args) {
		final double leftOperand = Double.parseDouble(args[0]);
		final double rightOperand = Double.parseDouble(args[2]);
		final String operator = args[1];

		final double result = calc (operator, leftOperand, rightOperand);
		System.out.println(leftOperand + " " + operator + " " + rightOperand + " = " + result);
	}


	/**
	 * Calculates the operator result.
	 * @param leftOperand the left operand
	 * @param operator the operator symbol (+, -, x, /, %, ^, #)
	 * @param rightOperand the right operand)
	 * @return the computation result
	 * @throws IllegalArgumentException if the given operator symbol is illegal
	 */
	static private double calc (final String operator, final double leftOperand, final double rightOperand) {
		switch (operator) {
			case "+":
				return leftOperand + rightOperand;
			case "-":
				return leftOperand - rightOperand;
			case "x":
				return leftOperand * rightOperand;
			case "/":
				return leftOperand / rightOperand;
			case "%":
				return leftOperand % rightOperand;
			case "^":
				return Math.pow(leftOperand, rightOperand);
			case "#":
				return Math.log(leftOperand) / Math.log(rightOperand);
			default:
				throw new IllegalArgumentException();
		}
	}
}
