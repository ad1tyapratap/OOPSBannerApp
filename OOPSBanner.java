public class OOPSBanner {
    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
    private static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
                " ****** ",
                "*       ",
                "*       ",
                " ****** ",
                "       *",
                "       *",
                " ****** "
        };
    }
}