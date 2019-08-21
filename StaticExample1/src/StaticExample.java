public class StaticExample 
{

	public int a=10;                 //non-static variable
	
	public static int b=20;          //static variable
	 
	public void proj1()
	{
		System.out.println("non-static method is printed");
	}

    public static void proj2()
    {
    	System.out.println("static method will be printed");
    
    }
    
    public static void main(String[] args)
    {
    	StaticExample obj=new StaticExample();
            
    	System.out.println(	obj.a);                        //creating an object to access the non-static variable
    	System.out.println(	StaticExample.b);              //Directly accessing the static variable with the classname
    	 
    	obj.proj1();                                      //Accesing the method proj1 with the obect created
    	
    	StaticExample.proj2();                            //Accesing the method proj2 directly
}
}
