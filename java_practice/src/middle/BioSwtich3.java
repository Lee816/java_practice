package middle;

public class BioSwtich3 {

    public static  String textInfor(PEI index, double value){
        String result = "";
        switch (index){
            case PHSYCAL : result = "신체지수 : "; break;
            case EMOTIONAL : result = "감성지수 : "; break;
            case INTELLECTUAL: result = "지성지수 : "; break;
            default: result="미결정 : "; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        PEI index=PEI.PHSYCAL;
        double value=0.86;

        System.out.println("신체지수 주기 값 :" + index.getPei());
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}
