package com.PagingAndSorting.PagingAndSorting.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyRequest {
    private int page;
    private int size;
    private String sortBy;
}
