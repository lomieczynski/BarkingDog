package programmingcourse.timbuchalka;

public class Main {

    public static void main(String[] args) {


        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOdDay) {
        if (barking == true) {
            if (hourOdDay < 0 || hourOdDay > 23) {
                return false;
            } else if (hourOdDay < 8 || hourOdDay > 22) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
