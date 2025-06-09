package com.entity.view;

import com.entity.BumenjingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 部门经理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
@TableName("bumenjingli")
public class BumenjingliView  extends BumenjingliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BumenjingliView(){
	}
 
 	public BumenjingliView(BumenjingliEntity bumenjingliEntity){
 	try {
			BeanUtils.copyProperties(this, bumenjingliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
