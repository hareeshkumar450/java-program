import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    int [] a=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(int j=0;j<a.length;j++)
	    {
	        a[j]=sc.nextInt();
	    }
	    for(int j=0;j<a.length;j++)
	    {
	        if(a[j]%2==0){
	        System.out.println(a[j]);
	        }
	    }
	}
}