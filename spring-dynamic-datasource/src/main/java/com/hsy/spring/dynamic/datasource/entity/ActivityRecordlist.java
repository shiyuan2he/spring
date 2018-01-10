package com.hsy.spring.dynamic.datasource.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CreateDate:2017年11月13日下午12:45:10 
 * @Description: 中奖流水 
 * @author:wangyj
 * @version V1.0
 */
public class ActivityRecordlist implements Serializable{

	private static final long serialVersionUID = -4458533807327443344L;
	private SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
	private int id;
	/**
	 * 中奖客户编号
	 */
	private String userId;
	/**
	 * 奖池编号
	 */
	private int  awardid;
	/**
	 * 奖项等级：1-一等奖，2-二等奖，3-三等奖，4-四等奖，5-五等奖
	 */
	private String award;
	/**
	 * 创建时间
	 */
	private Date createtime;
	/**
	 * 客户手机号
	 */
	private String telphone;
	/**
	 * 抽奖活动的期数
	 */
	private String periods;
	
	public String getPeriods() {
		return periods;
	}

	public void setPeriods(String periods) {
		this.periods = periods;
	}

	public String getTelphone() {
		return (telphone==null||"".equals(telphone))?"":telphone.replace(telphone.substring(3,7),"xxxx");
	}
	
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the awardid
	 */
	public int getAwardid() {
		return awardid;
	}
	/**
	 * @param awardid the awardid to set
	 */
	public void setAwardid(int awardid) {
		this.awardid = awardid;
	}
	/**
	 * @return the award
	 */
	public String getAward() {
		return award;
	}
	/**
	 * @param award the award to set
	 */
	public void setAward(String award) {
		this.award = award;
	}
	/**
	 * @return the createtime
	 */
	public String getCreatetime() {
		return df.format(createtime);
	}
	/**
	 * @param createtime the createtime to set
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "ActivityRecordlist [id=" + id + ", userId=" + userId + ", awardid=" + awardid
				+ ", award=" + award + ", createtime=" + getCreatetime() + ", telphone=" + telphone + ", periods=" + periods
				+ "]";
	}
}
