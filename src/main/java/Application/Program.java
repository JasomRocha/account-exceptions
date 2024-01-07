package Application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;
import model.exceptions.DomainExceptions;


public class Program {

    public static void main(String[] args) throws DomainExceptions{
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
     try{
        
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println(" ");
 
        Account account = new Account(number, holder, balance, withdrawLimit);
        
        System.out.print("Enter the amount for withdraw: ");
        Double amount = sc.nextDouble();
        
        account.withdraw(amount);
        
        System.out.println("New balance: " + account.getBalance());
        }
        //Tratando as exceções
        catch(DomainExceptions e){
            System.out.println("Withdraw Error: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected Error!");
        }
        
        
    }
}
