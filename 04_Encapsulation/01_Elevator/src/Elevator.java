import java.util.Scanner;

public class Elevator {

    private int currentFloor = 1;

    private int minFloor;
    private int maxFloor;

    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
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
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();

            if (floor > maxFloor || floor < minFloor) {
                System.out.println("Введен некорректный этаж");
            }
            if (floor == currentFloor) {
                System.out.println("Вы уже на месте");
            }else {
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
