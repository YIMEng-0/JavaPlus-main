package ChatGPT;

/**
 * @author Doraemon
 * @date 2023/3/4 20:52
 * @version 1.0
 */
import java.security.*;

public class KeyPairGeneratorExample {
    public static void main(String[] args) {
        try {
            // 创建 KeyPairGenerator 对象，指定算法为 RSA
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            // 初始化 KeyPairGenerator 对象，指定密钥长度
            keyPairGenerator.initialize(2048);

            // 生成密钥对
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // 获取公钥
            PublicKey publicKey = keyPair.getPublic();

            // 获取私钥
            PrivateKey privateKey = keyPair.getPrivate();

            // 输出公钥和私钥
            System.out.println("Public Key: " + publicKey);
            System.out.println("Private Key: " + privateKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

