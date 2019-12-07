package com.leyou.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @Document用于指定数据库的conllection
 *
 * @field用于指定数据库字段
 *
 * @id用于标识主键
 *
 * @GeneratedValue 自动生成id
 */
@Getter
@Setter
@Document(collection = "tes_namespace")
public class Namespace implements Serializable {

    private static final long serialVersionUID = 4531499444309419351L;

    @Field("name")
    private String name;

    @Field("code")
    private String code;

    @Field("description")
    private String description;
}

