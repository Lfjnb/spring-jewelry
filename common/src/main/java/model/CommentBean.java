package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 11:46
 * 修改人：wz
 * 修改时间：2019/5/17 11:46
 * 修改备注：    商品评论实体类
 */
public class CommentBean {
    private Integer id;

    private String commentContent; //商品评论

    private String xing; //星

    private Integer userId; //对应的用户id

    private String userName; //对应的用户

    private String commentTime; //评论时间

    private String goodReputation; //好评度

    private Integer commentId; //商品表关联字段

    @Override
    public String toString() {
        return "CommentBean{" +
                "id=" + id +
                ", commentContent='" + commentContent + '\'' +
                ", xing='" + xing + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", goodReputation='" + goodReputation + '\'' +
                ", commentId=" + commentId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getGoodReputation() {
        return goodReputation;
    }

    public void setGoodReputation(String goodReputation) {
        this.goodReputation = goodReputation;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}
