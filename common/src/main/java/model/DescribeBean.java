package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 11:55
 * 修改人：wz
 * 修改时间：2019/5/17 11:55
 * 修改备注：    商品描述实体类
 */
public class DescribeBean {

    private Integer id;

    private String describeImg; //商品描述图片

    private Integer describeId; //商品表关联字段

    @Override
    public String toString() {
        return "DescribeBean{" +
                "id=" + id +
                ", describeImg='" + describeImg + '\'' +
                ", describeId=" + describeId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescribeImg() {
        return describeImg;
    }

    public void setDescribeImg(String describeImg) {
        this.describeImg = describeImg;
    }

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }
}
