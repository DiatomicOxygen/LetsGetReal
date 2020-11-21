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


}
