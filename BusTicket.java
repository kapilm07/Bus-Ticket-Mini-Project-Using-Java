package oops;
import java.util.Scanner;
public class BusTicket {
	public static void book(String[][]arr,String[]pass) throws InterruptedException
	{
		int ch=1;
		while(ch!=0)
		{
		if (arr[0][0].equals("[*]") && arr[0][1].equals("[*]") && arr[0][2].equals("[*]") &&
			    arr[1][0].equals("[*]") && arr[1][1].equals("[*]") && arr[1][2].equals("[*]") &&
			    arr[2][0].equals("[*]") && arr[2][1].equals("[*]") && arr[2][2].equals("[*]")) {
			    System.out.println("------SEATS ARE FULL------");
			    System.out.println("------NO TICKETS AVAILABLE------");
			    ch = 0;
			}
		else 
		{
		System.out.println("\n---------------   SELECT THE SEAT NUMBER YOU WANT   ---------------");
		System.out.println("---------------   STARRED '*' SEATS ARE BOOKED SEATS   ---------------\n---------------   SELECT OTHER AVAILABLE SEATS   ---------------");
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print("  ");
			}
			System.out.println();
			System.out.println();
		}
		String pas = null;
		Scanner obj = new Scanner(System.in);
		System.out.print("ENTER THE SEAT NUMBER TO BOOK : ");
		String m = obj.nextLine();
		switch(m)
		{
		case ("1"):
		{    if(arr[0][0]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[0][0]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[0]=pas;
		}
		}break;
		case ("2"):
		{ if(arr[0][1]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[0][1]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[1]=pas;
		}
		}break;
		case ("3"):
		{ if(arr[0][2]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[0][2]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[2]=pas;
		}
		}break;
		case ("4"):
		{ if(arr[1][0]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[1][0]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[3]=pas;
		}
		}break;
		case ("5"):
		{ if(arr[1][1]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[1][1]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[4]=pas;
		}
		}break;
		case ("6"):
		{ if(arr[1][2]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			break;
		}
		else {
			arr[1][2]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[5]=pas;
		}
		}break;
		case ("7"):
		{ if(arr[2][0]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[2][0]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[6]=pas;
		}
		}break;
		case ("8"):
		{ if(arr[2][1]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[2][1]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[7]=pas;
		}
		}break;
		case ("9"):
		{ if(arr[2][2]=="[*]")
		{
			System.out.println("---------------- THAT SEAT IS ALREADY BOOKED BY SOMEONE ----------------");
			book(arr,pass);
		}
		else {
			arr[2][2]="[*]";
			System.out.print("ENTER THE PASSENGER NAME : ");
			pas = obj.nextLine();
			pass[8]=pas;
		}
		}break;
		default:
		{
			System.out.println("-------------- Enter The Correct Seat Number From 1 to 9 --------------");
			book(arr,pass);
		}
		}
		System.out.println("-----------------------------------------------------------");
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print("  ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("---------------- Your Seat Has Been Locked ----------------\n\n---------------- Pay 500 INR to Book/Confirm Your Seat ----------------\n");
		System.out.print("Enter Card Number : ");
		long card = obj.nextLong();
		System.out.print("Enter CVV : ");
		int cvv = obj.nextInt();
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("     Paying.............\n");
		Thread.sleep(4000);
		System.out.println("----------  Payment Succesful  ----------\n");
		System.out.println("---------------------------- YOUR TICKET ----------------------------\n");
		System.out.println("Ticket booked for : "+pas+"\nSeat Number       : "+m+"");
		System.out.println("Start Place       : TIRUNELVELI at 10:00pm\nEnd Place         : SALEM at 6:00am\n");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("\n  Do You Want to Book Another Ticket(Press 1 for YES) & (Press 0 for NO) ? ");
		ch = obj.nextInt();
		}		
	}
	}
	public static void cancel(String[][]arr,String[]pass) throws InterruptedException
	{   
		if (arr[0][0].equals("[1]") && arr[0][1].equals("[2]") && arr[0][2].equals("[3]") &&
			    arr[1][0].equals("[4]") && arr[1][1].equals("[5]") && arr[1][2].equals("[6]") &&
			    arr[2][0].equals("[7]") && arr[2][1].equals("[8]") && arr[2][2].equals("[9]")) 
		{
			System.out.println("-----  NO TICKET IS BOOKED FOR CANCELLATION  -----\n\n");
		}
		else {
        Scanner obj = new Scanner(System.in);
        System.out.println("-----  WHICH SEAT NUMBER YOU'VE PREVIOUSLY BOOKED or ENTER THE SEAT NUMBER YOU WANT TO CANCEL  :  -----");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("ENTER THE SEAT NUMBER YOU WANT TO CANCEL : ");
        String seat = obj.nextLine();
        seat="["+seat+"]";
        switch(seat)
        {
        case ("[1]"):
		{
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[0]))
			{
				pass[0]=null;
				arr[0][0]="[1]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}			
		}break;
		case ("[2]"):
		{	
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[1]))
			{
				pass[1]=null;
				arr[0][1]="[2]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[3]"):
		{
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[2]))
			{
				pass[2]=null;
				arr[0][2]="[3]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[4]"):
		{
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[3]))
			{
				pass[3]=null;
				arr[1][0]="[4]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[5]"):
		{
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[4]))
			{
				pass[4]=null;
				arr[1][1]="[5]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[6]"):
		{	
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[5]))
			{
				pass[5]=null;
				arr[1][2]="[6]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[7]"):
		{
			arr[2][0]="7";
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[6]))
			{
				pass[6]=null;
				arr[2][0]="[7]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[8]"):
		{
			arr[2][1]="8";
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[7]))
			{
				pass[7]=null;
				arr[2][1]="[8]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		case ("[9]"):
		{
			System.out.print("ENTER THE PASSENGER NAME : ");
			String pascan = obj.nextLine();
			if(pascan.equals(pass[8]))
			{
				pass[8]=null;
				arr[2][2]="[9]";
			}
			else
			{
				System.out.println("\n-------INVALID PASSENGER NAME--------");
			}
		}break;
		default:
		{
			System.out.println("\n-------------- Enter The Correct Seat Number From 1 to 9 --------------\n");
			cancel(arr,pass);
		}
        }
        boolean a = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(seat)) {
                    arr[i][j] = seat;
                    a = true;
                    break;
                }
            }
            if (a) {
                break;
            }
        }
        System.out.println("\nLoading......\n");
        Thread.sleep(4000);
        if (a) {
            System.out.println("---------------             Seat " + seat + " has been canceled.           --------------- \n");
            System.out.println("--------------- 500 INR will Get Refunded to Your Account within 3 Days --------------- \n");
        } else {
            System.out.println("Seat Number " + seat + " not found or You Can't Cancel That Seat.\n\n");
        }
        }
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner obj = new Scanner(System.in);
		String a[][]= new String[3][3];
		a[0][0]="[1]";
		a[0][1]="[2]";
		a[0][2]="[3]";
		a[1][0]="[4]";
		a[1][1]="[5]";
		a[1][2]="[6]";
		a[2][0]="[7]";
		a[2][1]="[8]";
		a[2][2]="[9]";
		String pasname[]= new String[9];
		while(true)
		{
		System.out.println("\n--------------------- TIRUNELVELI TO SALEM Bus Ticket Booking ----------------------");
		System.out.println("\n-----------------------------           WELCOME          ---------------------------");
		System.out.println("|                                                                                  |");
		System.out.println("|                                 -----  OPTIONS  -----                            |");
		System.out.println("|                                  1.Book Ticket                                   |\n|                                  2.Cancel Ticket                                 |");
		System.out.println("|                                                                                  |");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("  What do You want to Do ?  ");
		int ch = obj.nextInt();
		switch(ch)
		{
		case(1):
		{
			book(a,pasname);
			break;
		}
		case(2):
		{
			cancel(a,pasname);
			break;
		}
		default:
		{
			System.out.println("    Enter the Option Correctly....Either 1 or 2\n\n");
		}
		}
		}
	}
}
