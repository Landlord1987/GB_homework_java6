public class Cat extends Animal {

    String name;

    /**
     * Конструктор Cat
     * @param name Имя кота
     */
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance);
        } else if (distance > 200) {
            int difference = distance - 200;
            System.out.println(name + " пробежал 200 метров и больше не может, ему еще осталось " + difference + " метров");
        } else if (distance < 0) {
            System.out.println(name + "не бегает задом наперед");
        }
    }

    @Override
    public void sweem(int distance) {
        System.out.println(name + " не умеет плавать, но обязательно научиться и проплывет " + distance + " метров");
    }
}
