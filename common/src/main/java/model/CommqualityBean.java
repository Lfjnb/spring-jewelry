package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 11:51
 * 修改人：wz
 * 修改时间：2019/5/17 11:51
 * 修改备注：    商品成色实体类
 */
public class CommqualityBean {
    private Integer id;

    private String commQualityName; //商品成色

    private Integer commQualityId; //商品表关联字段

    @Override
    public String toString() {
        return "CommqualityBean{" +
                "id=" + id +
                ", commQualityName='" + commQualityName + '\'' +
                ", commQualityId=" + commQualityId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommQualityName() {
        return commQualityName;
    }

    public void setCommQualityName(String commQualityName) {
        this.commQualityName = commQualityName;
    }

    public Integer getCommQualityId() {
        return commQualityId;
    }

    public void setCommQualityId(Integer commQualityId) {
        this.commQualityId = commQualityId;
    }
}
