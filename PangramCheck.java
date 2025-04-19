Code to check if a String is a Pangram or not (Pangram -> A string that contains all alphabets)

CODE : (using functions)                                              
import java.util.*;                                                    
public class Main{                                                     
    public static boolean checkIfPangram(String sentence) {                 
        int[] freq = new int[26];                                           
        for(char ch : sentence.toCharArray()){                        
            freq[(int)ch-'a']++;                                      
        }                                                             
        for(int i : freq){                                            
            if(i==0) return false;                                    
        }                                                             
        return true;                                                  
    }                                                                 
    public static void main(String[] args){                           
        Scanner sc = new Scanner(System.in);                          
        String sentence = sc.nextLine();                              
        System.out.print(checkIfPangram(sentence));                   
    }                                                                 
}                                                                     
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CODE : (without using functions)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[(int)ch - 'a']++;
        }
        for(int i : freq){
            if(i==0) {
                System.out.print("false");
                break;
            }
            else {
                System.out.print("true");
                break;
            }
        }
    }
}
