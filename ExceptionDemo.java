public class ExceptionDemo
{
	public static void main(String[] args) 
	{
	 int a[]=new int[5];
	 try 
	  {
		a[0]=2;
	    a[1]=9;
	    a[2]=4;
	    a[3]=93;
	    a[4]=34;
	    a[5]=23;
	   // a[6]=2;
	  }
       catch (Exception e)
	   {
    	   System.out.println(e);
		}
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }
	
   	}

}
