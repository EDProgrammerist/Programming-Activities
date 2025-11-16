class Main {
  public static void main(String[] args) {

    int num = 234, reversed = 0;
    
    System.out.println("The original number: " + num);

    while(num != 0) {
    
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }

    System.out.println("The reverse of the said number: " + reversed);
  }
}