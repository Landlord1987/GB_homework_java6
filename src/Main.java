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
            System.out.println("\nУ нас котиков: " + counterCat + "; " + "У нас собачек: " + counterDog + ";\n" + "Итого животных: " + counterAnimal + "\n");
            action(animal(), name);
            System.out.print("\nЖелаете еще поиграть с животными? (Y - да)\n");
            if (!scanner.next().equalsIgnoreCase("Y")) break;
        }


//        Dog dogBobik = new Dog("Бобик");
//        dogBobik.run(500);
//        dogBobik.sweem(200);
//
//        Cat catBarsik = new Cat("Барсик");
//        catBarsik.run(500);
//        catBarsik.sweem(100);
    }

    /**
     * Меню в котором можно выбрать кого создать: кота или собаку?
     *
     * @return объект Animal (cat or dog)
     */
    public static Animal animal() {

        do {
            System.out.println("1 - создать кота");
            System.out.println("2 - создать собаку");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Выберите имя Вашему котику: ");
                name = scanner.nextLine();
                counterCat++;
                return (cat = new Cat(name));

            } else if (choice == 2) {
                System.out.print("Выберите имя Вашей собачке: ");
                name = scanner.nextLine();
                counterDog++;
                return dog = new Dog(name);

            } else System.out.println("Вы не знаете цифр? Выберите между 1 и 2");
        } while (choice != 1 || choice != 2);
        return null;
    }

    /**
     * Заставляет животных плавать и бегать
     *
     * @param animal принимает параметр Animal
     * @param name   принимает параметр имя животного
     */
    public static void action(Animal animal, String name) {
        if (animal == cat) {
            System.out.println("1 - заставить " + name + "а бегать");
            System.out.println("2 - заставить " + name + "а плавать");
            System.out.println("3 - заставить " + name + "а и бегать и плавать");
            action = scanner.nextInt();
            if (action == 1) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен пробежать: ");
                distanceRun = scanner.nextInt();
                animal.run(distanceRun);
            } else if (action == 2) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен проплыть: ");
                distanceSweem = scanner.nextInt();
                animal.sweem(distanceSweem);
            } else if (action == 3) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен пробежать: ");
                distanceRun = scanner.nextInt();
                System.out.print("Введите дистанцию, которую " + name + " должен проплыть: ");
                distanceSweem = scanner.nextInt();
                animal.run(distanceRun);
                animal.sweem(distanceSweem);
            }

        } else if (animal == dog) {
            System.out.println("1 - заставить " + name + "а бегать");
            System.out.println("2 - заставить " + name + "а плавать");
            System.out.println("3 - заставить " + name + "а и бегать и плавать");
            action = scanner.nextInt();
            if (action == 1) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен пробежать: ");
                distanceRun = scanner.nextInt();
                animal.run(distanceRun);
            } else if (action == 2) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен проплыть: ");
                distanceSweem = scanner.nextInt();
                animal.sweem(distanceSweem);
            } else if (action == 3) {
                System.out.print("\nВведите дистанцию, которую " + name + " должен пробежать: ");
                distanceRun = scanner.nextInt();
                System.out.print("Введите дистанцию, которую " + name + " должен проплыть: ");
                distanceSweem = scanner.nextInt();
                animal.run(distanceRun);
                animal.sweem(distanceSweem);
            }
        }
    }
}