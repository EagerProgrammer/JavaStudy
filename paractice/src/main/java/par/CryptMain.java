package par;

import org.mindrot.jbcrypt.BCrypt;

public class CryptMain {
    public static void main(String[] args){
        //복호화가 불가능한 암호화
        //64자리나 128자리 정도
        String encryptString = BCrypt.hashpw("abcdefghijklmn", BCrypt.gensalt());
        System.out.println(encryptString);
        //$2a$10$2RbTfo.oA/Xz9OZVLZJESuj3CHhoWnlmSt47uQkew5oYFdak5O.fu
        //$2a$10$RhHSGI28I4u9dTLBBruPLeEys2Kic0ywXUg1Am5lWeN2CnNeZcc4e
        //비교 - 평문이 먼저오고 암호화된 문장
        System.out.println(BCrypt.checkpw("abcdefghijklmn",encryptString));
        //예외 발생 - 순서가 바뀌면 안됨
        //System.out.println(BCrypt.checkpw(encryptString,"abcdefghijklmn"));
    }
}
