public class Main {
    public static void main(String[] args){
        String name = "Александр Сергеевич";
        int age = 37;
        talk(name,age);
        move(name,age);
    }
    static void talk(String fullname, int age) {
        System.out.println(fullname+" "+age+" лет говорит");
    }
    static void move(String fullname, int age) {
        System.out.println(fullname+" "+age+ " лет бежит");
            Person person2 = new Person("nobody"+ " - его просто нет!");
        System.out.println(person2.name);
    }
    public static class Person {
        String name;
              Person(String name) {
            this.name = name;

        }
    }
}
