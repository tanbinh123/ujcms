package com.ujcms.core.domain.base;

import java.time.OffsetDateTime;
import org.springframework.lang.Nullable;

/**
 * This class was generated by MyBatis Generator.
 *
 * @author MyBatis Generator
 */
public class ArticleBase {
    /**
     * 数据库表名
     */
    public static final String TABLE_NAME = "article";

    /**
     * 文章ID
     */
    private int id = 0;

    /**
     * 站点ID
     */
    private int siteId = 0;

    /**
     * 组织ID
     */
    private int orgId = 0;

    /**
     * 栏目ID
     */
    private int channelId = 0;

    /**
     * 创建用户ID
     */
    private int userId = 0;

    /**
     * 修改用户ID
     */
    @Nullable
    private Integer modifiedUserId;

    /**
     * 发布日期
     */
    private OffsetDateTime publishDate = OffsetDateTime.now();

    /**
     * 是否有图片
     */
    private boolean withImage = false;

    /**
     * 置顶
     */
    private short sticky = 0;

    /**
     * 状态(0:正常)
     */
    private short status = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Nullable
    public Integer getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(@Nullable Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public OffsetDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(OffsetDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isWithImage() {
        return withImage;
    }

    public void setWithImage(boolean withImage) {
        this.withImage = withImage;
    }

    public short getSticky() {
        return sticky;
    }

    public void setSticky(short sticky) {
        this.sticky = sticky;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }
}