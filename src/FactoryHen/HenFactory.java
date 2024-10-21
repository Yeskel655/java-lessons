package FactoryHen;

public class HenFactory {

    public enum HenType {
        UKRAINIAN,
        RUSSIAN,
        MOLDOVAN,
        BELARUSSIAN
    }

    public Hen getHen(HenType type) {
        Hen hen = null;
        switch (type) {
            case UKRAINIAN:
                hen = new UkrainianHen();
                break;
            case RUSSIAN:
                hen = new RussianHen();
                break;
            case MOLDOVAN:
                hen = new MoldovanHen();
                break;
            case BELARUSSIAN:
                hen = new BelarusianHen();
                break;
        }
        return hen;
    }
}
