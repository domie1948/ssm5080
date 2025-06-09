package com.entity.view;

import com.entity.BumenleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 部门类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
@TableName("bumenleixing")
public class BumenleixingView  extends BumenleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BumenleixingView(){
	}
 
 	public BumenleixingView(BumenleixingEntity bumenleixingEntity){
 	try {
			BeanUtils.copyProperties(this, bumenleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
