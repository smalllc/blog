package com.smallcc.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
public class Blog implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** 自增 */
    private Integer id;

    /** 博客标题 */
    private String title;

    /** 博客简介/摘要 */
    private String introduction;

    /**  */
    private String keyword;

    /** 封面缩略图等 */
    private String images;

    /** 点击量 */
    private Integer clicknum;

    /** 评论量 */
    private Integer commentnum;

    /** 点赞量 */
    private Integer agreenum;

    /** 1置顶，0普通 */
    private Integer istop;

    /** 博主推荐,1为推荐，0为普通 */
    private Integer isrecommend;

    /**  */
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updatetime;

    /**  */
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date addtime;

    /** -1为草稿，1为正文 ，2为回收站*/
    private Integer status;

    /** 类别 */
   
    private BlogType type;

    /** 博客内容 */
    private String content;

	public Blog(Integer id, String title, String introduction, String keyword,
			String images, Integer clicknum, Integer commentnum,
			Integer agreenum, Integer istop, Integer isrecommend,
			Date updatetime, Date addtime, Integer status, BlogType type,
			String content) {
		super();
		this.id = id;
		this.title = title;
		this.introduction = introduction;
		this.keyword = keyword;
		this.images = images;
		this.clicknum = clicknum;
		this.commentnum = commentnum;
		this.agreenum = agreenum;
		this.istop = istop;
		this.isrecommend = isrecommend;
		this.updatetime = updatetime;
		this.addtime = addtime;
		this.status = status;
		this.type = type;
		this.content = content;
	}

	public Blog() {
		// TODO Auto-generated constructor stub
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.id
     *
     * @return the value of t_blog.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.id
     *
     * @param id the value for t_blog.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.title
     *
     * @return the value of t_blog.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.title
     *
     * @param title the value for t_blog.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.introduction
     *
     * @return the value of t_blog.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.introduction
     *
     * @param introduction the value for t_blog.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.keyword
     *
     * @return the value of t_blog.keyword
     *
     * @mbggenerated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.keyword
     *
     * @param keyword the value for t_blog.keyword
     *
     * @mbggenerated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.images
     *
     * @return the value of t_blog.images
     *
     * @mbggenerated
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.images
     *
     * @param images the value for t_blog.images
     *
     * @mbggenerated
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.clickNum
     *
     * @return the value of t_blog.clickNum
     *
     * @mbggenerated
     */
    public Integer getClicknum() {
        return clicknum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.clickNum
     *
     * @param clicknum the value for t_blog.clickNum
     *
     * @mbggenerated
     */
    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.commentNum
     *
     * @return the value of t_blog.commentNum
     *
     * @mbggenerated
     */
    public Integer getCommentnum() {
        return commentnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.commentNum
     *
     * @param commentnum the value for t_blog.commentNum
     *
     * @mbggenerated
     */
    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.agreeNum
     *
     * @return the value of t_blog.agreeNum
     *
     * @mbggenerated
     */
    public Integer getAgreenum() {
        return agreenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.agreeNum
     *
     * @param agreenum the value for t_blog.agreeNum
     *
     * @mbggenerated
     */
    public void setAgreenum(Integer agreenum) {
        this.agreenum = agreenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.isTop
     *
     * @return the value of t_blog.isTop
     *
     * @mbggenerated
     */
    public Integer getIstop() {
        return istop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.isTop
     *
     * @param istop the value for t_blog.isTop
     *
     * @mbggenerated
     */
    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.isRecommend
     *
     * @return the value of t_blog.isRecommend
     *
     * @mbggenerated
     */
    public Integer getIsrecommend() {
        return isrecommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.isRecommend
     *
     * @param isrecommend the value for t_blog.isRecommend
     *
     * @mbggenerated
     */
    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.updateTime
     *
     * @return the value of t_blog.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.updateTime
     *
     * @param updatetime the value for t_blog.updateTime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.addTime
     *
     * @return the value of t_blog.addTime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.addTime
     *
     * @param addtime the value for t_blog.addTime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.status
     *
     * @return the value of t_blog.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.status
     *
     * @param status the value for t_blog.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
	public BlogType getType() {
		return type;
	}
	
	public void setType(BlogType type) {
		this.type = type;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blog.content
     *
     * @return the value of t_blog.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blog.content
     *
     * @param content the value for t_blog.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", introduction="
				+ introduction + ", keyword=" + keyword + ", images=" + images
				+ ", clicknum=" + clicknum + ", commentnum=" + commentnum
				+ ", agreenum=" + agreenum + ", istop=" + istop
				+ ", isrecommend=" + isrecommend + ", updatetime=" + updatetime
				+ ", addtime=" + addtime + ", status=" + status + ", type=[id="
				+ type.getId() + ",typeName="+type.getTypename()+",content=" + content + "]";
	}

	
       
}