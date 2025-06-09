package com.dao;

import com.entity.BumenjingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenjingliVO;
import com.entity.view.BumenjingliView;


/**
 * 部门经理
 * 
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface BumenjingliDao extends BaseMapper<BumenjingliEntity> {
	
	List<BumenjingliVO> selectListVO(@Param("ew") Wrapper<BumenjingliEntity> wrapper);
	
	BumenjingliVO selectVO(@Param("ew") Wrapper<BumenjingliEntity> wrapper);
	
	List<BumenjingliView> selectListView(@Param("ew") Wrapper<BumenjingliEntity> wrapper);

	List<BumenjingliView> selectListView(Pagination page,@Param("ew") Wrapper<BumenjingliEntity> wrapper);
	
	BumenjingliView selectView(@Param("ew") Wrapper<BumenjingliEntity> wrapper);
	
}
