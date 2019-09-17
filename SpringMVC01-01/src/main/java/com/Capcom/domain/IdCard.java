package com.Capcom.domain;

/**
 * 包名:com.itheima.domain
 * 作者:Leevi
 * 日期2019-07-09  16:08
 * 身份证
 */
public class IdCard {
    private String cardNum;
    private String cardAddress;

    @Override
    public String toString() {
        return "IdCard{" +
                "cardNum='" + cardNum + '\'' +
                ", cardAddress='" + cardAddress + '\'' +
                '}';
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(String cardAddress) {
        this.cardAddress = cardAddress;
    }
}
