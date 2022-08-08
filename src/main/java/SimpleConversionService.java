public class SimpleConversionService implements Exchange{


    @Override
    public int mint(Coins c) {
        return c.getAmount();
    }
}

