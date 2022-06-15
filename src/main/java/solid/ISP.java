package solid;

/**
 * 인터페이스 분리의 원칙 Interface Segregation Principle
 * 인터페이스를 통해 메서드를 외부에 제공할 떄는 최소한의 메서드만 제공해라
 * 클라이언트는 자신이 이용하지 않는 기능에는 영향을 받지 말아야 한다
 * 꼭 필요한 기능만 사용하도록
 * 클라이언트에 특화 되도록 분리
 */
public class ISP {

    //is able to
    interface Animal {
        public void eat();
        public void sleep();
//        public void fly();
    }

    //인터페이스 분리
    interface Bird {
        public void fly();
    }

    class Tiger implements Animal {

        @Override
        public void eat() {

        }

        @Override
        public void sleep() {

        }

        /**
         * 필요하지 않은 기능 -> not able to
         */
//        @Override
//        public void fly() {

//        }
    }




}
