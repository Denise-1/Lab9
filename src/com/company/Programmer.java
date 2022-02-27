package com.company;

public class Programmer extends Employee {
    int bonus;

    public Programmer(int bonusConstrutor, double salary) {
        super(salary);
        this.bonus = bonusConstrutor;
    }

    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}