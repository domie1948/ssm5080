package com.dao;

import com.entity.BumenleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenleixingVO;
import com.entity.view.BumenleixingView;


/**
 * 部门类型
 * 
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface BumenleixingDao extends BaseMapper<BumenleixingEntity> {
	
	List<BumenleixingVO> selectListVO(@Param("ew") Wrapper<BumenleixingEntity> wrapper);
	
	BumenleixingVO selectVO(@Param("ew") Wrapper<BumenleixingEntity> wrapper);
	
	List<BumenleixingView> selectListView(@Param("ew") Wrapper<BumenleixingEntity> wrapper);

	List<BumenleixingView> selectListView(Pagination page,@Param("ew") Wrapper<BumenleixingEntity> wrapper);
	
	BumenleixingView selectView(@Param("ew") Wrapper<BumenleixingEntity> wrapper);
	
}
