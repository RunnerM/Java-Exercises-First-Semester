import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        int sum= 0;
        Scanner input= new Scanner(System.in);
        System.out.println("Start year: ");
        int sYear= Integer.parseInt(input.nextLine());
        System.out.println("End year: ");
        int eYear= Integer.parseInt(input.nextLine());
        for(date.set(0,0,sYear);date.getYear()<=eYear;date.set(0,0,date.getYear()+1)){
            if (date.isLeapYear()==true){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
