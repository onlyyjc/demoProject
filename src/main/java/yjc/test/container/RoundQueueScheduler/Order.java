package yjc.test.container.RoundQueueScheduler;


import java.util.Date;
import java.util.UUID;

/**
 * 订单时效为5分钟
 * Created by admin on 2017/12/21.
 */
public class Order {

    /**
     * 订单号
     */
    private String id = UUID.randomUUID().toString().replaceAll("-", "");

    private Date createTime = new Date();

    private Date expireTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String toString(){
        return "id：" + id + ";" + " createTime：" + createTime + ";" + " expireTime：" + expireTime;
    }
}
