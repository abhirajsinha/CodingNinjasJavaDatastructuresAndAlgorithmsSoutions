
public class solution {

	public static boolean isStringPalindrome(String input) {
if(input.length() == 1){
          return true;
        }
      if(input.length() == 2){
        if(input.charAt(0) == input.charAt(1))
          return true;
        else
          return false;
      }
      if(input.charAt(0) == input.charAt(input.length()-1)){
        return  isStringPalindrome(input.substring(1,input.length() - 1));
      }
      else 
        return false;
        }

	}

