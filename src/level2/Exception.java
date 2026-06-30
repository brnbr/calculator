package level2;

import java.io.IOException;

public class Exception {
    public void exception() throws IOException {
        throw new IOException("잘못된 입력 입니다.");
    }
}
