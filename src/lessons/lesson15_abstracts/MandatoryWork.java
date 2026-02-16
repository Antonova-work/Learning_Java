package lessons.lesson15_abstracts;

import java.util.ArrayList;

public class MandatoryWork {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        Manager newManager = new Manager("Саша", 1000, 500);
        Courier newCourier = new Courier("Серёжа", 1500, "Bicycle");

        staff.add(newManager);
        staff.add(newCourier);

        for (Employee employee : staff) {
            employee.displayInfo();
            employee.work();
        }

        System.out.println("Всего сотрудников в штате: " + Employee.employeeCount);
    }
}

abstract class Employee {
    String name;
    int salary;
    static int employeeCount;

    public Employee (String newName, int newSalary) {
        this.name = newName;
        this.salary = newSalary;
        employeeCount++;
    }

    void displayInfo () {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary);
    }

    abstract void work();
}

class Manager extends Employee {
    int bonus;

    public Manager (String name, int salary, int newBonus) {
        super(name, salary);
        this.bonus = newBonus;
    }

    @Override
    void displayInfo () {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary + " | " + " Бонус: " + this.bonus);
    }

    @Override
    void work() {
        System.out.println("Я управляю отделом!");
    }
}

class Courier extends Employee {
    String vehicleType;

    public Courier (String name, int salary, String newVehicleType) {
        super(name, salary);
        this.vehicleType = newVehicleType;
    }

    @Override
    void displayInfo() {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary + " | " +
                " Средство передвижения: " + this.vehicleType);
    }

    @Override
    void work() {
        System.out.println("Я доставляю заказы!");
    }
}
