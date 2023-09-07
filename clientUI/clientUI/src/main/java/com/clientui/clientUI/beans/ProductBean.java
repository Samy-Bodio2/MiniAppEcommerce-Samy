package com.clientui.clientUI.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ProductBean {
    private int id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}
