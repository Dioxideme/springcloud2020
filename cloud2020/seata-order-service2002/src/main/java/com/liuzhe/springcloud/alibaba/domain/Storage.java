package com.liuzhe.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author : liuzhe
 * @date : 2020-10-19 19:46
 **/
@Data
public class Storage {
    private long id;

    /**
     * 产品id
     */

    private long productId;

    /**
     * 库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
