Strings Encryption
input : 123456
output : 214365

CODE : (without using functions)
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<l;i+=2){
            for(int j=i+1;j<l;j+=2){
                char t = ch[i];
                ch[i] = ch[j];
                ch[j] = t;
                break;
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(ch[i]);
        }
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CODE : (using functions)
import java.util.*;
public class Main{
    public static String encryptedStr(String s){
        int l = s.length();
        char[] a = s.toCharArray();
        for(int i=0;i<l;i+=2){
            for(int j=i+1;j<l;j+=2){
                char t = a[i];
                a[i] = a[j];
                a[j] = t;
                break;
            }
        }
        String res = new String(a);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(encryptedStr(s));
    }
}
