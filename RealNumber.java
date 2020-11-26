public class RealNumber extends Number{
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

  //Assignment 20

  public RealNumber add(RealNumber other) {
    RealNumber R = new RealNumber(this.getValue() + other.getValue());
    return R;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber R = new RealNumber(this.getValue() * other.getValue());
    return R;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber R = new RealNumber(this.getValue() / other.getValue());
    return R;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber R = new RealNumber(this.getValue() - other.getValue());
    return R;
  }

}
