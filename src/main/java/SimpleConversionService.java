public class SimpleConversionService implements Exchange{

// usd to usd enter 5 you return 5
    @Override
    public int mint(Coins c) {
        return c.getAmount();
    }

    @Override
    public String text(Coins c) {
        return Integer.toString(c.getAmount());
    }
}

