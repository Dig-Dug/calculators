package de.cbw.jav.calc;

public class TriangleApplication {

	static public void main(final String[] args) {
		// step 1: runtime arguments
		final double a = Double.parseDouble(args[0]);
		final double b = Double.parseDouble(args[1]);

		// step 2: computations
		final double c = calculateHypot(a, b);
		final double angleB = calculateAngleB(b, c);
		final double angleA = .5 * Math.PI - calculateAngleB(b, c);

		// step 3: output
		System.out.format("Längen:\n\ta = %.2f\n\tb = %.2f\n\tc = %.2f\n\n", a, b, c);
		System.out.format("Winkel:\n\talpha =\t%.1f°\n\tbeta =\t%.1f°\n\tgamma =\t90.0°\n\n", Math.toDegrees(angleA), Math.toDegrees(angleB));
		System.out.format("Zeitstempel:\n\tZeit:\t%1$tH:%1$tM:%1$tS\n\tDatum:\t%1$td.%1$tm.%1$tY\n\n", System.currentTimeMillis());
	}


	static public double calculateHypot (double a, double b) {
		return Math.sqrt(a * a + b * b);
	}


	static public double calculateAngleB (double b, double c) {
		return Math.asin(b / c);
	}
}