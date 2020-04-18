package com.ruoyi.project.sjbapi.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @ProjectName: trade
 * @Package: com.sijibao.pay.request
 * @ClassName: BaseRequest
 * @Description: java类作用描述
 * @Author: Niki Zheng
 * @CreateDate: 2019/4/10 10:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseRequest implements Serializable {

	private static final long serialVersionUID = 5285824836450228473L;
	public static final String notBlankMsg = "不能为空！";
    /**
     * 平台商户编码。由支付网关统一分配
     */
    private String merchantNo;

    /**
     * 目前只支持：MD5，传值“MD5”
     */
    private String signType;
    /**
     * 签名
     */
    private String sign;

    /**
     * 唯一索引字段
     */
    private String uniqueIndex;

    /**
     * 提交的token
     */
    private String token;

    /**
     * IP地址
     */
    private String IP;

}