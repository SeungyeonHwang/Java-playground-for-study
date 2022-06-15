package solid;

/**
 * Single Responsibility Principle
 * 단일 책임의 원칙
 */
public class SRC {
    final static Boolean 수컷 = true;
    final static Boolean 암컷 = false;

    /**
     * 강아지의 성별에 따라 메소드가 분기되고 있다 -> SRC 위배
     * -> 대표적인 사인이 if 다
     */
    class 강아지 {
        Boolean 성별;

        void 소변보다() {
            if (this.성별 == 수컷) {
                // 한쪽 다리를 들고 소변을 본다
            } else {
                // 뒷다리 두개를 굽혀 앉은 자세로 소변을 본다
            }
        }
    }


    /**
     * 데이터 베이스 테이블 설계할때도 정규화 -> 테이블과 필드에 대한 단일 책임원칙의 적용
     */
    abstract class 강아지_개선 {
        abstract void 소변보다();
    }

    class 수컷강아지 extends 강아지_개선 {
        @Override
        void 소변보다() {
            // 한쪽 다리를 들고 소변을 본다
        }
    }

    class 암컷강아지 extends 강아지_개선 {
        @Override
        void 소변보다() {
            // 뒷다리 두개를 굽혀 앉은 자세로 소변을 본다
        }
    }
}
