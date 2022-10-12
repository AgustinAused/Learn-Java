package OOP;

public class Main {

    public static void main(String[] args) {
        Support myObj1 = new Support();
        Support myObj2 = new Support();
        myObj2.x = 40;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        myObj1.funcion();
    }
}
