package middle;

public class ForeachLotto2 {
    public static void print(int ...mm){
        for (int m : mm) {
            System.out.printf(m+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] mm = {1,6,16,22,23,33};
        print(mm);
        int a=1, b=6, c=16;
        print(a);
        print(a,b);
        print(a,b,c);
    }
}
