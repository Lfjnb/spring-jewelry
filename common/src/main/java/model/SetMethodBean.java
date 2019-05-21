package model;


/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 14:08
 * 修改人：wz
 * 修改时间：2019/5/17 14:08
 * 修改备注： 镶法实体类
 */
public class SetMethodBean {

    private Integer id;

    private String setMethodName; //镶法名称

    private Integer setMethodId; //商品表关联字段

    @Override
    public String toString() {
        return "SetMethodBean{" +
                "id=" + id +
                ", setMethodName='" + setMethodName + '\'' +
                ", setMethodId=" + setMethodId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSetMethodName() {
        return setMethodName;
    }

    public void setSetMethodName(String setMethodName) {
        this.setMethodName = setMethodName;
    }

    public Integer getSetMethodId() {
        return setMethodId;
    }

    public void setSetMethodId(Integer setMethodId) {
        this.setMethodId = setMethodId;
    }
}
