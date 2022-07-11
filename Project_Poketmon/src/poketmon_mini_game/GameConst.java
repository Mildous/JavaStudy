package poketmon_mini_game;

import java.util.*;

public class GameConst {
<<<<<<< HEAD
    private final int MAX_POKETMON_SIZE = 12;
    static Map<Integer, String> menu = new HashMap();
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> poketmonType = Map.of(
            1, "Ç®",
            2, "ºÒ",
            3, "¹°",
            4, "Àü±â"
    );
    static List<Poketmon> poketmons = Arrays.asList(
            new Poketmon("ÀÌ»óÇØ¾¾", 1, 3),
            new Poketmon("ÆÄ¶ó½º", 1, 2),
            new Poketmon("¶Ñ¹÷ÃÊ", 1, 1),
            new Poketmon("ÆÄÀÌ¸®", 2, 3),
            new Poketmon("½Ä½ºÅ×ÀÏ", 2, 2),
            new Poketmon("°¡µð", 2, 1),
            new Poketmon("²¿ºÎ±â", 3, 3),
            new Poketmon("¹ßÃ¬ÀÌ", 3, 2),
            new Poketmon("°í¶óÆÄ´ö", 3, 1),
            new Poketmon("ÇÇÄ«Ãò", 4, 3),
            new Poketmon("ÄÚÀÏ", 4, 2),
            new Poketmon("Âî¸®¸®°ø", 4, 1)
=======
	
    static Map<Integer, String> menu = new HashMap();
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> poketmonType = Map.of(
            1, "í’€",
            2, "ë¶ˆ",
            3, "ë¬¼",
            4, "ì „ê¸°"
    );
    static List<Poketmon> poketmons = Arrays.asList(
            new Poketmon("ì´ìƒí•´ì”¨", 1, 3),
            new Poketmon("íŒŒë¼ìŠ¤", 1, 2),
            new Poketmon("ëšœë²…ì´ˆ", 1, 1),
            new Poketmon("íŒŒì´ë¦¬", 2, 3),
            new Poketmon("ì‹ìŠ¤í…Œì¼", 2, 2),
            new Poketmon("ê°€ë””", 2, 1),
            new Poketmon("ê¼¬ë¶€ê¸°", 3, 3),
            new Poketmon("ë°œì±™ì´", 3, 2),
            new Poketmon("ê³ ë¼íŒŒë•", 3, 1),
            new Poketmon("í”¼ì¹´ì¸„", 4, 3),
            new Poketmon("ì½”ì¼", 4, 2),
            new Poketmon("ì°Œë¦¬ë¦¬ê³µ", 4, 1)
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
    );
    public static final Map<Integer, Map<String, Integer>> LV_CP_MAPPING = Map.of(
            1, Map.of("min", 10, "max", 100, "p", 90),
            2, Map.of("min", 80, "max", 200, "p", 60),
            3, Map.of("min", 210, "max", 500, "p", 30)
    );

    static List<Poketmon> poketmonBag = new ArrayList();

}
