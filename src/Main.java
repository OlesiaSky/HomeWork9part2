public class Main {
    public static void main(String[] args) {
        Computer [] Computers = new Computer[5];
        Computers[0] = new Computer();
        Computers[0].setComputer("Asus");
        Computers[1] = new Computer();
        Computers[1].setComputer("Apple");
        Computers[2] = new Computer();
        Computers[2].setComputer("Lenovo");
        Computers[3] = new Computer();
        Computers[3].setComputer("Acer");
        Computers[4] = new Computer();
        Computers[4].setComputer("Dell");
        for(int i = 0; i < Computers.length; i++){
            System.out.println(Computers[i].getComputer());
        }
    }
}