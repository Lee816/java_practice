package middle;

public class BioSwitch2 {
     public static final int PHYSICAL=23;
     public static final int EMOTIONAL = 28;
     public static final int INTELLECTUAL=33;

    public static String textInfor(int index, double value){
        String result = "";
        switch(index){
            case 23 : result = "신체지수 : "; break;
            case 28 : result = "감정지수 : "; break;
            case 33 : result = "지성지수 : "; break;
        }

        return result + (value*100);
    }

    public static void main(String[] args) {
        int index = PHYSICAL;
        double value=0.86;
        String st=textInfor(index, value);
        System.out.println(st);
    }
}
