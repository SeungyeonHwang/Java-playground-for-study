package solid;

/**
 * 리스코브 치환의 원칙 : The Liskov Substitution Principle
 * 하위 클래스의 인스턴스는 상위형 객체 참조변수에 대입해 상위 클래스의 인스턴스 역할을 하는데 문제가 없어야 한다
 * 프로그램에서 부모 클래스의 인스턴스 대신 자식 클래스의 인스턴스로 대체해도 프로그램의 의미가 변하지 않는다
 * 이를 만족시키는 것은 재정의 하지 않는 것이다
 * ex ) 동물 -> 포유류, 조류 -> 고래, 박쥐 / 참새, 펭귄
 */

/**
 * 우선, 오버로딩(overloading)은 이름은 같지만 시그니처(파라미터 수, 타입) 데는 다른 메소드를 중복으로 선언하는 것을 의미하고,
 * 오버라이딩(overriding)은 부모 클래스의 메소드의 동작 방법을 변경(재정의)하여 우선적으로 사용하는 것이다.
 */
public class LSP {
    static class Rectangle {
        private int width;
        private int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int area() {
            return this.width * this.height;
        }


    }

    static class Square extends Rectangle {
        private int width;
        private int height;

        @Override
        public void setWidth(int value) {
            this.height = value;
            this.width = value;
        }

        @Override
        public void setHeight(int value) {
            this.height = value;
            this.width = value;
        }
    }

}

class Test {
    boolean checkAreaSize(LSP.Rectangle rectangle) {
        rectangle.setHeight(4);
        rectangle.setWidth(5);

        return rectangle.area() == 20;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.checkAreaSize(new LSP.Rectangle())); // true
        System.out.println(test.checkAreaSize(new LSP.Square())); // false

    }
}




