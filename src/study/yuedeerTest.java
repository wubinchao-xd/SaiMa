package study;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */	
import java.util.Scanner;
public class yuedeerTest {
	public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	         String history=new String(sc.nextLine());
	         String starrySky=new String(sc.nextLine());
	          int n=history.length();
	         char[] ch=new char[n];
	         char[]  star=new char[n];
	  for(int k=0;k<n;k++){
	         ch[k]=history.charAt(k);
	          star[k]=starrySky.charAt(k);}
	    double count =0;
	       for(int i=0;i<n;i++) {
	       if (ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z' || ch[i]>='0'&&ch[i]<='9'  )
	            ch[i] ='1';
	         else
	           ch[i]='0';
	         if(ch[i]==star[i])
	           count++; 
	       } 
	  double out=count*100/n;
//	          System.out.println(ch);
//	          System.out.println(out);
	         System.out.printf("%.2f%%", out);
	         sc.close();	  
	}

}
