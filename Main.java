/********************************************
*	AUTHORS:	Volodymyr Turchanskyi
* COLLABORATORS: none
*	LAST MODIFIED:	July 6, 2026
********************************************/

/********************************************
*	Student Survival Budget Calculator
*********************************************
*	PROGRAM DESCRIPTION:
*	This program estimates if a community college student can cover monthly
* living costs while staying focused on school.
*********************************************
*	ALGORITHM:
*	Set student name, school, income, work hours, hourly pay, and expenses.
* Calculate estimated work income for the month.
* Calculate total monthly expenses.
* Calculate money left after expenses.
* Calculate the percent of income spent.
* Display the budget summary with formatted output.
*********************************************
*	STATIC METHODS:
* calcTotalExpenses(double, double, double, double) : double
* calcMoneyLeft(double, double) : double
* calcPercentSpent(double, double) : double
* calcEstimatedMonthlyWorkIncome(int, double) : double
*********************************************/


public class Main 
{
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    String studentName;
    String schoolName;
    int weeklyWorkHours;
    int classUnits;
    double hourlyPay;
    double financialAid;
    double rent;
    double food;
    double transportation;
    double schoolSupplies;
    double estimatedWorkIncome;
    double totalIncome;
    double totalExpenses;
    double moneyLeft;
    double percentSpent;
    int wholeDollarsLeft;

    /***** INITIALIZATION SECTION *****/
    studentName = "Volodymyr";
    schoolName = "MiraCosta College";
    weeklyWorkHours = 16;
    classUnits = 12;
    hourlyPay = 18.50;
    financialAid = 650.00;
    rent = 900.00;
    food = 320.00;
    transportation = 95.00;
    schoolSupplies = 75.00;

    /***** INTRO SECTION *****/
    System.out.println("Student Survival Budget Calculator");
    System.out.println("----------------------------------");
    System.out.println("Student: " + studentName);
    System.out.println("School: " + schoolName);
    System.out.println("Class units: " + classUnits);
    System.out.println("Weekly work hours: " + weeklyWorkHours);
    System.out.println();

    /***** PROCESSING SECTION *****/
    estimatedWorkIncome = calcEstimatedMonthlyWorkIncome(weeklyWorkHours, hourlyPay);
    totalIncome = financialAid + estimatedWorkIncome;
    totalExpenses = calcTotalExpenses(rent, food, transportation, schoolSupplies);
    moneyLeft = calcMoneyLeft(totalIncome, totalExpenses);
    percentSpent = calcPercentSpent(totalExpenses, totalIncome);
    wholeDollarsLeft = (int)moneyLeft;

    /***** OUTPUT SECTION *****/
    System.out.printf("Financial aid: $%.2f%n", financialAid);
    System.out.printf("Estimated monthly work income: $%.2f%n", estimatedWorkIncome);
    System.out.printf("Total monthly income: $%.2f%n", totalIncome);
    System.out.println();
    System.out.printf("Rent: $%.2f%n", rent);
    System.out.printf("Food: $%.2f%n", food);
    System.out.printf("Transportation: $%.2f%n", transportation);
    System.out.printf("School supplies: $%.2f%n", schoolSupplies);
    System.out.printf("Total monthly expenses: $%.2f%n", totalExpenses);
    System.out.println();
    System.out.printf("Percent of income spent: %.1f%%%n", percentSpent);
    System.out.printf("Money left after expenses: $%.2f%n", moneyLeft);
    System.out.println("Whole dollars left for savings or emergencies: $" + wholeDollarsLeft);
  }

  /***** STATIC METHODS *****/
  
  /**
   * Calculates total monthly expenses.
   * Precondition: All expense amounts are zero or greater.
   * Postcondition: The sum of the expenses is returned.
   * @param rent monthly rent cost
   * @param food monthly food cost
   * @param transportation monthly transportation cost
   * @param schoolSupplies monthly school supplies cost
   * @return total monthly expenses
   */
  // Volodymyr Turchanskyi created this method.
  public static double calcTotalExpenses(double rent, double food, double transportation,
      double schoolSupplies)
  {
    return rent + food + transportation + schoolSupplies;
  }

  /**
   * Calculates money left after paying expenses.
   * Precondition: Income and expenses are valid dollar amounts.
   * Postcondition: Income minus expenses is returned.
   * @param totalIncome total money available for the month
   * @param totalExpenses total monthly expenses
   * @return money left after expenses
   */
  // Volodymyr Turchanskyi created this method.
  public static double calcMoneyLeft(double totalIncome, double totalExpenses)
  {
    return totalIncome - totalExpenses;
  }

  /**
   * Calculates the percent of income spent.
   * Precondition: Total income is greater than zero.
   * Postcondition: The expense percent is returned.
   * @param totalExpenses total monthly expenses
   * @param totalIncome total money available for the month
   * @return percent of income spent
   */
  // Volodymyr Turchanskyi created this method.
  public static double calcPercentSpent(double totalExpenses, double totalIncome)
  {
    return totalExpenses / totalIncome * 100;
  }

  /**
   * Estimates monthly work income from weekly hours and hourly pay.
   * Precondition: Weekly hours and hourly pay are zero or greater.
   * Postcondition: Estimated monthly work income is returned.
   * @param weeklyWorkHours hours worked each week
   * @param hourlyPay dollars earned per hour
   * @return estimated monthly work income
   */
  // Volodymyr Turchanskyi created this method.
  public static double calcEstimatedMonthlyWorkIncome(int weeklyWorkHours, double hourlyPay)
  {
    return weeklyWorkHours * hourlyPay * 4;
  }
}
