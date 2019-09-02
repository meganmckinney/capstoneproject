package cap.stone.services.security;

/**
 * @Author: Megan McKinney
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
