public class QuadraticFunction
{
  private double a;
  private double b;
  private double c;

  public QuadraticFunction(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA()
  {
    return a;
  }

  public double getB()
  {
    return b;
  }

  public double getC()
  {
    return c;
  }

  public double getValue(double x)
  {
    return a * x * x + b * x + c;
  }

  public String getRoots()
  {
    if((Math.pow(b,2)-4*a*c)<0){
      return "No roots";
    }else if((Math.pow(b,2)-4*a*c)==0){
      return "One root: "+(-b/2*a);
    }else{
      return "Two roots: ("+((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a)+";"+((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a)+")";
    }
  }
}

