package kr.codelabs.auth;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEncoder {

    @Test
    public void encodeCredentials() {
        String credentials = "client:password";
        String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

        System.out.println("Encoded Credentials: " + encodedCredentials);
    }
}
