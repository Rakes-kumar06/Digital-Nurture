package dsa.finacialforecasting;

public class FinancialForecast {
	public static double calculateFutureValue(double presentValue, double growthRate, int years) {
		if(years == 0)
			return presentValue;
	
		double previousYearValue = calculateFutureValue(presentValue,growthRate,years-1);
		return previousYearValue * (1 + growthRate);
	}
	
	public static void main(String[] args) {
		System.out.println("=== Financial Forecasting ====");
		
		double initialInvestment = 10000.0;
		double annualGrowth = 0.07;
		int forecastYears = 10;
		
		System.out.println("\nInitial Investment: "+initialInvestment);
		System.out.printf("Expected Annual Growth: %.2f" ,(annualGrowth * 100));
        System.out.println("\nForecasting horizon: " + forecastYears + " years");
        
        double predictedValue = calculateFutureValue(initialInvestment,annualGrowth,forecastYears);

        System.out.printf("\nPredicted Value: %.2f",predictedValue);
	}
}
