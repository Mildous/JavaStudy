package poketmon_mini_game;

import java.util.*;

public class GameConst {
    private final int MAX_POKETMON_SIZE = 12;
    static Map<Integer, String> menu = new HashMap();
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> poketmonType = Map.of(
            1, "Ǯ",
            2, "��",
            3, "��",
            4, "����"
    );
    static List<Poketmon> poketmons = Arrays.asList(
            new Poketmon("�̻��ؾ�", 1, 3),
            new Poketmon("�Ķ�", 1, 2),
            new Poketmon("�ѹ���", 1, 1),
            new Poketmon("���̸�", 2, 3),
            new Poketmon("�Ľ�����", 2, 2),
            new Poketmon("����", 2, 1),
            new Poketmon("���α�", 3, 3),
            new Poketmon("��ì��", 3, 2),
            new Poketmon("����Ĵ�", 3, 1),
            new Poketmon("��ī��", 4, 3),
            new Poketmon("����", 4, 2),
            new Poketmon("�����", 4, 1)
    );
    public static final Map<Integer, Map<String, Integer>> LV_CP_MAPPING = Map.of(
            1, Map.of("min", 10, "max", 100, "p", 90),
            2, Map.of("min", 80, "max", 200, "p", 60),
            3, Map.of("min", 210, "max", 500, "p", 30)
    );

    static List<Poketmon> poketmonBag = new ArrayList();

}
