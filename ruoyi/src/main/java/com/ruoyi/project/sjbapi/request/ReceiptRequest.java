package com.ruoyi.project.sjbapi.request;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @ProjectName: v1.1.1
 * @Package: com.sijibao.pay.request
 * @ClassName: ReceiptRequest
 * @Description: java类作用描述
 * @Author: Niki Zheng
 * @CreateDate: 2019/5/28 11:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
public class ReceiptRequest extends BaseRequest {

    /**
     * 企业名称+查询时间范围命名 例如：湖北物易通物流有限公司_20181201-20181203
     */
    @NotBlank(message = "文件名称不能为空" + notBlankMsg)
    private String zipName;

    @NotNull(message = "第三方单号" + notBlankMsg)
    @NotEmpty(message = "第三方单号" + notBlankMsg)
    List<ReceiptModel> list;

    @NotBlank(message = "订单号" + notBlankMsg)
    @Size(min = 1, max = 40, message = "长度必须是1-40")
    private String orderNo;


}