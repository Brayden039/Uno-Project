import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    ArrayList <UnoCard> player = new ArrayList <UnoCard>();
    ArrayList <UnoCard> computer = new ArrayList <UnoCard>();

    for(int i = 0; i<7; i++)
    {
      UnoCard card = new UnoCard();
      player.add(card);
      UnoCard card2 = new UnoCard();
      computer.add(card2); 
    }

    System.out.println("ForLoops: ");
    System.out.println(" ");
    System.out.println("Player Cards: ");
    for(int i = 6; i>=0; i--)
    {
      System.out.print(player.get(i) + " ");
    }

    System.out.println("\nComputer Cards: ");
    for(int i = 6; i>=0; i--)
    {
      System.out.print(computer.get(i) + " ");
    }

    System.out.println(" " + "\n");
    System.out.println("ForEach loops: ");
    System.out.println(" ");

    
    System.out.println("Player Cards: ");
    for(UnoCard c : player)
    {
      System.out.print(c.toString() + " ");
    }

    System.out.println(" ");
    System.out.println("Computer Cards: ");
    for(UnoCard c : computer)
    {
      System.out.print(c.toString() + " ");
    }
  }
}