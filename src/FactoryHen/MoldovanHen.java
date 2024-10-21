package FactoryHen;

public class MoldovanHen extends Hen{
    public String getDescription(){
        return super.getDescription() + "Моя страна - Молдавия. Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 150;
    }
}
