package com.liuzhe.springcloud.alibaba.service.impl;

import com.liuzhe.springcloud.alibaba.dao.StorageDao;
import com.liuzhe.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author : liuzhe
 * @date : 2020-10-19 20:02
 **/
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("----------------开始扣减库存");
        storageDao.decrease(productId,count);
        LOGGER.info("----------------扣减库存结束");
    }
}
