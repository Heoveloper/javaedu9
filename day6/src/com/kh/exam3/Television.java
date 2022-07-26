//  �ǽ� 7.3: Television.java
//   �� Ŭ������ �ڷ����� ��ü�� ���Ѵ�.
//   ������:
//    	 �� �ڷ������� 1-99 ������ ä�ε��� ������ �ִ�.
package com.kh.exam3;

public class Television {
    //�����
    public static final int MINCHANNEL = 1;    // ���� ���� ä�� ��ȣ
    public static final int MAXCHANNEL = 99;   // ���� ū ä�� ��ȣ

    //��ü ������
    private String BrandName;                // TV�� �귣���
    private boolean Powered = false;        // TV�� ���� �ִ°� ���� �ִ°�?
    private int Channel = MINCHANNEL;    // TV�� ���� ä����?
    private int Volume = 0;                // TV�� ����

    //������ �޼ҵ��

    //�⺻ ������ �޼ҵ�
    //����: ��� ��ü �������� ���� ���� ���ǵ� �⺻ ������ ���Ѵ�
    //@�Է� �Ű�����
    //����
    public Television() {
        // ���⿡�� �ƹ��͵� ���� �ʴ´�
    }

    //������ �޼ҵ�
    //�޼ҵ�: getChannel
    //����: TV�� ���� ä���� ��ȯ�Ѵ�
    //@��ȯ��: TV�� ���� ä��
    public int getChannel(){
        return (Channel);
    }

    //�޼ҵ�: getBrandName
    //����: TV�� getBrandName
    //@��ȯ��: TV�� �귣���
    public String getBrandName() {
        return this.BrandName;
    }

    //�޼ҵ�: getVolume
    //����: TV�� ������ ��ȯ�Ѵ�
    //@��ȯ��: TV�� ����
    public int getVolume() {
        return this.Volume;
    }

    //�޼ҵ�: getPower
    //����: TV�� ���� ���� ���¸� ��ȯ�Ѵ�
    //@��ȯ��: TV�� ���� ���� ����
    public boolean getPower() {
        return this.Powered;
    }

    //�޼ҵ�: toString
    //����: �� ��ü�� ���� ���¸� ��Ÿ���� ���ڿ��� ��ȯ�Ѵ�.
    //@��ȯ��: �� ��ü�� ������� �����ϴ� ������ �����ϴ� ���ڿ�
    public String toString() {
        String str = "";
        str += "�귣��: " + this.getBrandName() + "\n";
        str += "�Ŀ�: " + this.getPower() + "\n";
        str += "ä��: " + this.getChannel() + "\n";
        str += "����: " + this.getVolume() + "\n";
        return str;
    }

    //������ �޼ҵ�
    //�޼ҵ�: setPowered
    //����: TV�� ������ �־��� ������ �����Ѵ�.
    //@�Է� �Ű�����
    //NewPowered - TV�� �� ���� ����
    //@��ȯ��: ����
    public void setPowered(boolean NewPowered) {
        Powered = NewPowered;
    }

    //�޼ҵ�: setChannel
    //����: TV�� ä�� ��ȣ�� �־��� ������ �����Ѵ�.
    //@�Է� �Ű�����
    //NewChannel - TV�� �� ä�� ��ȣ
    //@��ȯ��: ����
    public void setChannel(int NewChannel) {
        this.Channel = NewChannel;
    }

    //�޼ҵ�: setBrandName
    //����: TV�� �귣����� �־��� ������ �����Ѵ�.
    //@�Է� �Ű�����
    //NewBrandName - TV�� �� �귣���
    //@��ȯ��: ����
    public void setBrandName(String NewBrandName) {
        this.BrandName = NewBrandName;
    }

    //�޼ҵ�: setVolume
    //����: TV�� ������ �־��� ������ �����Ѵ�.
    //@�Է� �Ű�����
    //NewVolume - TV�� �� ����
    //@��ȯ��: ����
    public void setVolume(int NewVolume) {
        this.Volume = NewVolume;
    }

    //�޼ҵ�: incrementChannel
    //����: TV�� ä���� 1��ŭ ������Ų��. �ִ밪�� �ʰ��ϸ� �ּҰ����� �����Ѵ�.
    //@�Է� �Ű�����: ����
    //@��ȯ��: ����
    public void incrementChannel() {
        this.Channel++;
    }

    //�޼ҵ�: decrementChannel
    //����: TV�� ä���� 1��ŭ ���ҽ�Ų��. �ּҰ����� �۾����� �ִ밪���� �����Ѵ�.
    //@�Է� �Ű�����: ����
    //@��ȯ��: ����
    public void decrementChannel() {
        this.Channel--;
    }

    //�޼ҵ�: incrementVolume
    //����: TV�� ������ 1��ŭ ������Ų��. �ִ밪�� �ʰ��ϸ� �ִ밪���� �Ѵ�.
    //@�Է� �Ű�����: ����
    //@��ȯ��: ����
    public void incrementVolume() {
        this.Volume++;
    }

    //�޼ҵ�: decrementVolume
    //����: TV�� ������ 1��ŭ ���ҽ�Ų��. �ּҰ����� �۾����� �ּҰ����� �����Ѵ�.
    //@�Է� �Ű�����: ����
    //@��ȯ��: ����
    public void decrementVolume() {
        this.Volume--;
    }
}