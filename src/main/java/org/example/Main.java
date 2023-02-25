public class Main {
    public static void main(String[] args) {

        byte b = 127; //8 bit [-128; 127]
        short sh = -32768; //16 bit [-32768; 32767]
        int i = 2147483647; //32 bit [-2147483648; 2147483647]
        long l = 0L; //64 bit [-9223372036854775808; 9223372036854775807]
        float ft = 0.01f; //32 bit [3.4e-38; 3.4e+38]
        double d = 3.14; // 64 bit [1.7e-308; 1.7e+308]
        char ch = 33000; //16 bit [0; 65535]
        boolean t = true;
        boolean f = false;
        boolean tf = true||false;
        boolean tandf = true&&false;

        System.out.println("bytemax+1: " + (byte) (b+1));
        System.out.println("minshort-1: "+ (short) (sh-1));
        System.out.println("intmax*2: "+i*2);
        System.out.println("intmax*2 (long): "+ i*2L);
        System.out.println("long to int: "+ (int)l);
        //System.out.println("long**2: "+ l**2); java: illegal start of expression
        System.out.println("long: "+ (Long) (l - 9223372036854775800L - 10 ));
        System.out.println((float)(ft + 90000000000000000000000000000000000000000000000.0));
        System.out.println(3.4e+38 + 90000000000000000000000000000000000000000000000.0);
        System.out.println("char+a: "+ (char) (ch+'a'));
        System.out.println("char a+a: "+ (char) ('a'+'a'));
        System.out.println("char \\u+a: "+ (char) ('a'+'\u0500'));
        System.out.println("char+30000: "+ (char) (ch+30000));
        System.out.println("true||false: "+ tf);
        System.out.println("true&&false: "+ tandf);

        System.out.println(0.0+3);
        System.out.println((int) 0.0 + 3);
        System.out.println((float) -1.7e-308 - 1.7e-308);
        System.out.println((long) 3.4e+38 +1);
        System.out.println((int)3.4e+38);
        System.out.println(3*1.0);
        System.out.println(3/3.0f);
        System.out.println((short)d/3);
        System.out.println(21474836470L+1e+10);
        System.out.println('a'*1e-2);
    }
}
