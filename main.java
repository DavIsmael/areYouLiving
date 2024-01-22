import java.util.ArrayList;
import java.util.Scanner;
import java.lang.InterruptedException;
public class main {
    public static void main(String[] args) {
        int age = 0;
        int currentYear = 0;
        int yearOfBirth = 0;
        int aHundredYearsFromYearOfBirth = 0;
        int havingBirthday = 0;
        double oneYearInDays = 365.242190;
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
        ArrayList<Integer> yourNormalYears = new ArrayList<Integer>();
        ArrayList<Integer> yourLeapYears = new ArrayList<Integer>();
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
        for(int i = 0, j = yearOfBirth; j <= aHundredYearsFromYearOfBirth; ++i, ++j){
            oneHundredYearsFromYourYearOfBirth.add(j);
            if(oneHundredYearsFromYourYearOfBirth.get(i) % 4 == 0 && oneHundredYearsFromYourYearOfBirth.get(i) % 100 != 0){
                yourLeapYears.add(oneHundredYearsFromYourYearOfBirth.get(i));
            }else if(oneHundredYearsFromYourYearOfBirth.get(i) % 4 == 0 && oneHundredYearsFromYourYearOfBirth.get(i) % 100 == 0 && oneHundredYearsFromYourYearOfBirth.get(i) % 400 == 0){
                yourLeapYears.add(oneHundredYearsFromYourYearOfBirth.get(i));
            }else{
                yourNormalYears.add(oneHundredYearsFromYourYearOfBirth.get(i));
            }
        }
        //Printing out leap years
        System.out.print("Leap years: ");
        int leapYearsLastIndex = leapYears.size() - 1;
        try{
           Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i = 0; i < leapYears.size(); ++i){
            if(leapYearsLastIndex == i){
                System.out.print(leapYears.get(i) + ".");
            }else{
                System.out.print(leapYears.get(i) + ", ");
            }
        }
        System.out.println();
        //Printing out normal years
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.print("Normal years: ");
        int normalYearsLastIndex = normalYears.size() - 1;
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
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
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.print("Your years: ");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i = 0; i < oneHundredYearsFromYourYearOfBirth.size(); ++i){
            if(lastIndexFromYourYears == i){
                System.out.print(oneHundredYearsFromYourYearOfBirth.get(i) + ".");
            }else{
                System.out.print(oneHundredYearsFromYourYearOfBirth.get(i) + ", ");
            }
        }
        System.out.println();
        leapYearDays = yourLeapYears.size() * 366;
        normalYearDays = (int) (yourNormalYears.size() * 365.2422);
        oneHundredYearsInDays = leapYearDays + normalYearDays;
        oneHundredYearsInSeconds = oneHundredYearsInDays * 24 * 60 * 60;
        daysLived = (long) (oneYearInDays * age);
        secondsLived = daysLived * 24 * 60 * 60;
        yourRemainingSeconds = oneHundredYearsInSeconds - secondsLived;
        yourRemainingDays = oneHundredYearsInDays - daysLived;
        try {
            Thread.sleep(5000);
            System.out.println("The average person lives 100 years (my average statistics btw, haha), so u got " + oneHundredYearsInDays + " days to live");
            Thread.sleep(5000);
            System.out.println("Days lived: " + daysLived);
            Thread.sleep(5000);
            System.out.println("and " + yourRemainingDays + " days left..");
            Thread.sleep(5000);
            System.out.println("100 years in seconds: " + oneHundredYearsInSeconds + "s");
            Thread.sleep(5000);
            System.out.println("Seconds lived: " + secondsLived + "s");
            Thread.sleep(5000);
            System.out.println("Your remaining seconds: " + yourRemainingSeconds + "s");
            Thread.sleep(5000);
            System.out.println("We pretend like we have all the time in the world, but we really don't!!");
            Thread.sleep(5000);
            System.out.println("Im 19, so I personally have on average, 29969 remaining days or 2589321600 seconds to live and counting..");
            Thread.sleep(5000);
            System.out.println("So let's just not waste any more time and live, cause life is just too precious to be wasted, guys!");
            Thread.sleep(5000);
            System.out.println("THERES ONLY 3 BILLION 188 MILLION 851 THOUSAND AND 200 SECONDS IN OUR LIVES. WHY ARE YOU STILL HERE?");
            Thread.sleep(2500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}