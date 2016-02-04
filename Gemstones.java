import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) {
        //Scanner object for taking input
		Scanner sc = new Scanner(System.in);
        
		//Number of input compositions
        int n = sc.nextInt();
        
        //Integer represents length of input string
        int len=0;
        
        //Loop iterators
        int j=1,i=0;
        int tempCompositionCount=n;
        
        //Counter for counting gemstones
        int count=0;
        
        //Array of integers representing frequencies of each letter
        int[] arr = new int[26];
        
        //Input String
        String inputString=null;
        
        //While all compositions are not processed
        while(n-- != 0)
        {
        	//Accepting input string
        	inputString = sc.next();
        	
        	//Calculating length of string
        	len = inputString.length();
        	
        	//For each letter in the composition, increment frequency only once for each occurrence
        	for(i=0;i<len;i++)
        		if(arr[inputString.charAt(i) - 'a'] == j-1)
          			arr[inputString.charAt(i) - 'a']++;
           	//Incrementing J for each composition
        	j++;
        }
                   
        //Letter frequency should be equal to the number of compositions to satisfy the 'atleast once' condition
        for(i=0;i<26;i++)
        {
        	//Incrementing count of unique gemstones
        	if(arr[i] == tempCompositionCount)
        		count++;
        }
        	
        //Displaying output
        System.out.println(count);
    }
}
