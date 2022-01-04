public class Main {
    public static void main(String[] args) {
    BankDetails recvizit = new BankDetails();
    recvizit.setBikNumber("044525232");
    System.out.println(recvizit);
    Company smartExpress = new Company("Smart-Express", recvizit);
    //some code
    recvizit.setBikNumber("044525000");
 //   System.out.println(smartExpress);
    }
}