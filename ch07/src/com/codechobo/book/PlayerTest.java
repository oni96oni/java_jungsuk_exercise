package com.codechobo.book;

abstract class Player { //추상 클래스 ( 미완성클래스,설계도)
	abstract void play(int pos); //추상 메서드 (미완성 메서드)
	abstract void stop(); // 추상 메서드( 선언부만있고 구현부(몸통)이 없는 메서드)
}

class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+"위치부터 play합니다");}
	void stop() {System.out.println("재생을 멈춥니다");}
}
public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); //다형성!
		ap.play(100);
		ap.stop();
	}

}
