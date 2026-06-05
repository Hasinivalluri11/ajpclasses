package ExceptionHandling;

class InsufficientBalanceException extends Exception
{

}

public class CustomExceptions2 {

    public static void main(String[] args) throws InsufficientBalanceException {

        int balance = 5000;
        int withdrawAmount = 7000;

        if(withdrawAmount <= balance)
        {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        else
        {
            try {
                InsufficientBalanceException i = new InsufficientBalanceException();
                throw i;
            }
            catch(InsufficientBalanceException e)
            {
                System.out.println("Insufficient Balance!!");
            }
        }
    }
}