package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenleixingView;


/**
 * 部门类型
 *
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface BumenleixingService extends IService<BumenleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenleixingVO> selectListVO(Wrapper<BumenleixingEntity> wrapper);
   	
   	BumenleixingVO selectVO(@Param("ew") Wrapper<BumenleixingEntity> wrapper);
   	
   	List<BumenleixingView> selectListView(Wrapper<BumenleixingEntity> wrapper);
   	
   	BumenleixingView selectView(@Param("ew") Wrapper<BumenleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenleixingEntity> wrapper);
   	
}

