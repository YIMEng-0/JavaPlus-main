package ChatGPT;

/**
 * @author Doraemon
 * @date 2023/3/4 20:47
 * @version 1.0
 */
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class RSATest {
    public static void main(String[] args) throws Exception {
        // 生成公钥和私钥对
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("公钥： " + publicKey);
        System.out.println("私钥： " + privateKey);

        // 明文
        String plaintext = "Hello World!";

        // 加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] ciphertext = cipher.doFinal(plaintext.getBytes());

        // 解密
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedtext = cipher.doFinal(ciphertext);

        // 输出结果
        System.out.println("明文: " + plaintext);
        System.out.println("加密后: " + new String(ciphertext));
        System.out.println("解密后: " + new String(decryptedtext));
    }
}

