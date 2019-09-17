package com.Capcom.domain;

/**
 * 包名:com.itheima.domain
 * 作者:Leevi
 * 日期2019-07-09  16:14
 * 手机
 */
public class Mobile {
    private String name;
    private Double money;

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
