import java.util.Arrays;

class ResistorColor {
    private static String[] colorsName = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

    int colorCode(String color) {
        return Arrays.asList(colorsName).indexOf(color);
    }

    String[] colors() {
        return colorsName;
    }
}