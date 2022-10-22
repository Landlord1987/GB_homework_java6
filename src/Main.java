import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static String name;
    static Dog dog;
    static Cat cat;
    static int counterDog = 0;
    static int counterCat = 0;
    static int counterAnimal = 0;
    static int action;
    static int distanceRun;
    static int distanceSweem;

    public static void main(String[] args) {

        while (true) {
            counterAnimal = counterCat + counterDog;
            System.out.println("\n� ��� �������: " + counterCat + "; " + "� ��� �������: " + counterDog + ";\n" + "����� ��������: " + counterAnimal + "\n");
            action(animal(), name);
            System.out.print("\n������� ��� �������� � ���������? (Y - ��)\n");
            if (!scanner.next().equalsIgnoreCase("Y")) break;
        }


//        Dog dogBobik = new Dog("�����");
//        dogBobik.run(500);
//        dogBobik.sweem(200);
//
//        Cat catBarsik = new Cat("������");
//        catBarsik.run(500);
//        catBarsik.sweem(100);
    }

    /**
     * ���� � ������� ����� ������� ���� �������: ���� ��� ������?
     *
     * @return ������ Animal (cat or dog)
     */
    public static Animal animal() {

        do {
            System.out.println("1 - ������� ����");
            System.out.println("2 - ������� ������");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("�������� ��� ������ ������: ");
                name = scanner.nextLine();
                counterCat++;
                return (cat = new Cat(name));

            } else if (choice == 2) {
                System.out.print("�������� ��� ����� �������: ");
                name = scanner.nextLine();
                counterDog++;
                return dog = new Dog(name);

            } else System.out.println("�� �� ������ ����? �������� ����� 1 � 2");
        } while (choice != 1 || choice != 2);
        return null;
    }

    /**
     * ���������� �������� ������� � ������
     *
     * @param animal ��������� �������� Animal
     * @param name   ��������� �������� ��� ���������
     */
    public static void action(Animal animal, String name) {
        if (animal == cat) {
            System.out.println("1 - ��������� " + name + "� ������");
            System.out.println("2 - ��������� " + name + "� �������");
            System.out.println("3 - ��������� " + name + "� � ������ � �������");
            action = scanner.nextInt();
            if (action == 1) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ���������: ");
                distanceRun = scanner.nextInt();
                animal.run(distanceRun);
            } else if (action == 2) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ��������: ");
                distanceSweem = scanner.nextInt();
                animal.sweem(distanceSweem);
            } else if (action == 3) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ���������: ");
                distanceRun = scanner.nextInt();
                System.out.print("������� ���������, ������� " + name + " ������ ��������: ");
                distanceSweem = scanner.nextInt();
                animal.run(distanceRun);
                animal.sweem(distanceSweem);
            }

        } else if (animal == dog) {
            System.out.println("1 - ��������� " + name + "� ������");
            System.out.println("2 - ��������� " + name + "� �������");
            System.out.println("3 - ��������� " + name + "� � ������ � �������");
            action = scanner.nextInt();
            if (action == 1) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ���������: ");
                distanceRun = scanner.nextInt();
                animal.run(distanceRun);
            } else if (action == 2) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ��������: ");
                distanceSweem = scanner.nextInt();
                animal.sweem(distanceSweem);
            } else if (action == 3) {
                System.out.print("\n������� ���������, ������� " + name + " ������ ���������: ");
                distanceRun = scanner.nextInt();
                System.out.print("������� ���������, ������� " + name + " ������ ��������: ");
                distanceSweem = scanner.nextInt();
                animal.run(distanceRun);
                animal.sweem(distanceSweem);
            }
        }
    }
}