import java.util.*;
class Password
{
  public static void main(String args[])
  {
    int length;
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the length of the password = ");
    length = sc.nextInt();

    String CapitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String LowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String SpecialCharacters = "@!$#";
    String Numbers = "1234567890";
   String CombinedCharacters = CapitalCaseLetters + LowerCaseLetters + SpecialCharacters + Numbers;

    Random random = new Random();
    char[] password = new char[length];
    
    password [0] = LowerCaseLetters.charAt(random.nextInt(LowerCaseLetters.length()));

    password [1] = CapitalCaseLetters.charAt(random.nextInt(CapitalCaseLetters.length()));

    password [2] = SpecialCharacters.charAt(random.nextInt(SpecialCharacters.length()));

password [3] = Numbers.charAt(random.nextInt(Numbers.length()));

    for(int i=4;i<length;i++)
      {
        password [i] = CombinedCharacters.charAt(random.nextInt(CombinedCharacters.length()));
      }
    System.out.println("Your Password is = ");
    System.out.print(password);
 }
}
