package assign;

import java.util.Scanner; 

public class Armstrong{
      int a;
        public boolean isArmstrong(int a) {
        	
        	//sum of the cubes of the digits of any number is equal to the number it self Armstrong no.
            int temp, digits=0, last=0, sum=0;   
              
            temp=a;   
             
            while(temp>0)    
            {   
            temp = temp/10;   
            digits++;   
            }   
            temp = a;   
            while(temp>0)   
            {   
                 
            last = temp % 10;   
            
            sum +=  (Math.pow(last, digits));   
            
            temp = temp/10;   
            }  
              
            if(a==sum)   
            
            return true;      
            
            else return false;   
        } 

   public static void main(String[] args) {
        
        Armstrong pf = new Armstrong();
        int num;   
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the number: ");  
         
        num=sc.nextInt();  
        if(pf.isArmstrong(num))  
        {  
        System.out.println("Number is Armstrong ");  
        }  
        else   
        {  
        System.out.println("Not a Armstrong number ");  
        }   
        // TODO Auto-generated method stub 

   } 

}

