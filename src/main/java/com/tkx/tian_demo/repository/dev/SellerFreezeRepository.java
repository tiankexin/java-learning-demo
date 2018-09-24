package com.tkx.tian_demo.repository.dev;

import com.tkx.tian_demo.models.SellerFreeze;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerFreezeRepository extends MongoRepository<SellerFreeze, ObjectId>, SellerFreezeCus {


}
