package solid;

/**
 * 의존성 역전의 원칙 Dependency Inversion Principle
 * 의존성을 맺을 때, 구체적인 클래스보다 인터페이스나 추상 클래스와 관계를 맺는
 * 상위 모듈은 하위 모듈의 구현에 의존해서는 안되며, 하위 모듈은 상위모듈의 추상에 의존
 * 상위는 변경이 힘듬, 하위는 변경이 쉬움
 * 하위 레벨에서의 변경이 상위에 영향을 주지 않는다
 * 즉 변경에 강하며 유지보수가 쉽다
 */
public class DIP {
    interface MusicApp {
        public void play();
    }

    class Melon implements MusicApp {
        @Override
        public void play() {
            System.out.println("play melon");
        }
    }

    class MusicPlayer {
        //구체적인 클래스와 의존관계를 맺음 -> 깨지기 쉽다
//        private Melon melon;

        private MusicApp musicApp;

        public MusicPlayer(MusicApp musicApp) {
            this.musicApp = musicApp;
        }
    }


}
