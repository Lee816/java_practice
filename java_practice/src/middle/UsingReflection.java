package middle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingReflection {
    public static String toModi(int n){
        String s="";
        switch (n){
            case 0 : s=" "; break;
            case 1 : s="public "; break;
            case 2 : s="private "; break;
            case 4 : s="protected "; break;
            case 8 : s="static "; break;
            case 10 : s="private static "; break;
            case 9 :
            case 137 : s="public static"; break;
            case 17 : s="public final "; break;
            case 257 : s="public native "; break;
            case 260 : s="proteted native "; break;
            case 273 : s="public final native "; break;
            default: s="xxxx"; break;
        }

        return s;
    }

    public static String toRe(String msg){
        String s="";
        if (msg.indexOf("[")!=-1){
            if(msg.contains("[C")){
                s=msg.substring(msg.indexOf(" ")+1).trim();
                s=s.replace("[C","char[] ");
            } else if (msg.contains("[L")) {
                s=msg.substring(msg.indexOf(" ")+1).trim();
                s=s.replace("[L","").replace(";","");
                s=s.concat("[]");
            } else if (msg.contains("[B")) {
                s=msg.substring(msg.indexOf(" ")+1).trim();
                s=s.replace("[B","byte[] ");
            }
        } else if (msg.indexOf(" ")!=-1) {
            s=msg.substring(msg.indexOf(" ")+1).trim();
        } else {
            s=msg.trim();
        }

        return  s;
    }

    public static void main(String[] args) {
        Object obj1=new Object();
        try {
            Class classes=Class.forName("java.lang.String");
            System.out.println("----------Method 찾기-----------------------");
            Method[] mes=classes.getDeclaredMethods();
            for (Method me : mes) {
                if (me.getModifiers() > 4000) {
                    continue;
                     // 400 초과면 다음 스텝
                }
                System.out.printf("%s\t\t", toModi(me.getModifiers())); // 제한자 종류
                System.out.printf("%-30s\t\t", toRe(me.getReturnType().toString()));
                System.out.printf("%s", me.getName()); // 클래스이름
                System.out.printf("(", ""); // 2개 이상이면 ,로 표시

                Class[] aa = me.getParameterTypes();
                for (int j = 0; j < aa.length; j++) {
                    System.out.printf("%s", toRe(aa[j].getName()));
                    if (j != aa.length - 1) {
                        System.out.printf(",");
                    }
                }
                System.out.printf(")", "");
                System.out.println();
            }
                System.out.println("----------------------생성자 찾기---------------------");
                Constructor[] constructor=classes.getDeclaredConstructors();

                for (Constructor con : constructor){
                    System.out.print(con.getName());
                    System.out.printf("(","");
                    Class[] aa=con.getParameterTypes();
                    for (int j =0 ; j < aa.length ; j++){
                        System.out.printf("%s", toRe(aa[j].getName()));
                        if (j!=aa.length-1){
                            System.out.print(",");
                        }
                    }
                    System.out.printf(")","");
                    System.out.println();
                }
        } catch (ClassNotFoundException e){
                System.out.println(e);
            }
    }
}
