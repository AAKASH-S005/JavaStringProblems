Write a program to count the number of vowels in the given string.

CODE : (without using functions)
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        char[] ch = Input.toCharArray();
        int length = Input.length();
        int c=0;
        for(int i=0;i<length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
                c++;
        }
        System.out.print("Number of vowels: "+c);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CODE : (using functions)
import java.util.*;
public class Main{
    public static int vowelCount(String s,int c){
        int l = s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<l;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String s = sc.nextLine();
        System.out.print(vowelCount(s,c));
    }
}
