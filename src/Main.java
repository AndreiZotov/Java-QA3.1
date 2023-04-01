public class Main {
    public static void main(String[] args) {
        System.out.println( "Введите сумму и узнайте сколько начислено бонусных миль" );
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}