 
import javax.swing.JOptionPane;
import java.util.Random;

public class Guess_Num {
 public static void main(String[] args) {
 
        
        Random random = new Random();
        int randomNumber=random.nextInt(10);
        boolean userCorrect=false;
        String userInpuString;
        int userGuessedNumber;
        
          while(!userCorrect)
          {
              userInpuString=JOptionPane.showInputDialog("Guess the Numebr");
              userGuessedNumber=Integer.parseInt(userInpuString);
              if(userGuessedNumber>randomNumber)
              {
                  JOptionPane.showMessageDialog(null,"Too high! Number Try Again" );
                          
              }
              else if(userGuessedNumber<randomNumber)
              {
                  JOptionPane.showMessageDialog(null,"Too Low! Number Try Again" );
              }
              else if(userGuessedNumber==randomNumber)
              
                  
              {
                  JOptionPane.showMessageDialog(null,"Yes ,You SuccussFully Passed Game" );
              }
              else{
                   System.exit(0);
              }
          }     
         
    }
    
}
