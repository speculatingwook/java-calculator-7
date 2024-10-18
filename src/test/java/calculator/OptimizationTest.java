package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OptimizationTest extends NsTest {
    @Test
    void 성능_테스트() {
        long startTime = System.nanoTime();
        run("//;\\n1;2:3,4;5");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        double elapsedTimeInMs = elapsedTime / 1_000_000.0;
        System.out.printf("%.2f ms%n", elapsedTimeInMs);

        assertThat(elapsedTime / 1_000_000).isLessThan(100); // 예: 100ms 이하로 실행되기를 기대
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
