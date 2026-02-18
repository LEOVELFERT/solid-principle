package structural.flyweight.withpattern;

import java.util.HashMap;

public class ColorTypeFactory {
    private static final HashMap<String, ColorType> colorTypeMap = new HashMap<>();

    public static ColorType getColor(String color) {
        if (!colorTypeMap.containsKey(color)) {
            colorTypeMap.put(color, new ColorType(color));
        }
        return colorTypeMap.get(color);
    }
}
