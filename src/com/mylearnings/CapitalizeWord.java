import java.util.Locale;

public class CapitalizeWord {

    public static void main(String args[]){
        String toCap = "hello world";
        CapitalizeWord cap = new CapitalizeWord();
        System.out.println(cap.Capitalize(toCap));
    }

    public String capitalizeWord(String str){
        String capStr= "";
        int len = str.length();
        Character c1;
        // if length zero, return blank
        // else capitalize the first character
        // then check if the character is letter or not, if not, check if it is a blank/space
        // if space, then capitalize next letter
        if(len  ==0){
            return "";
        }
       for(int i=0; i <str.length(); i++) {
           //

       }
        return capStr;
       }

       public String Capitalize(String str){
        String[] words = str.split(" ");
        String caps ="";
        for(String word : words){
            String first = word.substring(0,1);
            word =word.replace(first , first.toUpperCase());
            caps +=word;
            caps +=" ";
        }
        return caps;
       }

    }
