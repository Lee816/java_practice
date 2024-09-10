package application.s088;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class BillFiles {
    public static void main(String[] args) {
        File f = new File("billboard"); // 디렉토리 객체
        File[] fd = f.listFiles(); // 디렉토리 내 파일들 (자식 파일)

        for (File ff : fd){
            String fname = ff.getName(); // 파일명 가져오기
            String post = fname.substring(fname.lastIndexOf(".")+1); // 확장자 가져오기

            System.out.println(fname + " " + post); // 파일명 + 확장자
            System.out.println(ff.getAbsolutePath()); // 전체 경로
            System.out.println(new Date(ff.lastModified())); // 마지막 수정일

            try (BufferedReader br= new BufferedReader(new FileReader(ff.getAbsolutePath()))){
                String msg="";

                while ((msg=br.readLine())!=null){
                    System.out.println(msg);
                }
            } catch (Exception e){
                System.out.println(e);
            }

            System.out.println("---------------------------------------------------");
        }
    }
}
