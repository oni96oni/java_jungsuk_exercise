package com.codechobo.book;

abstract class Player { //�߻� Ŭ���� ( �̿ϼ�Ŭ����,���赵)
	abstract void play(int pos); //�߻� �޼��� (�̿ϼ� �޼���)
	abstract void stop(); // �߻� �޼���( ����θ��ְ� ������(����)�� ���� �޼���)
}

class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+"��ġ���� play�մϴ�");}
	void stop() {System.out.println("����� ����ϴ�");}
}
public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); //������!
		ap.play(100);
		ap.stop();
	}

}
