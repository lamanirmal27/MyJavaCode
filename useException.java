import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "My Exception Occured";
    }
        
}
public class useException {
    void deposite() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your amount: ");
        int amt = sc.nextInt();
        sc.close(); 
        if(amt < 100) {
            throw new MyException();
        }
        System.out.println("Deposite Sucessfull");
    }
    public static void main(String[] args) throws Exception{
        useException obj = new useException();
        try {
            obj.deposite();
        } catch (Exception e) {
            System.out.println("Custom Exception: " +e);
        }
    }
}
