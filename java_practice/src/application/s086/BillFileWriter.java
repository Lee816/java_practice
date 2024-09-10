package application.s086;

import application.s083.Billboard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BillFileWriter {
    public static void main(String[] args) {

        Billboard b1 = new Billboard(1,"Despacito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        Billboard b2 = new Billboard(2,"That's What I Like",2,"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
        Billboard b3 = new Billboard(3,"I'm The One",3,"https://www.billboard.com/images/pref_images/q64532p164x.jpg","dj khaled");

        ArrayList<Billboard> bblist = new ArrayList<>();

        bblist.add(b1);
        bblist.add(b2);
        bblist.add(b3);

        File f = new File("billboard");
        if(!f.exists()){
            f.mkdirs(); // 디렉토리가 존재하지 않으면 billboard디렉토리를 만든다 mkdirs()
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter("billboard/bill.txt",false),true)){
            for (Billboard bb : bblist){
                pw.println(bb);
            }
        } catch (IOException e){
            System.out.println(e);
        }
        // try(IO 객체 생성)는 {}가 끝나면 자동으로 close()(autoclose())된다 finally 구문이 필요없는 편리한 예외처리
        // billboard 디렉토리에 bill.txt 파일을 저장하는데 이미 있다면 내용을 모두 지우고 새로(false) 저장한다.
    }
}
