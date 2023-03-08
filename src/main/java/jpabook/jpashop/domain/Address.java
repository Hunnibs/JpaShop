package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String Street;
    private String ZipCode;

    protected Address(){

    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.Street = street;
        this.ZipCode = zipCode;
    }
}
