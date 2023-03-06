package ltd.newbee.mall.entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.Date;

@Data
public class Product {
    private Long id;
    //5种产品–手机、电脑、平板电脑、电池组和桌面
    private Integer type;
    //上述5种产品分别由3家供应商销售——华硕、LG、三星
    private String supplier;
    //仅交付至新加坡和吉隆坡
    private String deliveryPlace;
    //库存
    private Long stock;
    //价格 分
    private Long price;
    private String name;
    private String url;
    private String picture;
    private Long sort;
    private Date gmtCreate;
    private Date mendTime;





}
