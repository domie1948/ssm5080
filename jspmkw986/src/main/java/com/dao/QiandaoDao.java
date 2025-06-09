package com.dao;

import com.entity.QiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaoVO;
import com.entity.view.QiandaoView;


/**
 * 签到
 * 
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface QiandaoDao extends BaseMapper<QiandaoEntity> {
	
	List<QiandaoVO> selectListVO(@Param("ew") Wrapper<QiandaoEntity> wrapper);
	
	QiandaoVO selectVO(@Param("ew") Wrapper<QiandaoEntity> wrapper);
	
	List<QiandaoView> selectListView(@Param("ew") Wrapper<QiandaoEntity> wrapper);

	List<QiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaoEntity> wrapper);
	
	QiandaoView selectView(@Param("ew") Wrapper<QiandaoEntity> wrapper);
	
}
