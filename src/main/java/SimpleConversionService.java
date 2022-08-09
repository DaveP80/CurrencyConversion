public class SimpleConversionService implements Exchange{


    @Override
    public int mint(Coins c) {
        return c.getAmount();
    }

    @Override
    public String text(Coins c) {
        return Integer.toString(c.getAmount());
    }
}

