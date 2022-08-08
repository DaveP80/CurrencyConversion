public class ConversionService{

    private Exchange exchange;

    public ConversionService(Exchange exchange) {
        this.exchange = exchange;


    }

    public void convert (Coins c) {


        System.out.println(this.exchange.mint(c));
    }

}
