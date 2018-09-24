package com.tkx.tian_demo.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
public class FreezeInfo{

    @Field("freeze_status")
    private int freezeStatus;

    @Field("freeze_remark")
    private String freezeRemark;

    @Field("is_expire")
    private Boolean isExpire;

    @Field("expire_time")
    private Date expireTime;

    @Field("detail_sn")
    private List<String> detailSn;


}
