package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 14:11
 * 修改人：wz
 * 修改时间：2019/5/17 14:11
 * 修改备注：    商品材质实体类
 */
public class TextureBean {

    private Integer id;

    private String textureName; //材质名称

    private Integer textureId; //商品关联表

    @Override
    public String toString() {
        return "TextureBean{" +
                "id=" + id +
                ", textureName='" + textureName + '\'' +
                ", textureId=" + textureId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName;
    }

    public Integer getTextureId() {
        return textureId;
    }

    public void setTextureId(Integer textureId) {
        this.textureId = textureId;
    }
}
