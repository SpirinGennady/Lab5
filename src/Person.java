public class Person {
    public static void main(String[] args){
        String name = "��������� ���������";
        int age = 37;
        talk(name,age);
        move(name);
    }
    static void talk(String fullname, int age) {
        System.out.println(fullname+" "+age+" �������");
    }
    static void move(String fullname) {
        System.out.println(fullname+ " �����");
    }
}
