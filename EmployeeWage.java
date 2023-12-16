import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WORKING_DAYS_PER_MONTH = 20;
        int MAX_WORKING_HOURS = 100;

        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while ((totalWorkingHours < MAX_WORKING_HOURS) && (totalWorkingDays<WORKING_DAYS_PER_MONTH)){
            int attendance = new Random().nextInt(2);
            int dailyWage=0;

            switch (attendance){
                case 0:
                    dailyWage += (PART_TIME_HOURS * WAGE_PER_HOUR);
                    break;

                case 1:
                    dailyWage += (FULL_DAY_HOURS * WAGE_PER_HOUR);
                    break;
            }
            totalWage+=dailyWage;
            totalWorkingHours+= (attendance==1) ? FULL_DAY_HOURS : PART_TIME_HOURS;
            totalWorkingDays++;

        }
        
        System.out.println("Your total wage is: " + totalWage);
        System.out.println("Your total hours are: " + totalWorkingHours);
        System.out.println("Your total working days are: " + totalWorkingDays);

    }
}
