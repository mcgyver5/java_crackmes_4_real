import java.util.Scanner;

public class RandomPassword1{
    public String buildRandomString(int stringLen){
     String yourString = "";
     String allowedChars = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_$%&#@?:"; 
     for(int x = 0; x <= stringLen; x++){
     
        int i = (int)(allowedChars.length() * Math.random());
        yourString = yourString + allowedChars.charAt(i);
     
     }
        return yourString;
    
    }
    
   
    
    public static void main(String[] args){
        int a = 8;
        int b = 9;
        int c = 10;
        String name = "mcguire";
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Password");
      //  String passwd = scanner.nextLine();
        
        String guess = "yyyeee999asdfg";
        
        RandomPassword rp = new RandomPassword();
        String correctPass = rp.buildRandomString(14);
        //System.out.println(correctPass);
        System.out.println("Checking " + passwd + " against " + correctPass);

        if(correctPass.equals(passwd)){
            
            System.out.println("CORRECT");
        } else {
            System.out.println("WRONG. Correct password was " + correctPass + " Try again");
        }
    }


}
