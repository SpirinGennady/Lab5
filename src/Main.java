public class Main {
    public static void main(String[] args){
        String name = "��������� ���������";
        int age = 37;
        talk(name,age);
        move(name,age);
    }
    static void talk(String fullname, int age) {
        System.out.println(fullname+" "+age+" ��� �������");
    }
    static void move(String fullname, int age) {
        System.out.println(fullname+" "+age+ " ��� �����");
            Person person2 = new Person("nobody"+ " - ��� ������ ���!");
        System.out.println(person2.name);
    }
    public static class Person {
        String name;
              Person(String name) {
            this.name = name;

        }
    }
}
