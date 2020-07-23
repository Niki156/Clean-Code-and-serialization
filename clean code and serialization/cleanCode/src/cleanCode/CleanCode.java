package cleanCode;
public class CleanCode {
	public static double getSimpleIntrest(int principal,double d, int noOfYearsCompleted) {
		return principal*d*noOfYearsCompleted;
	}
	public static double getCompoundIntrest(float principal, double d, int noOfTimePeriods, int noOfTimesIntrestCompounded)
	{
		return principal*(Math.pow((1+d/noOfTimePeriods), noOfTimesIntrestCompounded*noOfTimePeriods));
	}
	public static float getConstructionCost(String materialStandard, int totalArea , Boolean wantAutomatedHome )
	{
		if(materialStandard.equals("high standard")) {
			if(wantAutomatedHome)
				return 2500*totalArea;
			else
				return 1800*totalArea;
		}
		else
		{
			if(materialStandard.equals("standard"))
				return 1200*totalArea;
			if(materialStandard.equals("above standard"))
				return 1500*totalArea;
		}
		return 0;
	}
	
}
