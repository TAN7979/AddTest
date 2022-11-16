public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expented = 150;
        Long actual = service.calculate(5_000, true);
        System.out.println("1." + expented + "== ? ==" + actual);

        expented = 50;
        actual = service.calculate(5_000, false);
        System.out.println("2." + expented + "== ? ==" + actual);
    }
}
