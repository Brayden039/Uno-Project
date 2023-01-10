import java.util.*;
public class UnoCard
{
  private int number;
  private char color;

  public UnoCard()
  {
    number = (int)(Math.random() * 9 + 1); 
    
    ArrayList<Character> colors = new ArrayList<Character>();
    colors.add('R');
    colors.add('G');
    colors.add('Y');
    colors.add('B');
    int number2 = (int)(Math.random() * 4 );  
    color = colors.get(number2); 
    
  }
  
  public String toString()
  {
    return ("" + color  + number);
  }
}