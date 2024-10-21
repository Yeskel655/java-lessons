package FactoryHen;

public class BelarusianHen extends Hen{
    public String getDescription(){
        return super.getDescription() + "Моя страна - Беларусь. Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }
}
