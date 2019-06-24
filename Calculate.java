class Calculate
{
	public static void main(String args[])
	{
		int year,day,week,rday,days;
		days=374;
		year=days/365;
		rday=days%365;
		week=rday/7;
		day=rday%7;
		System.out.println("No. of Years=" +year);
		System.out.println("No. of weeks=" +week);
		System.out.println("No. of days=" +day);
	}
}