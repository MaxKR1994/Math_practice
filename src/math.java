public class math {

    public static void main(String[] args) {
        int a = 2;
        float b = 4.2f;
        int c = 9;
        int d = (int) Math.abs(a-b);
        int g = a + (int) b;
        double v = Math.pow(g, 3) - Math.sqrt(c);
        int k = (int) (d/ v);
        double f = d/(v);
        float j = (float) (d/(v));
        System.out.println(d);
        System.out.println(g);
        System.out.println(k);
        System.out.println(f);
        System.out.println(j);

    }

}
