package middle;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) {
        long ltime=System.currentTimeMillis();
        System.out.println(ltime);

        for (int i=0 ; i<100000 ; i++){
            System.out.print("");
        }

        long ltime2=System.currentTimeMillis();
        System.out.println(ltime2-ltime);
        System.out.println(ltime2/1000/60/60/24/365 + "년");

        Properties pro=System.getProperties();
        System.out.println(pro.getProperty("java.vm.version"));
        System.out.println(pro.getProperty("file.separator"));

        System.out.println(new Date(System.currentTimeMillis()));

        Enumeration<Object> en=pro.keys();
        int i =0;
        while (en.hasMoreElements()){
            String keys=(String)en.nextElement();
            System.out.println((++i+" ")+keys+" : "+pro.getProperty(keys));
        }
    }
}
/*
System.currentTimeMills()는 1970.1.1부터 현재까지 걸린 시간을 밀리세컨드 단위로 반환한다.
Sytem.getProperties()는 시스템 환경변수를 반환한다.(시스템 환경변수는 OS관련 정보를 제공한다.)

 */