class Compound
{
	public static void main(String args[])
	{
		double p=50, r=3, n=2, t=5, result, CI;
		double a=1+r/n;
		double b=n*t;
		result=Math.pow(a,b);
		CI=p*result;
		System.out.println("Compound Interest= " +CI);
	}
}		