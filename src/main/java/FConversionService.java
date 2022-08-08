public class FConversionService implements Exchange {

    @Override
    public int mint(Coins c) {
        return c.getAmount()*2;
    }
}
