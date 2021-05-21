package com.siriusdb.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 索引数据结构
 * @author: ylx
 * @date: 2021/05/20 2：49 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Index {

    private String indexName;

    private String tableName;

    private String attributeName;

}