public class unary {
    public static void main(String[] args) {
        int x = 4;
        int y = -x;
        int z = -y;
        System.out.println(z);

        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        // difference in p++ and ++p
        System.out.println("the difference");
        int p = 3;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
        int w = 2;
        System.out.println(--w);
        System.out.println(w);
        System.out.println(w--);
        System.out.println(w);
    }
}
