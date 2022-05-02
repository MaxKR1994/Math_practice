public class math {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 4;

        double d = ((Math.abs(a+b))/(Math.pow((a+b),3)-Math.sqrt(c)));
        float k =(float) ((Math.abs(a+b))/Math.pow((a+b),3)-Math.sqrt(c));
        int f = (int) ((Math.abs(a+b))/Math.pow((a+b),3)-Math.sqrt(c));
        System.out.println(d);
        System.out.println(f);
        System.out.println(k);

    }

}
