package com.ucb.producto.dto;

public class CardRequestDto {
    private String card_number;
    private String cvv;
    private String expiration_date;
    public CardRequestDto(String card_number, String cvv, String expiration_date) {
        this.card_number = card_number;
        this.cvv = cvv;
        this.expiration_date = expiration_date;
    }

    public String getCard_number() {
        return card_number;
    }
    public String getCvv() {
        return cvv;
    }
    public String getExpiration_date() {
        return expiration_date;
    }
    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }
}