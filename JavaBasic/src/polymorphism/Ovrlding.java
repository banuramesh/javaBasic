package polymorphism;

public class Ovrlding {
	public static void main(String[] args) {
		/*
		 * Polymorphism => many forms
		 * 
		 * 2 types of polymorphism
		 * 1. overloading
		 * 2. overriding
		 * 
		 * Overloading
		 *  => using same method name for different purpose shown in the parameters
		 *  
		 *  how we can show the difference in parameters
		 *  => numbers of parameters 
		 *  => data types of parameter
		 *  => Sequence of parameter(Order changing)
		 *  
		 */
		
		Ovrlding.area();
		Ovrlding ob = new Ovrlding();
		ob.area(5);
		System.out.println("Area of Circle:" + ob.area(5.2));
		Ovrlding.area(10, 6.5);
		Ovrlding.area(5.8, 12);
				
			
	}
		public static void area()
		{
			System.out.println("Area Methods testing");
		}
		public void area(int a)
		{
			System.out.println("Area of square:"+ a*a);
		}
		public double area(double r)
		{
			return (3.14*r*r);
		}
		public static void area(int l, double b)
		{
			System.out.println("Area of rectangle:"+ l*b);
		}
		public static void area(double b,int h)
		{
			System.out.print("Area of triangle:"+ 0.5*b*h);
		}
	         
		
	

}    
