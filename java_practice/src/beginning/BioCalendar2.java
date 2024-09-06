package beginning;

public class BioCalendar2 {
    public  static final  int PHYSICAL = 23; // 상수

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;

        double vals = (days%index)*2 * Math.PI/index;
        System.out.println(Math.toDegrees(vals)+"도");
    }
}
