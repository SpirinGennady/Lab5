public class Person {
    public static void main(String[] args){
        String name = "Александр Сергеевич";
        int age = 37;
        talk(name,age);
        move(name);
    }
    static void talk(String fullname, int age) {
        System.out.println(fullname+" "+age+" говорит");
    }
    static void move(String fullname) {
        System.out.println(fullname+ " бежит");
    }
}
