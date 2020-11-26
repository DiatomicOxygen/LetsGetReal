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

  
}
