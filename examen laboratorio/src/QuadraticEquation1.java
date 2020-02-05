
public class QuadraticEquation1 {
  private double a;
  private double b;
  private double c;
  public QuadraticEquation1(double a,double b,double c) {
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }
  public double geta() {
	  return this.a;
  }
  public double getb() {
	  return this.a;
  }
  public double getc() {
	  return this.a;
  }
  public double getDiscriminant() {
	  double dis;
	  dis=Math.pow(b,2)-4*a*c;
	  return dis;
  }
  public double getRoot1() {
	  double dis;
	  dis=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
	  return dis;
  }
  public double getRoot2() {
	  double dis;
	  dis=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
	  return dis;
  }
  
}
