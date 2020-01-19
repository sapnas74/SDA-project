package java_advanced.encapsulation;

public class Pocket {
    private int money;

    public int Pocket(int money) {
        if (this.money <= 10) {
            return 0;
        }
        return money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money < 0 || money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money!");
        } else {
            this.money = money;
        }
    }

}
