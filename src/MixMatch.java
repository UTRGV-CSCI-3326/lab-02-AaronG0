public class MixMatch{
    public static void main(String[] args){
        String name = "meow";
        char letter = 'w';
        short smallnum = 1;
        int num = 100000;
        long longnum = 100000000;
        float fnum = 1.1f;
        double dnum = 1.111;
        boolean bool = true;
        System.out.println(name + ": String, typically integrated as an array of characters");
        System.out.println(letter + ": Char, uses the ascii code to identify each character uniquely and has arithmetic capabilites");
        System.out.println(smallnum + ": Short, has a size of 16 bits/2 bytes");
        System.out.println(num + ": Int, has a size of 32 bits, twice that of short");
        System.out.println(longnum + ": Long, has a size of 64 bits, twice that of int");
        System.out.println(fnum + ": Float, provides 6-7 decimal digits of precision with a size of 32 bits");
        System.out.println(dnum + ": Double, provides DOUBLE the precision of a float with DOUBLE the size; 64 bits ");
        System.out.println(bool + ": Bool, only holds 1 of 2 values, true or false");
    }
}