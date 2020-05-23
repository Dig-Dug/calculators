package calculators;


public class GgtApp {

	static public void main (String[] args) {
		final long left = Long.parseLong(args[0]);
		final long right = Long.parseLong(args[1]);

		final long ggt = ggt(left, right);
		System.out.format("ggt(%d, %d) = %d\n", left, right, ggt);
	}

	static public long ggt (final long left, final long right) {
		// TODO: replace with implementation (%, for)
		return 0;
	}
}
