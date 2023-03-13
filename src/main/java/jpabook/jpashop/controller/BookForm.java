package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {
    @NotEmpty(message = "* 책 이름 입력칸은 필수 입니다.")
    private String name;
    private int price;
    private Long id;
    private String author;
    private int stockQuantity;
    private String isbn;

}
