public abstract class Number {
  public abstract double getValue();

  public int compareTo(Number other){
    if (this.getValue() == other.getValue()) {
      return 0;
    }
    if (this.getValue() >= other.getValue()) {
      return 1;
    }
    return -1;
  }

  public boolean equals(Number other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      return this.getValue() == 0 && other.getValue() == 0;
    }
    return (Math.abs((this.getValue() - other.getValue())/other.getValue()) < .00001);
  }
}
