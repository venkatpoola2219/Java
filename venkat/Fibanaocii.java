package Java.Mouritech.venkat;

public class Fibanaocii {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int num=20;
		if(num==1)
			System.out.println(n1);
		else if(num==2)
		{
			System.out.println(n1);
		    System.out.println(n2);
		}
		    else {
		    	System.out.println(n1);
		        System.out.println(n2);
		    	  for(int i=3;i<=num;i++)
		    	  {
		    		  int n3=n1+n2;
		    		  n1=n2;
		    		  n2=n3;
		    		  System.out.println(n3);
		    	  }
		    }

	}

}
