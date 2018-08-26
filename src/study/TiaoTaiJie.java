package study;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */

import java.util.Scanner;

public class TiaoTaiJie {
		  
		   public static int Fbre(int k){
		  if (k==1)  return 0;
		  else if(k==2) return 1;
		  else if(k==3) return 2;
		   else return Fbre(k-2)+Fbre(k-1);
	      }

		  public static int Fb(int k){
		    if(k==1) return 0;
		    if(k==2) return 1;
		    if(k==3) return 2;
		    int temp=0;
		    int sum=2;
		    int f=1;
		       while(k>3){
		         temp=sum;
		       sum=f+sum;
		         f=temp;
		         k--;   
		       }
		  return sum;		  
		  }
		  
		public static void main (String[] args){
		       Scanner sc=new Scanner(System.in);
		      int n=sc.nextInt();
		       for(int i=0;i<n;i++){
		               int k=sc.nextInt();
		               System.out.println(Fbre(k));
		       }
		    }

	}

