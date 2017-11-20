package ru.popov.bodya.encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Bodya");
        user.setSurname("Popov");
        user.setAge(20);
        System.out.println(user);
    }
}
