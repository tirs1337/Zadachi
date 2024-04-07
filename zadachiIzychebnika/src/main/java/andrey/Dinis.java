package andrey;

/**
 * пример.
 */
public class Dinis {
    /**
     *  имя.
     */

    private String name;
    /**
     * возраст.
     */
    private int age;

    /**
     * пример.
     * @param name - имя.
     * @param age - возраст.
     */
    public Dinis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * пример.
     * @return - имя.
     */
    public String getName() {
        return name;
    }

    /**
     * имя.
     * @param name - имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * имя.
     * @return - возраст.
     */
    public int getAge() {
        return age;
    }

    /**
     * возраст.
     * @param age - возраст.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
