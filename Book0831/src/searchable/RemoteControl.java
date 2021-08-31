package searchable;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�");
		} else {
			System.out.println("���� �����մϴ�");
		}
	}
	
	static void changeBatter() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
}