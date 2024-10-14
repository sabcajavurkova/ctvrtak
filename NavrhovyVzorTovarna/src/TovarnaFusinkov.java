// Bude vyrabet jine objekty nez tovarna Sabinov.. vyrezava je
public class TovarnaFusinkov implements Tovarna {
    @Override
    public Tvar vyrobTvar(String jmenoTvaru) {
        if (jmenoTvaru == null) {
            return null;
        } else if (jmenoTvaru.equalsIgnoreCase("ctverec")) {
            return new Ctverec();
//            return new VyrezanyCtverec();
        } else if (jmenoTvaru.equalsIgnoreCase("obdelnik")) {
            return new Obdelnik();
//            return new VyrezanyObdelnik();
        } else {
            // V main chytime exc
            throw new IllegalArgumentException();
        }
    }
}
