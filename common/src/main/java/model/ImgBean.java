package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 11:59
 * 修改人：wz
 * 修改时间：2019/5/17 11:59
 * 修改备注：    商品图片实体类
 */
public class ImgBean {

    private Integer id;

    private String imgUrl; //图片路径

    private Integer commodityId; //商品表关联字段

    @Override
    public String toString() {
        return "ImgBean{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", commodityId=" + commodityId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }
}
