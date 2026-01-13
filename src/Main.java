import dip.NotificationService;
import isp.Machine;
import isp.OldPrinter;
import lsp.*;
import ocp.*;
import srp.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------- S (SRP) ----------
        System.out.println("\n=== Демонстрация SRP ===");
        ReportManager manager = new ReportManager(List.of(5, 10, 15, 20));
        manager.generateReport();

        // ---------- O (OCP) ----------
        System.out.println("\n=== Демонстрация OCP ===");

        // Использование конкретных стратегий
        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        DiscountCalculator vipCalculator = new DiscountCalculator(new VipDiscount());
        DiscountCalculator studentCalculator = new DiscountCalculator(new StudentDiscount());

        System.out.println("Regular discount: " + regularCalculator.calculateDiscount(1000));
        System.out.println("VIP discount: " + vipCalculator.calculateDiscount(1000));
        System.out.println("Student discount: " + studentCalculator.calculateDiscount(1000));

        // Использование фабрики
        DiscountStrategy strategy = DiscountStrategyFactory.createStrategy("super_vip");
        System.out.println("Super VIP via factory: " + strategy.calculateDiscount(1000));

        // ---------- L (LSP) ----------
        System.out.println("\n=== Демонстрация LSP ===");

        // Летающие птицы
        FlyingBird sparrow = new Sparrow();
        displayFlyingBird(sparrow);

        // Нелетающие птицы
        Bird penguin = new Penguin();
        displayBird(penguin);

        // Специфичное поведение пингвина
        Penguin penguinObj = new Penguin();
        penguinObj.swim();

        // ---------- I (ISP) ----------
        System.out.println("\n=== Демонстрация ISP ===");
        Machine printer = new OldPrinter();
        printer.print("Отчёт за неделю");

        // ---------- D (DIP) ----------
        System.out.println("\n=== Демонстрация DIP ===");
        NotificationService service = new NotificationService();
        service.send("Ваш заказ готов к выдаче!");
    }

    public static void displayFlyingBird(FlyingBird bird) {
        bird.eat();
        bird.fly();
        System.out.println("---");
    }

    public static void displayBird(Bird bird) {
        bird.eat();
        System.out.println("---");
    }
}