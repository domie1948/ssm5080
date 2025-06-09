package com.entity.model;

import com.entity.YuangongkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工考勤
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public class YuangongkaoqinModel  implements Serializable {
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
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 考勤类型
	 */
	
	private String kaoqinleixing;
		
	/**
	 * 打卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakashijian;
		
	/**
	 * 考勤状态
	 */
	
	private String kaoqinzhuangtai;
		
	/**
	 * 工作任务
	 */
	
	private String gongzuorenwu;
				
	
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：考勤类型
	 */
	 
	public void setKaoqinleixing(String kaoqinleixing) {
		this.kaoqinleixing = kaoqinleixing;
	}
	
	/**
	 * 获取：考勤类型
	 */
	public String getKaoqinleixing() {
		return kaoqinleixing;
	}
				
	
	/**
	 * 设置：打卡时间
	 */
	 
	public void setDakashijian(Date dakashijian) {
		this.dakashijian = dakashijian;
	}
	
	/**
	 * 获取：打卡时间
	 */
	public Date getDakashijian() {
		return dakashijian;
	}
				
	
	/**
	 * 设置：考勤状态
	 */
	 
	public void setKaoqinzhuangtai(String kaoqinzhuangtai) {
		this.kaoqinzhuangtai = kaoqinzhuangtai;
	}
	
	/**
	 * 获取：考勤状态
	 */
	public String getKaoqinzhuangtai() {
		return kaoqinzhuangtai;
	}
				
	
	/**
	 * 设置：工作任务
	 */
	 
	public void setGongzuorenwu(String gongzuorenwu) {
		this.gongzuorenwu = gongzuorenwu;
	}
	
	/**
	 * 获取：工作任务
	 */
	public String getGongzuorenwu() {
		return gongzuorenwu;
	}
			
}
