package strange_dice;
public class Fraction {
	private int numerator;
	private int denominator;

	/**
	 * Creates a new Fraction
	 * @param numerator the numerator. Must be >= 0
	 * @param denominator the denominator. Must be > 0
	 * @throws IllegalArgumentException if inputs is negative
	 * @throws IllegalArgumentException if denominator is 0
	 */
	public Fraction(int numerator, int denominator) {
		if (denominator == 0){
			throw new IllegalArgumentException("Cannot create fraction with denominator of 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * Gets the numerator of the Fraction
	 * @return the numerator
	 */
	public int getNumerator() {
		return this.numerator;
	}

	/**
	 * Gets the denominator of the Fraction
	 * @return the denominator
	 */
	public int getDenominator() {
		return this.denominator;
	}
	/**
	 * Sets the numerator and denominator of current fraction
	 * @param num Numerator
	 * @param den Denominator
	 */
	public void setNumeratorDenominator(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}
	/**
	 * Checks if a Fraction is equal to another
	 * @param other the Fraction to compare to
	 * @return true if equal, else false
	 */
	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || !(obj.getClass().equals(Fraction.class))) {
			return false;
		}
		Fraction other = ((Fraction) obj);
		return this.numerator == other.numerator && this.denominator == other.denominator;
	}

	/**
	 * Gets the String representation of a Fraction
	 * @return a string representation of a Fraction
	 */
	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	/**
	 * Computes the GCD (greatest common divisor) of two numbers.
	 * Needed for fast LCM computation
	 * @param a the first number. Must be >= 0
	 * @param b the second number. Must be >= 0
	 * @return the gcd of two numbers
	 */
	public static int gcd(int a, int b) {
		if (a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		}
		return gcd(b,a % b);
	}

	/**
	 * Computes the LCM (lowest common multiple) of two numbers
	 * @param a the first number. Must be > 0
	 * @param b the second number. Must be > 0
	 * @return the LCM of two numbers
	 */
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}

	/**
	 * Computes common LCM between two fractions' denominators
	 * @param other another Fraction
	 * @return LCM common to this fraction and another's denominator
	 */
	public int commonDenominatorLcm(Fraction other){
		return lcm(this.denominator, other.getDenominator());
	}

	/**
	 * Creates a new Fraction that is the result from the multiplication of a Fraction and a constant
	 * @param c the constant
	 * @return a new Fraction, the result of the multiplication by a constant
	 */
	public Fraction mulC(int c) {
		return new Fraction(this.numerator*c, this.denominator);
	}

	/**
	 * creates a new Fraction that is the result from the division of a Fraction and a constant
	 * @param c a constant
	 * @return a new Fraction, the result of the division by a constant
	 */
	public Fraction divC(int c){
		return new Fraction(this.numerator, this.denominator * c);
	}

	/**
	 * Creates a new Fraction that is the result from multiplying two Fractions
	 * @param other the other Fraction to multiply
	 * @return a new Fraction, the result of the multiplication of two Fractions
	 */
	public Fraction mul(Fraction other) {
		return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
	}

	/**
	 * Creates a new Fraction that is the result from the addition of two Fractions
	 * @param other the other Fraction to add
	 * @return a new Fraction, the result of the addition of two Fractions
	 */
	public Fraction add(Fraction other) {
		if (this.denominator == other.denominator) {
			return new Fraction(this.numerator + other.numerator, this.denominator);
		} else {
			int lcm = lcm(this.denominator,other.denominator);

			int firstNumerator = this.numerator*lcm/this.denominator;
			int secondNumerator = other.numerator*lcm/other.denominator;
			return new Fraction(firstNumerator + secondNumerator, lcm);
		}
	}

	/**
	 * Creates a new Fraction that is the result from the subtraction of two Fractions
	 * @param other the other Fraction to subtract
	 * @return a new Fraction, the result of the subtraction of other from current fraction
	 */
	public Fraction subtract(Fraction other){
		// multiply other with -1/1 and add
		return this.add(new Fraction(-1,1).mul(other));
	}

	/**
	 * Sums the numerator with the denominator
	 * @return sum of numerator and denominator
	 */
	public int digitSum(){
		return this.numerator + this.denominator;
	}

	/**
	 * Gets the integer value of the fraction.
	 * Rounding errors expected
	 * @return integer with rounded down value of fraction
	 */
	public int getIntegerValue(){
		return this.getNumerator()/this.getDenominator();
	}

	/**
	 * Gets the floating point value of the fraction.
	 * @return double with value of fraction
	 */
	public double getValue(){
		return ((this.getNumerator()*1.0)/(this.getDenominator()*1.0));
	}

	/**
	 * Compares two fractions and determines if current fraction is bigger
	 * @param other another fraction
	 * @return true if current fraction is bigger
	 */
	public boolean isBigger(Fraction other){
		return ((this.getNumerator()/this.getDenominator()) > (other.getNumerator()/other.getDenominator()));
	}

	/**
	 * Turns an integer into a fraction
	 * @param num an integer
	 * @return a fraction: num/1
	 */
	public static Fraction fractionFromInt(Integer num){
		return new Fraction(num, 1);
	}

	/**
	 * Get the inverse of the fraction
	 * @return new fraction containing the inverse of the current one
	 */
	public Fraction inverse(){
		return new Fraction(this.denominator, this.numerator);
	}

	/**
	 * Divide current fraction by another
	 * @param other another fraction
	 * @return new fraction with result of dividing the current fraction by other
	 */
	public Fraction divide(Fraction other){
		return this.mul(other.inverse());
	}

	/**
	 * simplifies fraction
	 */
	public Fraction simplify(){
		int gcd = gcd(numerator, denominator);
		return new Fraction(numerator/gcd, denominator/gcd);
	}
}
