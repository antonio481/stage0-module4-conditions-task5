package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int r = year % 400 == 0 || year % 100 == 0 || year % 4 == 0 ? 1 : 0;
        switch (r){
            case (1):
                System.out.println("leap");
                break;
            case (0):
                System.out.println("not leap");
                break;
        }
    }
}
