package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 11:57
 * 修改人：wz
 * 修改时间：2019/5/17 11:57
 * 修改备注：    商品打磨方式实体类
 */
public class GrindingwarBean {

    private Integer id;

    private String grindingWayName; //打磨方式

    private Integer grindingWayId; //商品表关联字段

    @Override
    public String toString() {
        return "GrindingwarBean{" +
                "id=" + id +
                ", grindingWayName='" + grindingWayName + '\'' +
                ", grindingWayId=" + grindingWayId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrindingWayName() {
        return grindingWayName;
    }

    public void setGrindingWayName(String grindingWayName) {
        this.grindingWayName = grindingWayName;
    }

    public Integer getGrindingWayId() {
        return grindingWayId;
    }

    public void setGrindingWayId(Integer grindingWayId) {
        this.grindingWayId = grindingWayId;
    }
}
