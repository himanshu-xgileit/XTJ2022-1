import java.util.Scanner;
public class SwitchVowelExample {    
public static void main(String[] args) {    
// create an object of Scanner
Scanner input = new Scanner(System.in);

// take input from the user
System.out.println("Specifying Char : \n");
   // Character input
        char ch = input.next().charAt(0);
    switch(ch)   
    {  
        case 'a':   
            System.out.println("Vowel");  
            break;  
        case 'e':   
            System.out.println("Vowel");  
            break;  
        case 'i':   
            System.out.println("Vowel");  
            break;  
        case 'o':   
            System.out.println("Vowel");  
            break;  
        case 'u':   
            System.out.println("Vowel");  
            break;  
        case 'A':   
            System.out.println("Vowel");  
            break;  
        case 'E':   
            System.out.println("Vowel");  
            break;  
        case 'I':   
            System.out.println("Vowel");  
            break;  
        case 'O':   
            System.out.println("Vowel");  
            break;  
        case 'U':   
            System.out.println("Vowel");  
            break;  
        default:   
            System.out.println("Consonant");  
    }  
}    
}   