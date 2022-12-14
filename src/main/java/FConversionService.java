public class FConversionService implements Exchange {

    @Override
    public int mint(Coins c) {
        return c.getAmount()*2;
    }

    @Override
    public String text(Coins c) {
        return Integer.toString(c.getAmount()*2);
    }
}
