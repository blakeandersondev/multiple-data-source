package com.zyl.multipledatasource.domain;

import lombok.Data;

import java.time.Instant;

@Data
public class MysqlTable {

    private Long id;
    private String code;
    private String name;

    private Instant createdTime;
    private Instant updatedTime;
}
