package com.tkx.tian_demo.repository.dev.impl;

import com.tkx.tian_demo.models.SellerFreeze;
import com.tkx.tian_demo.models.FreezeInfo;
import com.tkx.tian_demo.repository.dev.SellerFreezeCus;
import com.tkx.tian_demo.repository.dev.SellerFreezeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SellerFreezeRepositoryImpl implements SellerFreezeCus{

    @Autowired
    @Qualifier("devMongoTemplate")
    private MongoTemplate devMongoTemplate;

    @Override
    public void createRecord() {
        SellerFreeze sellerFreeze = new SellerFreeze();
        sellerFreeze.setSellerId("123456");
        sellerFreeze.setShopName("你好啊");
        sellerFreeze.setPublicName("你不好啊");
        sellerFreeze.setRole("reseller");
        sellerFreeze.setCreatedAt(new Date());
        sellerFreeze.setUpdatedAt(new Date());

        FreezeInfo freezeInfo = new FreezeInfo();
        freezeInfo.setFreezeStatus(1);
        freezeInfo.setFreezeRemark("冻结");

        sellerFreeze.setFreezeInfo(freezeInfo);
        devMongoTemplate.save(sellerFreeze);

    }
}
