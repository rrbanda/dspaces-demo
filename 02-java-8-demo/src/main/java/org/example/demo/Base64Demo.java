package org.example.demo;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class Base64Demo {
    public static void main(String[] args) throws Exception {
        String original = "Hello, Base64!";

        // Encode
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(original.getBytes());
        System.out.println("Encoded (legacy): " + encoded);

        // Decode
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodedBytes = decoder.decodeBuffer(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded (legacy): " + decoded);
    }
}
