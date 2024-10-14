public class TovarnaSabinov implements Tovarna {
    @Override
    public Tvar vyrobTvar(String jmenoTvaru) {
        if (jmenoTvaru == null) {
            return null;
        } else if (jmenoTvaru.equalsIgnoreCase("ctverec")) {
            return new Ctverec();
        } else if (jmenoTvaru.equalsIgnoreCase("obdelnik")) {
            return new Obdelnik();
        } else {
            // V main chytime exc
            throw new IllegalArgumentException();
        }
    }
}
