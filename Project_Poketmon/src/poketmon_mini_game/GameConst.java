package poketmon_mini_game;

import java.util.*;

public class GameConst {
    //private final int MAX_POKETMON_SIZE = 12;
    static Map<Integer, String> menu = new HashMap();
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> poketmonType = Map.of(
            1, "풀",
            2, "불",
            3, "물",
            4, "전기"
    );
    static List<Poketmon> poketmons = Arrays.asList(
            new Poketmon("이상해씨", 1, 3),
            new Poketmon("파라스", 1, 2),
            new Poketmon("뚜벅초", 1, 1),
            new Poketmon("파이리", 2, 3),
            new Poketmon("식스테일", 2, 2),
            new Poketmon("가디", 2, 1),
            new Poketmon("꼬부기", 3, 3),
            new Poketmon("발챙이", 3, 2),
            new Poketmon("고라파덕", 3, 1),
            new Poketmon("피카츄", 4, 3),
            new Poketmon("코일", 4, 2),
            new Poketmon("찌리리공", 4, 1)
    );
    public static final Map<Integer, Map<String, Integer>> LV_CP_MAPPING = Map.of(
            1, Map.of("min", 10, "max", 100, "p", 90),
            2, Map.of("min", 80, "max", 200, "p", 60),
            3, Map.of("min", 210, "max", 500, "p", 30)
    );

    static List<Poketmon> poketmonBag = new ArrayList();

}
