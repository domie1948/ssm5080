package com.dao;

import com.entity.GongzichaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzichaxunVO;
import com.entity.view.GongzichaxunView;


/**
 * 工资查询
 * 
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface GongzichaxunDao extends BaseMapper<GongzichaxunEntity> {
	
	List<GongzichaxunVO> selectListVO(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
	
	GongzichaxunVO selectVO(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
	
	List<GongzichaxunView> selectListView(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);

	List<GongzichaxunView> selectListView(Pagination page,@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
	
	GongzichaxunView selectView(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
	
}
