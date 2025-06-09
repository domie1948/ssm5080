package com.entity.model;

import com.entity.GongzichaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 工资查询
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public class GongzichaxunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 工资月份
	 */
	
	private String gongziyuefen;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 绩效工资
	 */
	
	private Integer jixiaogongzi;
		
	/**
	 * 加班工资
	 */
	
	private Integer jiabangongzi;
		
	/**
	 * 全勤
	 */
	
	private Integer quanqin;
		
	/**
	 * 迟到早退
	 */
	
	private Integer chidaozaotui;
		
	/**
	 * 请假
	 */
	
	private Integer qingjia;
		
	/**
	 * 个税
	 */
	
	private Integer geshui;
		
	/**
	 * 社保代缴
	 */
	
	private Integer shebaodaijiao;
		
	/**
	 * 实发工资
	 */
	
	private String shifagongzi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：工资月份
	 */
	 
	public void setGongziyuefen(String gongziyuefen) {
		this.gongziyuefen = gongziyuefen;
	}
	
	/**
	 * 获取：工资月份
	 */
	public String getGongziyuefen() {
		return gongziyuefen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：绩效工资
	 */
	 
	public void setJixiaogongzi(Integer jixiaogongzi) {
		this.jixiaogongzi = jixiaogongzi;
	}
	
	/**
	 * 获取：绩效工资
	 */
	public Integer getJixiaogongzi() {
		return jixiaogongzi;
	}
				
	
	/**
	 * 设置：加班工资
	 */
	 
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
				
	
	/**
	 * 设置：全勤
	 */
	 
	public void setQuanqin(Integer quanqin) {
		this.quanqin = quanqin;
	}
	
	/**
	 * 获取：全勤
	 */
	public Integer getQuanqin() {
		return quanqin;
	}
				
	
	/**
	 * 设置：迟到早退
	 */
	 
	public void setChidaozaotui(Integer chidaozaotui) {
		this.chidaozaotui = chidaozaotui;
	}
	
	/**
	 * 获取：迟到早退
	 */
	public Integer getChidaozaotui() {
		return chidaozaotui;
	}
				
	
	/**
	 * 设置：请假
	 */
	 
	public void setQingjia(Integer qingjia) {
		this.qingjia = qingjia;
	}
	
	/**
	 * 获取：请假
	 */
	public Integer getQingjia() {
		return qingjia;
	}
				
	
	/**
	 * 设置：个税
	 */
	 
	public void setGeshui(Integer geshui) {
		this.geshui = geshui;
	}
	
	/**
	 * 获取：个税
	 */
	public Integer getGeshui() {
		return geshui;
	}
				
	
	/**
	 * 设置：社保代缴
	 */
	 
	public void setShebaodaijiao(Integer shebaodaijiao) {
		this.shebaodaijiao = shebaodaijiao;
	}
	
	/**
	 * 获取：社保代缴
	 */
	public Integer getShebaodaijiao() {
		return shebaodaijiao;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
