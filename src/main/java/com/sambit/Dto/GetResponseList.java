package com.sambit.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetResponseList {
    private String cname;
    private String pname;
    private int qty;
    private int price;
}
