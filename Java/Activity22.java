import java.util.*;
class triangle
 {
   public static void main(String[] args)
    {
      int angle1, angle2, angle3;
   
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first angle of the triangle :");
      angle1 = s.nextInt();
      System.out.println("Enter second angle of the triangle :");
      angle2 = s.nextInt();
      angle3 = 180 - (angle1 + angle2);
      System.out.println("The third angle of the triangle is : " +angle3);
}
}