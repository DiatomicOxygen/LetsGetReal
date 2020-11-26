public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = Math.abs(nume);
    denominator = Math.abs(deno);
    if (nume * deno < 0) {
      numerator = Math.abs(nume) * -1;
      denominator = Math.abs(deno);
    }
    if (deno == 0 || nume == 0) {
      denominator = 1;
      numerator = 0;
    }
    reduce();
  }

  public double getValue(){
    if (numerator < 0) {
      return -1 * (double)(numerator) / (double)(denominator);
    }
    return (double)(numerator) / (double)(denominator);
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  //Assignment 20
  public RationalNumber reciprocal(){
    RationalNumber R = new RationalNumber(denominator, numerator);
    return R;
  }

  public boolean equals(RationalNumber other){
    return (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
  }

  public String toString(){
    if (numerator == 0) {
      return 0 + "";
    }
    if (denominator == 1) {
      return numerator + "";
    }
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b) {
    int A = Math.max(Math.abs(a),Math.abs(b));
    int B = Math.min(Math.abs(a),Math.abs(b));
    int r = 1;
    while (r > 0) {
      r = A % B;
      A = B;
      B = r;
    }
    return A;
  }

  private void reduce(){
    if (numerator != 0) {
      int gcd = gcd(numerator, denominator);
      numerator = numerator / gcd;
      denominator = denominator / gcd;
    }
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber R = new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    return R;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber R = new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
    return R;
  }

  public RationalNumber add(RationalNumber other){
    int nume = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
    int deno = this.getDenominator() * other.getDenominator();
    if (nume == 0) {
      RationalNumber R0 = new RationalNumber(nume, 1);
      return R0;
    }
    int gcd = gcd(nume, deno);
    RationalNumber R = new RationalNumber(nume/gcd, deno/gcd);
    return R;
  }

  public RationalNumber subtract(RationalNumber other){
    int nume = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
    int deno = this.getDenominator() * other.getDenominator();
    if (nume == 0) {
      RationalNumber R0 = new RationalNumber(nume, 1);
      return R0;
    }
    int gcd = gcd(nume, deno);
    RationalNumber R = new RationalNumber(nume/gcd, deno/gcd);
    return R;
  }
}
