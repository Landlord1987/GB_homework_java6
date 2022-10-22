public class Cat extends Animal {

    String name;

    /**
     * ����������� Cat
     * @param name ��� ����
     */
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println(name + " �������� " + distance);
        } else if (distance > 200) {
            int difference = distance - 200;
            System.out.println(name + " �������� 200 ������ � ������ �� �����, ��� ��� �������� " + difference + " ������");
        } else if (distance < 0) {
            System.out.println(name + "�� ������ ����� �������");
        }
    }

    @Override
    public void sweem(int distance) {
        System.out.println(name + " �� ����� �������, �� ����������� ��������� � ��������� " + distance + " ������");
    }
}
