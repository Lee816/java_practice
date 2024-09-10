package application.s090;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class WikipediaMain2 {
    public static void main(String[] args) {
        ArrayList<String> htmls=new ArrayList<String>();
        String newUrls="https://ko.wikipedia.org/wiki/ISO_3166-1";
        URL url = null;

        try {
            url = new URL(newUrls);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"),8);

            String line = null;
            while ((line = reader.readLine()) != null){
                if (!line.trim().equals("")){
                    htmls.add(line.trim());
                }
            }
        } catch (Exception e) {
            System.out.println("Wiki Flag Parsing error !!");
        }

        for (String str : htmls){
            System.out.println(str);
        }
    }
}
