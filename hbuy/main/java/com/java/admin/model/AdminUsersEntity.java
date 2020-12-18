package com.java.admin.model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    AdminUsers实体类
 * @date 2019-09-18 15:17:59
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class AdminUsersEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //主键
	  private Long id;
      //用户名
	  private String username;
      //密码
	  private String pwd;
      //1超级管理员，0普通管理员
	  private String isroot;
      //账号最新变动时间
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date updatetime;
      //用户头像
	  private String userheader;
      //是否显示（1显示0隐藏）
	  private String isdisplay;

	  /**
	   * 设置：主键
	   */
	  public void setId(Long id) {
		  this.id = id;
	  }
	  /**
	   * 获取：主键
	   */
	  public Long getId() {
	   	  return id;
	  }
	  /**
	   * 设置：用户名
	   */
	  public void setUsername(String username) {
		  this.username = username;
	  }
	  /**
	   * 获取：用户名
	   */
	  public String getUsername() {
	   	  return username;
	  }
	  /**
	   * 设置：密码
	   */
	  public void setPwd(String pwd) {
		  this.pwd = pwd;
	  }
	  /**
	   * 获取：密码
	   */
	  public String getPwd() {
	   	  return pwd;
	  }
	  /**
	   * 设置：1超级管理员，0普通管理员
	   */
	  public void setIsroot(String isroot) {
		  this.isroot = isroot;
	  }
	  /**
	   * 获取：1超级管理员，0普通管理员
	   */
	  public String getIsroot() {
	   	  return isroot;
	  }
	  /**
	   * 设置：账号最新变动时间
	   */
	  public void setUpdatetime(Date updatetime) {
		  this.updatetime = updatetime;
	  }
	  /**
	   * 获取：账号最新变动时间
	   */
	  public Date getUpdatetime() {
	   	  return updatetime;
	  }
	  /**
	   * 设置：用户头像
	   */
	  public void setUserheader(String userheader) {
		  this.userheader = userheader;
	  }
	  /**
	   * 获取：用户头像
	   */
	  public String getUserheader() {
	   	  return userheader;
	  }
	  /**
	   * 设置：是否显示（1显示0隐藏）
	   */
	  public void setIsdisplay(String isdisplay) {
		  this.isdisplay = isdisplay;
	  }
	  /**
	   * 获取：是否显示（1显示0隐藏）
	   */
	  public String getIsdisplay() {
	   	  return isdisplay;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
