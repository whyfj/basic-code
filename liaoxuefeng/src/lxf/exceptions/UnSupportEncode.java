package lxf.exceptions;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class UnSupportEncode {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 先记下来再说:
            e.printStackTrace();
        }
        return null;
    }
}
