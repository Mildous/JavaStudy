package study0520;

public class ArrayList_ex {
    ArrayList<Geo> geolist=new ArrayList<Geo>(); //GeoŸ�Ը� ����
    geolist.add(new Geo(47.01, 10.2));
    Geo gt=geolist.get(0); //index 0�� ��ü�� �����´�. 47.01, 10.2

    System.out.printf("����: %f, �浵: %f%n", gt.getLatitude(), gt.getLongitude());
}
