package guru.springframework.util;

public class MyUtils {

    public static Byte[] convertToWrapperByteArray(byte[] byteArray) {
        Byte[] byteWrapperArray = new Byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            byteWrapperArray[i] = byteArray[i];
        }
        return byteWrapperArray;
    }

    public static byte[] convertToPrimitiveByteArray(Byte[] wrappedByteArray) {
        byte[] byteArray = new byte[wrappedByteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = wrappedByteArray[i];
        }
        return byteArray;
    }
}
