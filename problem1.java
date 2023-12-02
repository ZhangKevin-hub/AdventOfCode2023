import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * d1p1
 */
public class problem1 {
    public static void main(String[] args) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String text;
            while ((text = reader.readLine()) != null) {
                char first = '0';
                char last = '0';
                for(int i = 0; i<text.length()-1;i++){
                    if(Character.isDigit(text.charAt(i))){
                        first = text.charAt(i);
                        break;
                    }
                }
                for(int i = text.length()-1; i>0;i--){
                    if(Character.isDigit(text.charAt(i))){
                        last = text.charAt(i);
                        break;
                    }
                }
                int currValue = Integer.parseInt(""+first+last);
                sum+=currValue;
            }
            reader.close(); // Close the file reader after usage
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    
    }
}