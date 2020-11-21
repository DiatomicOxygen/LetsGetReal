public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (nume < 0 || deno < 0) {
      numerator = Math.abs(nume) * -1;
      denominator = Math.abs(deno) * -1;
    }
    if (deno == 0) {
      denominator = 1;
      numerator = 0;
    }
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

  public RationalNumber reciprocal(){
    RationalNumber R = new RationalNumber(denominator, numerator);
    return R;
  }

  public boolean equals(RationalNumber other){
    return (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
  }

  public String toString(){
    if (numerator < 0) {
      return numerator + "/" + (denominator * -1);
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

}
