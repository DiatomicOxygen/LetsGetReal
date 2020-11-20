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
}
