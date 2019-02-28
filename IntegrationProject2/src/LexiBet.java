import java.util.Scanner;

public class LexiBet {
	
    public static void main (String[] args) {
        String smallest = " ";
        String largest = " ";
        String s = "welcomtojava";
        
        int k = 3;
        
        for(int i = 0; i <= s.length()-k; i++) {
        	String lexicograph = s.substring(i, i+k);
        	if(i==0) {
        		smallest = lexicograph;
        	}
        	if(lexicograph.compareTo(largest)>0) {
        		largest = lexicograph;
        	}
        	else if (lexicograph.compareTo(smallest)<0) {
        		smallest = lexicograph;
        	}
        	  
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
         System.out.println(smallest + "\n" + largest);
    }

}

