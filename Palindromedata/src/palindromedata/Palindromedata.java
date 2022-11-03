package palindromedata;

import java.util.Arrays;
import java.util.Scanner;


public class Palindromedata {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        Stack st = new Stack(100);
        Queue qu = new Queue(100);
        
        String word ;
        System.out.println("enter a word: ");
        word = sc.next();
        int n = word.length();
        
        char [] letters = word.toCharArray();
        int i = 0 ;
        while(i<n){
            st.push(letters[i]);
            qu.enQueue(letters[i]);
            i++;
        }
        boolean result = true;
        
        while(!st.isEmpty()){
            if(st.pop()!= qu.deQueue()){
                result = false;
                break;
                
            }
        }
        if(result)
            System.out.println(letters+" is polindrome");
        else
            System.out.println(letters+" is not polindrome");
        
        
        
    }
    
}
