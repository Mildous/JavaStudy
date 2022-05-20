package study0520;

import java.util.ArrayList;

public class Overloading_ex {
    public static void showGeo(Geo...goose){
        for(Geo gg:goose) {
            System.out.println("위도: %f, 경도: %f%n", gg.getLatitude(), gg.getLongitude());
        }
    }
    public static void showGeo(ArrayList<Geo>goose){
        for(Geo gg: goose){
            System.out.println("위도: %f, 경도: %f%n", gg.get.Latitude(), gg.getLongitude());
        }
    }
}
