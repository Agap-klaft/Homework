public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }
    public static void main (String[]args){
        Dog dog = new Dog("Боня", 1);
        dog.setName("Бонифаций");
        dog.setAge(1);
        System.out.println(dog.getName() + ", " + dog.getAge() + " год");
    }
}
