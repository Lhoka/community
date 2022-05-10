package com.nowcoder.community.dao;


import org.springframework.stereotype.Repository;

@Repository
public class AlphaDapImpl implements AlphaDap {
    @Override
    public String select() {
        return "Hibernate";
    }
}
