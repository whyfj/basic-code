package lxf.coreclass;

import java.math.BigInteger;

public class BigIntTest {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000
        System.out.println(bi.pow(5).getClass().toString());
        BigInteger bo = new BigInteger(bi.pow(5).toString());
        System.out.println(bo);
        System.out.println(bo.longValue());
        System.out.println(bi.longValueExact());
        int i = 23;
        System.out.println(bi.multiply(bi).longValueExact());
        BigInteger bp = new BigInteger("1");
        System.out.println(bp);

    }
}
