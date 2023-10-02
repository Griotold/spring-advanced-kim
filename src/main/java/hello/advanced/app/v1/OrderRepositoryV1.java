package hello.advanced.app.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV1 {

    public void save(String itemId) {
        // 저장 로직
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생");
        }
        sleep(1000); // 상품 저장시 1초 걸린다고 가정
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
