public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Can",25,100,100, 20);
        Fighter f2 = new Fighter("Ömer",15,90,100, 20);
        Match match = new Match(f1,f2,90,110);
        match.run();
    }
}