interface motor {
    final int cap = 100;
    void run();
    void consume();
    }
    class washing_machine implements motor {
    public void run() {
    System.out.println("Capacity:" + cap);
    System.out.println("Running Succsefully");
    }
    public void consume() {
    System.out.println("Daily consumption: 4hr");
    } }
    public class Q4 {
    public static void main(String[] args) {
    washing_machine w_513 = new washing_machine();
    w_513.run();
    w_513.consume();
    } }