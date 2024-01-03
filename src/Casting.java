public class Casting {
    public static void main(String[] args) {
        double n = 35.15;
        int i = (int) n;

        System.out.println(i);

        //Exactitud
        int a = 45;
        int b = 7;

        System.out.println(a/b);
        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char num = '1';
        int numI = num;

        System.out.println(numI);

        short numS = (short) num;
        System.out.println(numS);

    }

}
