package application.s084;

import application.s083.Billboard;

public class BillboardMainObject {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1,"Despacito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        Billboard b2 = new Billboard(2,"That's What I Like",2,"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
        Billboard b3 = new Billboard(3,"I'm The One",3,"https://www.billboard.com/images/pref_images/q64532p164x.jpg","dj khaled");

        showAbout(b1);
        showAbout(b2);
        showAbout(b1,b2);
        showAbout(b1,b2,b3);

        Billboard[] b = new Billboard[3];
        b[0] = new Billboard(1,"Despacito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        b[1] = b2;
        b[2] = b3;

        showAbout(b[0],b[1]);
        showAbout(b);
    }

    public static void showAbout(Billboard bb){
        System.out.println("1------------------------------------");
        String sf=String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);

    }

    public static void showAbout(Billboard ... b){
        System.out.println("2=====================================");
        for (Billboard bill : b){
            showAbout(bill);
        }

        System.out.println("<=====================================2");
    }
}
