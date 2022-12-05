package lesson13;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        int i = scanner.nextInt();
        QueueInt queueInt = new QueueInt(i);
        System.out.println("очередь с размером" + ' ' + i + "  создана");
        System.out.println("in - для добавления в очередь, out - для удаления из очереди, exit - для выхода из программы");
        scanner=new Scanner(System.in);
        String in = scanner.nextLine();
        if (in.equals("in")) {
            scanner=new Scanner(System.in);
            String st = scanner.nextLine();
            if (queueInt.proverka()) {
                queueInt.enqueue(st);
            } else {
                System.out.println("в очереди нет место, подождите");
            }
        } else if (in.equals("out")) {
            scanner=new Scanner(System.in);
            String st1 = scanner.nextLine();
            if (queueInt.proverka()) {
                queueInt.dequeue(st1);
            }
        } else if (in.equals("exit")) {
            System.exit(0);

        }


    }
}

