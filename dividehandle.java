import java.util.Scanner;

public class dividehandle {
    void divide(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter one number: ");
            int num = sc.nextInt();
            System.out.println("Enter divider number: ");
            int mun = sc.nextInt();
            int result = num/mun;
            System.out.println("Answer is " + result);
        }catch(Exception e){
            System.out.println("Enter valid divider.");
        }
        finally{
            sc.close();
        }
    }
    public static void main(String[] args) {
        dividehandle obj = new dividehandle();
        obj.divide();
    }
}
