package org.example.demo;

import java.io.*;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

public class PackUtil {

    public static void packJar(String inputJarPath, String outputPackPath) throws IOException {
        File jarFile = new File(inputJarPath);
        File packFile = new File(outputPackPath);

        try (JarFile jar = new JarFile(jarFile);
             FileOutputStream fos = new FileOutputStream(packFile)) {
            Pack200.Packer packer = Pack200.newPacker();
            packer.pack(jar, fos);
        }
    }

    public static void unpackJar(String inputPackPath, String outputJarPath) throws IOException {
        File packFile = new File(inputPackPath);
        File jarFile = new File(outputJarPath);

        try (InputStream is = new FileInputStream(packFile);
             JarOutputStream jos = new JarOutputStream(new FileOutputStream(jarFile))) {
            Pack200.Unpacker unpacker = Pack200.newUnpacker();
            unpacker.unpack(is, jos);
        }
    }
}
