public class Dog extends Animal {

    private String name;

    /**
     * ����������� Dog
     * @param name ��� �������
     */
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println(name + " �������� " + distance);
        } else if (distance > 500) {
            int difference = distance - 500;
            System.out.println(name + " �������� 500 ������ � ������ �� �����, ��� ��� �������� " + difference + " ������");
        } else if (distance < 0) {
            System.out.println(name + "�� ������ ����� �������");
        }

    }

    @Override
    public void sweem(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println(name + " ������� " + distance);
        } else if (distance > 10) {
            int difference = distance - 10;
            System.out.println(name + " ������� 10 ������ � ������ �� �����, ��� ��� �������� " + difference + " ������");
        } else if (distance < 0) {
            System.out.println(name + "�� ������� ����� �������");
        }
    }
}
