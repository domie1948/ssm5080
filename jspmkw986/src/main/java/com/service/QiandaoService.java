package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaoView;


/**
 * 签到
 *
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface QiandaoService extends IService<QiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaoVO> selectListVO(Wrapper<QiandaoEntity> wrapper);
   	
   	QiandaoVO selectVO(@Param("ew") Wrapper<QiandaoEntity> wrapper);
   	
   	List<QiandaoView> selectListView(Wrapper<QiandaoEntity> wrapper);
   	
   	QiandaoView selectView(@Param("ew") Wrapper<QiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaoEntity> wrapper);
   	
}

