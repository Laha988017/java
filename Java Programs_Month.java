import java.util.*;
class Month
{
	public static void main(String args[])
	{
		GregorianCalendar today=new GregorianCalendar();
		int date=today.get(Calendar.DAY_OF_MONTH);
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH);//0-11
		Calendar gc = new GregorianCalendar(year, month, 1);
		Date startDate = new Date(gc.getTime().getTime());
		int startday=startDate.getDay();
		System.out.println("Sun\tMon\tTues\tWed\tThrus\tFri\tSat");
		int c=startday,p=0,t=1;
		int day[]=new int[7];
		int dates[][]=new int[5][7];
		
		int getdaycount[]={31,28,31,30,31,30,31,31,30,31,30,31};
		if(checkLeap(year))
		getdaycount[1]=29;
		
		for(int i=0;i<5;i++)
		for(int j=0;j<7;j++)
		dates[i][j]=0;
		
		for(int i=0;i<7;i++)
		day[i]=i;
		while(t<=getdaycount[month])
		{
			if(c<7)
			{
				dates[p][c]=t++;
				c++;
			}
			else
			{
				c=0;
				p++;
			}
		}
	
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(dates[i][j]!=0)
				{
					if(date==dates[i][j])
					System.out.print(dates[i][j]+"*\t");
					else
					System.out.print(dates[i][j]+"\t");
				}
				else
				System.out.print(" \t");
			}
			System.out.println();
		}	
	}
	public static boolean checkLeap(int year)
    {
        if (year%400 == 0)
            return true;
      
        if (year%100 == 0)
            return false;
      
        if (year%4 == 0)
            return true;
        return false;
    }
}
