public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other) {
    if (this.getValue() == 0 || other.getValue() == 0) {
      return this.getValue() == 0 && other.getValue() == 0;
    }
    return (Math.abs((this.getValue() - other.getValue())/other.getValue()) < .00001);
  }
}
