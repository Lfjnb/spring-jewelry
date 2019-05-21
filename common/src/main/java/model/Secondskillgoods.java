package model;
/*活动商品表*/
public class Secondskillgoods {

    private Integer skgId;
    private Integer commodity;
    private String skgDownThePrice;
    private Integer skgCount;
    private  Integer skaid;

    public Integer getSkgId() {
        return skgId;
    }

    public void setSkgId(Integer skgId) {
        this.skgId = skgId;
    }

    public Integer getCommodity() {
        return commodity;
    }

    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
    }

    public String getSkgDownThePrice() {
        return skgDownThePrice;
    }

    public void setSkgDownThePrice(String skgDownThePrice) {
        this.skgDownThePrice = skgDownThePrice;
    }

    public Integer getSkgCount() {
        return skgCount;
    }

    public void setSkgCount(Integer skgCount) {
        this.skgCount = skgCount;
    }

    public Integer getSkaid() {
        return skaid;
    }

    public void setSkaid(Integer skaid) {
        this.skaid = skaid;
    }
}
