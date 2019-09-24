public class CarTest
{
  public static void main(String[] args)
  {
    Engine engine= new Engine("audi",120,2,false);
    Car myCar = new Car("1999","x3",true,"blue",engine);
    System.out.println(myCar);
  }
}
