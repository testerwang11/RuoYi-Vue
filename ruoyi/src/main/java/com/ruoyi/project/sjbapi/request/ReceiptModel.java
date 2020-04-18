package com.ruoyi.project.sjbapi.request;

import lombok.Data;

import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: v1.1.1
 * @Package: com.sijibao.pay.model
 * @ClassName: ReceiptModel
 * @Description: java类作用描述
 * @Author: Niki Zheng
 * @CreateDate: 2019/5/28 11:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
public class ReceiptModel implements Serializable {
    /**
     * 如果有定义父级目录需要传此字段可以单级目录也可以多级目录（例如： zhangsan , 或者   zhangsan/2019）
     */
    private String parentUrl;

    /**
     * 所有的第三方支付单号放入list中
     */
    List<String> list;

    /**
     * payType 获取电子回单类型： 1交易类，2 ，充值入金类
     */
    @Digits(integer = 2,fraction = 0,message = "交易类型错误！")
    private int payType;
}