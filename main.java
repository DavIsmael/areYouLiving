import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int age = 0;
        int currentYear = 0;
        int yearOfBirth = 0;
        int aHundredYearsFromYearOfBirth = 0;
        int havingBirthday = 0;
        double oneYear = 365.242190;
        int leapYearsIndex = 0;
        int normalYearsIndex = 0;
        int leapYearDays = 0;
        int normalYearDays = 0;
        long oneHundredYearsInDays = 0;
        long oneHundredYearsInSeconds = 0;
        long daysLived = 0;
        long secondsLived = 0;
        long yourRemainingSeconds = 0;
        long yourRemainingDays = 0;
        ArrayList<Integer> oneHundredYearsFromNow = new ArrayList<Integer>();
        ArrayList<Integer> oneHundredYearsFromYourYearOfBirth = new ArrayList<Integer>();
        ArrayList<Integer> normalYears = new ArrayList<Integer>();
        ArrayList<Integer> leapYears = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you living? Are you really? Think about that.");
        System.out.print("What's your age? ");
        age = scanner.nextInt();
        System.out.print("Current year: ");
        currentYear = scanner.nextInt();
        System.out.print("Are you going to still have a birthday this year? 0 = NO; 1 = YES ");
        havingBirthday = scanner.nextInt();
        if(havingBirthday != 0 && havingBirthday != 1){
            for(boolean getOut = false; getOut == false;){
                System.out.print("Are you going to still have a birthday this year? 0 = NO; 1 = YES ");
                havingBirthday = scanner.nextInt();
                if(havingBirthday == 0 || havingBirthday == 1){
                    getOut = true;
                    scanner.close();
                }
            }
        }
        if(havingBirthday == 1){
            yearOfBirth = currentYear - age - 1;
        }else{
            yearOfBirth = currentYear - age;
        }
        aHundredYearsFromYearOfBirth = yearOfBirth + 100;
        for(int i = 0, j = 2024; i <= 100; ++i, ++j){
            oneHundredYearsFromNow.add(j);
            if(oneHundredYearsFromNow.get(i) % 4 == 0 && oneHundredYearsFromNow.get(i) % 100 != 0){
                leapYears.add(oneHundredYearsFromNow.get(i));
            }else if(oneHundredYearsFromNow.get(i) % 4 == 0 && oneHundredYearsFromNow.get(i) % 100 == 0 && oneHundredYearsFromNow.get(i) % 400 == 0){
                leapYears.add(oneHundredYearsFromNow.get(i));
            }else{
                normalYears.add(oneHundredYearsFromNow.get(i));
            }
        }
        for(int i = yearOfBirth; i <= aHundredYearsFromYearOfBirth; ++i){
            oneHundredYearsFromYourYearOfBirth.add(i);
        }
        //Printing out leap years
        System.out.print("Leap years: ");
        int leapYearsLastIndex = leapYears.size() - 1;
        for(int i = 0; i < leapYears.size(); ++i){
            if(leapYearsLastIndex == i){
                System.out.print(leapYears.get(i) + ".");
            }else{
                System.out.print(leapYears.get(i) + ", ");
            }
        }
        System.out.println();
        //Printing out normal years
        System.out.print("Normal years: ");
        int normalYearsLastIndex = normalYears.size() - 1;
        for(int i = 0; i < normalYears.size(); ++i){
            if(normalYearsLastIndex == i){
                System.out.print(normalYears.get(i) + ".");
            }else{
                System.out.print(normalYears.get(i) + ", ");
            }
        }
        System.out.println();
        //Display years based on age
        int lastIndexFromYourYears = oneHundredYearsFromYourYearOfBirth.size() - 1;
        System.out.print("Your years: ");
        for(int i = 0; i < oneHundredYearsFromYourYearOfBirth.size(); ++i){
            if(lastIndexFromYourYears == i){
                System.out.print(oneHundredYearsFromYourYearOfBirth.get(i) + ".");
            }else{
                System.out.print(oneHundredYearsFromYourYearOfBirth.get(i) + ", ");
            }
        }
        System.out.println();
        leapYearDays = leapYears.size() * 366;
        normalYearDays = (int) (normalYears.size() * 365.2422);
        oneHundredYearsInDays = leapYearDays + normalYearDays;
        oneHundredYearsInSeconds = oneHundredYearsInDays * 24 * 60 * 60;
        daysLived = (long) (oneYear * age);
        secondsLived = daysLived * 24 * 60 * 60;
        yourRemainingSeconds = oneHundredYearsInSeconds - secondsLived;
        yourRemainingDays = oneHundredYearsInDays - daysLived;
        System.out.println("The average person lives 100 years (my average statistics btw, haha), so u got " + oneHundredYearsInDays + " days to live");
        System.out.println("Days lived: " + daysLived);
        System.out.println("and " + yourRemainingDays + " days left..");
        System.out.println("100 years in seconds: " + oneHundredYearsInSeconds + "s");
        System.out.println("Seconds lived: " + secondsLived + "s");
        System.out.println("Your remaining seconds: " + yourRemainingSeconds + "s");
        System.out.println("We pretend like we have all the time of the world, but we really don't!!");
        System.out.println("Im 19, so I personally have on average, 29969 remaining days or 2589321600 seconds to live and counting..");
        System.out.println("So let's just not waste any more time and live, cause life is just too precious to be wasted, guys!");
        System.out.println("THERES ONLY 3 BILLION 188 MILLION 851 THOUSAND AND 200 SECONDS IN OUR LIVES. WHY ARE YOU STILL HERE?");
    }
}