import java.util.Scanner;

public class Elevator {

    private int currentFloor = 1;

    private int minFloor;
    private int maxFloor;

    Elevator() {
        minFloor = -3;
        maxFloor = 100;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = (minFloor < currentFloor) ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = (maxFloor > currentFloor) ? currentFloor + 1 : currentFloor;
    }


    public void move() {
        while (true) {
            System.out.println("Введите номер эатажа: ");
            int floor = new Scanner(System.in).nextInt();

            if (floor > maxFloor || floor < minFloor) {
                System.out.println("Введен некорректный этаж");
            } else {
                while (floor < currentFloor) {
                    moveDown();
                    System.out.println("Идет вниз " + getCurrentFloor());
                }

                while (floor > currentFloor) {
                    moveUp();
                    System.out.println("Идет вверх " + getCurrentFloor());
                }
            }
        }
    }
}
