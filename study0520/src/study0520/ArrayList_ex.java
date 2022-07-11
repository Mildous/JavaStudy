package study0520;

public class ArrayList_ex {
    ArrayList<Geo> geolist=new ArrayList<Geo>(); //Geo타입만 저장
    geolist.add(new Geo(47.01, 10.2));
    Geo gt=geolist.get(0); //index 0의 객체를 가져온다. 47.01, 10.2

    System.out.printf("위도: %f, 경도: %f%n", gt.getLatitude(), gt.getLongitude());
}
