package beginning;

public class BioCalendar {
    public  static final  int PHYSICAL = 23; // 상수

    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index = PHYSICAL;

        double vals = 2 * Math.PI/index;
        System.out.println(vals+"라디안");
    }
}
