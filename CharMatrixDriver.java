

 
 
public class CharMatrixDriver
{
     public static void main (String[] args) {

      System.out.println("Create a CharMatrix filled with m's ...");
      CharMatrix matrix = new CharMatrix(4, 4, 'm');
      matrix.display();

      System.out.println("Testing setCharAt ...");
      System.out.println("  CharMatrix before method call:");
      matrix.display();
      
      matrix.setCharAt(0, 0, 'k');

      System.out.println("  CharMatrix after method call:");
      matrix.display();

   } 

}

