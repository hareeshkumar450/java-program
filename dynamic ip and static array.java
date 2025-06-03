import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i;
	    int [] a=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(i=0;i<a.length;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<a.length;i++);
	    {
	        System.out.println(a[i]);
	    }
	}
}