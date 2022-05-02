public class math {

    public static void main(String[] args) {
        int a = 2;
        float b = 4.2f;
        int c = 9;
        int d = (int) Math.abs(a-b);
        int g = a+ (int) b;
        int k = (int) (d/(Math.pow(g,3)-Math.sqrt(c)));
        double f = (d/(Math.pow(g,3)-Math.sqrt(c)));
        float j = (float) (d/(Math.pow(g,3)-Math.sqrt(c)));
        System.out.println(d);
        System.out.println(g);
        System.out.println(k);
        System.out.println(f);
        System.out.println(j);
    }

}
