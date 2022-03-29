package capitalizer;

public class Capitalizer {

        public static void main(String[] args) {
        // create a string
    String message = "assignment riza";
    
    // stores each characters of message to a charArray
    char[] charArray = message.toCharArray();
        
    for(int i = 0; i < charArray.length; i++) {
        
        // check if the array element is a letter
      if(Character.isLetter(charArray[i])) {
                      
            // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
       
        }
      }
    // convert the charArray to the string
    message = String.valueOf(charArray);
    System.out.println("Message: " + message);
    }
    
}

