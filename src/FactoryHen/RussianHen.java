package FactoryHen;

public class RussianHen extends Hen{
    public String getDescription(){
        return super.getDescription() + "Моя страна - Росcия. Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }
}
