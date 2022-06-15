package solid;

/**
 * 개방 폐쇄의 원칙 (Open Close Principle)
 * 확장에는 열려있고 변화에는 닫혀 있어야 한다
 * -> 요구사항의 변경이나 추가 사항이 발생할 때, 기존의 코드 수정은 일어나지 않고,
 * 기존 구성요소를 쉽게 확장해서 재사용 가능
 */
public class OCP {

    /**
     * AppleMusic이 추가될 경우 기존 코드 변경 해야만 한다
     */
    class MusicPlayer {
        public void play() {
            System.out.println("play melon");
        }
    }

    /////--------------------------개선 후-----------------------------/////

    interface MusicApp {
        public void play();
    }

    class Melon implements MusicApp {

        @Override
        public void play() {
            System.out.println("play Melon");
        }
    }

    class Apple implements MusicApp {

        @Override
        public void play() {
            System.out.println("play Apple");
        }
    }


    class MusicPlayer_개선후 {
        private MusicApp musicApp;

        public MusicPlayer_개선후(MusicApp musicApp) {
            this.musicApp = musicApp;
        }

        public void play() {
            this.musicApp.play();
        }
    }

    public static void main(String[] strings) {
//        Apple apple = new Apple();

    }
}


