package homework6.task1;

public class Money {
    public int rubles;
    public int kopecks;


    public int getRubles() {
        return rubles;
    }

    public void setRubles(int rubles) {
        this.rubles = rubles;
    }

    public int getKopecks() {
        return kopecks;
    }

    public void setKopecks(int kopecks) {
        this.kopecks = kopecks;
    }

    public Money(int rubles, int kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;

    }
    public Money addMoney(Money moneyToAdd) {
        int resultRubles;
        int resultKopecks;
        resultRubles = this.rubles + moneyToAdd.rubles;
        resultKopecks = this.kopecks + moneyToAdd.kopecks;
        if (resultKopecks>=100) {
            resultKopecks-=100;
            resultRubles++;
        }
        if (resultKopecks<0) {
            resultKopecks+=100;
            resultRubles--;
        }
        Money resultMoney = new Money(resultRubles, resultKopecks);
        return resultMoney;
    }
    public Money subtractMoney(Money moneyToAdd) {
        int resultRubles;
        int resultKopecks;
        resultRubles = this.rubles - moneyToAdd.rubles;
        resultKopecks = this.kopecks - moneyToAdd.kopecks;
        if (resultKopecks>=100) {
            resultKopecks-=100;
            resultRubles++;
        }
        if (resultKopecks<0) {
            resultKopecks+=100;
            resultRubles--;
        }
        Money resultMoney = new Money(resultRubles, resultKopecks);
        return resultMoney;
    }

    @Override
    public String toString() {
        return "Money{" +
                "rubles=" + rubles +
                ", kopecks=" + kopecks +
                '}';
    }
}
