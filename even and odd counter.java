import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int [] a=new int[5];
	     int ecount=0;
	     int ocount=0;
	    for(int i=0;i<a.length;i++)
	    {
        if(a[i]%2==0){
	       ecount+=1;
        }
        else if(a[i]%2!=0){
            ocount+=1;
        }
	    }
        System.out.println(ecount);
        System.out.println(ocount);
	    }
	}
