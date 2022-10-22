public class Dog extends Animal {

    private String name;

    /**
     * Конструктор Dog
     * @param name Имя собачки
     */
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println(name + " пробежал " + distance);
        } else if (distance > 500) {
            int difference = distance - 500;
            System.out.println(name + " пробежал 500 метров и больше не может, ему еще осталось " + difference + " метров");
        } else if (distance < 0) {
            System.out.println(name + "не бегает задом наперед");
        }

    }

    @Override
    public void sweem(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance);
        } else if (distance > 10) {
            int difference = distance - 10;
            System.out.println(name + " проплыл 10 метров и больше не может, ему еще осталось " + difference + " метров");
        } else if (distance < 0) {
            System.out.println(name + "не плавает задом наперед");
        }
    }
}
