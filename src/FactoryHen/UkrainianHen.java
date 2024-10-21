package FactoryHen;

public class UkrainianHen extends Hen{
    public String getDescription(){
        return super.getDescription() + "Моя страна - Украина. Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }
}
