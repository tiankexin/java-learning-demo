package com.tkx.tian_demo.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "seller_freeze")
@Data
public class SellerFreeze {

    @Id
    private ObjectId id;

    @Field("seller_id")
    private String sellerId;

    @Field("shopname")
    private String shopName;

    @Field("public_name")
    private String publicName;

    @Field("role")
    private String role;

    @Field("freeze_info")
    private FreezeInfo freezeInfo;

    @Field("created_at")
    private Date createdAt;

    @Field("updated_at")
    private Date updatedAt;

}
