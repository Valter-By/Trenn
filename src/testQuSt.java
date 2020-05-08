public class testQuSt {

    public static void main(String[] args) {

        Qu<Integer> prostQ = new Qu<Integer>(1);
        St<Integer> prostS = new St<Integer>(1);

        for (int i = 1; i < 101; i++) {
            prostQ.put(i*i);
            prostS.put(i*i);
        }
        for (int i = 1; i < 103; i++) {
            System.out.println("Q - " + i + " - " + prostQ.get());
            System.out.println("S - " + i + " - " + prostS.get());
        }
    }
}
