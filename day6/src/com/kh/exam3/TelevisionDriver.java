// �ǽ� 7.3: TelevisionDriver.java
// Television ��ü�� ����� �̿��Ѵ�
package com.kh.exam3;

public class TelevisionDriver {
    // main �޼ҵ�
    public static void main(String[] args) {
        // ù ��° Television ��ü�� �����
        Television televisionOne = new Television();

        // ù ��° Television ��ü�� �귣�� �̸��� ���Ｚ������ �Ѵ�
        televisionOne.setBrandName("�Ｚ");

        // ù ��° Television ��ü�� ������ �Ҵ�
        televisionOne.setPowered(true);

        // ù ��° Television ��ü�� ä�� ��ȣ�� 1������ �Ѵ�
        televisionOne.setChannel(1);

        // ù ��° Television ��ü�� ������ 6���� �Ѵ�
        televisionOne.setVolume(6);

        // ù ��° Television ��ü�� ��� ������ ������ ����Ѵ�
        System.out.println(televisionOne.toString());

        // ù ��° Television ��ü�� ä���� 1��ŭ ���ҽ�Ų��
        televisionOne.decrementChannel();

        // ù ��° Television ��ü�� ������ 1��ŭ ������Ų��
        televisionOne.incrementVolume();

        // ù ��° Television ��ü�� ��� ������ ������ ����Ѵ�
        System.out.println(televisionOne.toString());

        // �� ��° Television ��ü�� �����
        Television televisionTwo = new Television();

        // �� ��° Television ��ü�� �귣�� �̸��� ���������� �Ѵ�
        televisionTwo.setBrandName("����");

        // �� ��° Television ��ü�� ������ �Ҵ�
        televisionTwo.setPowered(true);

        // �� ��° Television ��ü�� ä�� ��ȣ�� 98������ �Ѵ�
        televisionTwo.setChannel(98);

        // �� ��° Television ��ü�� ������ 12�� �Ѵ�
        televisionTwo.setVolume(12);

        // �� ��° Television ��ü�� ��� ������ ������ ����Ѵ�
        System.out.println(televisionTwo.toString());

        // �� ��° Television ��ü�� ä���� 1��ŭ ������Ų��
        televisionTwo.incrementChannel();

        // �� ��° Television ��ü�� ä���� 1��ŭ ������Ų��
        televisionTwo.incrementChannel();

        // �� ��° Television ��ü�� ������ 1��ŭ ������Ų��
        televisionTwo.incrementVolume();

        // �� ��° Television ��ü�� ��� ������ ������ ����Ѵ�
        System.out.println(televisionTwo.toString());
    }
}