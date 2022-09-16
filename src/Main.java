public class Main {
    public static void main(String[] args)
    {
      Stack s = new Stack(5);
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);

        System.out.println("________________________________________________________________");

      System.out.println("After pushing elements to the stack new array is : ");
      s.display();



        System.out.println("________________________________________________________________");

      s.pop();
      s.pop();

        System.out.println("________________________________________________________________");

      System.out.println("After removing the elements from stack the new array is : ");
      s.display();
    }
}
