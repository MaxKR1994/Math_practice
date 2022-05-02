public class math {

    public static void main(String[] args) {
        double a = 2.0f;
        double b = 4.2f;
        double c = 9.0f;
        int d = (int) Math.abs(a-b);
        int g = (int) a + (int) b;
        double v = Math.pow(g, 3) - Math.sqrt(c);
        int k = (int) (d/ v);
        double f = d/v;
        float j = (float) (d/v);
        System.out.println(d);
        System.out.println(g);
        System.out.println(v);
        System.out.println(k);
        System.out.println(f);
        System.out.println(j);

    }

}
