public class ATM {
        static int balance=50000;
        public static void main(String[] args) 
        {
            java.util.Scanner a=new java.util.Scanner(System.in);
            String str=readCard();
            if(str.equals("boi"))
            {
                System.out.println("1 for enter PIN\n2 for Green PIN");
                int n=a.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.println("Please Enter The PIN...");
                        int pin=a.nextInt();
                        if(pin==1234)
                        {
                            System.out.println("Welcome...");
                            getOption();
                        }
                        else
                        {
                            System.out.println("Incorrect Password...");
                        }
                        break;
                    case 2:
                        System.out.println("Please Enter The OTP Sent");
                        int e=a.nextInt();
                        if(e==1010)
                        {
                            System.out.println("Please Set Your Password:");
                            int f=a.nextInt();
                            System.out.println("Password Set Successfully..."+"\nDo You Want To Continue\n1 For YES.\n2For NO");
                            int g=a.nextInt();
                            switch(g)
                            {
                                case 1:
                                    getOption();
                                    break;
                                case 2:
                                    System.out.println("Thanks For Visiting...");
                                default :
                                    System.out.println("Please Enter A Valid Option...");
                            }
                        }
                        else
                        {
                            System.out.println("Incorrect OTP...");
                        }
                    default :
                    System.out.println("Please Select A Valid Option");
                }
            }
        }
        public static String readCard()
        {
            System.out.println("Enter card details...");
            java.util.Scanner a=new java.util.Scanner(System.in);
            String str=a.nextLine();
            return str;   
        }
        public static void getOption()
        {
            java.util.Scanner a=new java.util.Scanner(System.in);
            System.out.println("select type of account:\n1 for saving\n2 for current");
            int n=a.nextInt();
            switch(n)
            {
                case 1:
                    saving();
                    break;
                case 2:
                    saving();
                    break;
                default :
                    System.out.println("Please select a valid Option....");
            }
        }
        public static void saving()
        {
            java.util.Scanner a=new java.util.Scanner(System.in);
            System.out.println("select option :\n1 for withdraw\n2 for Deposite");
            int n=a.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter Amount");
                    int m=a.nextInt();
                    if(m>balance)
                    {
                        System.out.println("insufficient Balance");
                    }
                    else
                    {
                        System.out.println("collect the cash and the card properly\n");
                        balance=balance-m;
                    }
                    System.out.println("Do you want to see your balance\n1 for YES\n2 for NO");
                    int p=a.nextInt();
                    if(p==1)
                    {
                        System.out.println("Available Balance : "+balance+"\nThanks For Visiting");    
                    }
                    else if(p==2)
                    {
                        System.out.println("Thanks for visiting");
                    }
                    else
                    {
                        System.out.println("Please select a valid Option....");
                    }
                    break;
                case 2:
                    System.out.println("Enter Amount");
                    int c=a.nextInt();
                    System.out.println("Enter the Cash Properly\n");
                    balance=balance+c;
                    System.out.println("\nCash Deposited Successfully...\n\nDo you want to see your balance\n1 for YES\n2 for NO");
                    int d=a.nextInt();
                    if(d==1)
                    {
                        System.out.println("\nAvailable Balance : "+balance+"\n\nThanks For Visiting"+"\n\nPlease Collect Your Card");    
                    }
                    else if(d==2)
                    {
                        System.out.println("Thanks for visiting"+"\n\nPlease Collect Your Card");
                    }
                    else
                    {
                        System.out.println("Please select a valid Option...."+"\n\nAnd Collect Your Card");
                    }
                    break;
                default :
                    System.out.println("Please Select A Valid Option...");
            }
        }
    }