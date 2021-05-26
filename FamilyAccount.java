class FamilyAccount{
  
  public static void main(String[] args){
    
    boolean isFlag = true;
    String details = "Income/Expense\tTotal\tAmount\tRemark\n";
    int balance = 10000;
    while(isFlag){
      
      System.out.println("------------Family Account------------\n");
      System.out.println("            1.\tDetails\n");
      System.out.println("            2.\tLog Income\n");
      System.out.println("            3.\tLog Expense\n");
      System.out.println("            4.\tQuit\n");
      
      //获取用户输入
      char selection = Utility.readMenuSelection();
      switch (selection){
        case '1':
          System.out.println("------------Account Summary------------");
          System.out.println(details);
          System.out.println("------------Account Summary------------");
          break;
        case '2':
	  System.out.println("Enter income amount: ");
	  int money = Utility.readNumber();
	  System.out.print("Enter income detail: ");
	  String info = Utility.readString();

	  //process balance
	  balance += money;
	  //process details
	  details += ("income\t" + balance + "\t" + money + "\t" + info + "\n");
	  System.out.print("------------Log Complete------------");
          break;
        case '3':
          System.out.println("            3.\tLog Expense\n");
          break;
        case '4':
          System.out.println("Are you sure you want to quit? [Y/N]");
          char isExit = Utility.readConfirmSelection();
          if (isExit == 'Y'){
            isFlag = false;
          }
      }
    }
    
  }
}
