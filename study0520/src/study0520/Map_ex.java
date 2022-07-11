package study0520;

public class Map_ex {
    HashMap<String, Geo> cities = new HashMap<String, Geo>();

    cities.clear();
    cities.put("Korea", new Geo(37.5670, 126.9807));
    cities.put("Austria", new Geo(47.01, 10.2));
    cities.put("US", new Geo(40.714086, -74.228697));
    cities.put("Mexico", new Geo(19.42847, -99.12766));
    cities.put("China", new Geo(39.9075, 116.39723));
    cities.put("Rusia", new Geo(55.75222, 27.61556));

    System.out.println(cities.size());
    System.out.println(sities.containsKey("Austria"));
    Geo geo=cities.get("Austria");
    System.out.printf("%s: 위도: %f, 경도: %f%n", "Austria", geo.getLatitude(), geo.getLongitude());
}
