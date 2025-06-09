package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiandaoDao;
import com.entity.QiandaoEntity;
import com.service.QiandaoService;
import com.entity.vo.QiandaoVO;
import com.entity.view.QiandaoView;

@Service("qiandaoService")
public class QiandaoServiceImpl extends ServiceImpl<QiandaoDao, QiandaoEntity> implements QiandaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiandaoEntity> page = this.selectPage(
                new Query<QiandaoEntity>(params).getPage(),
                new EntityWrapper<QiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiandaoEntity> wrapper) {
		  Page<QiandaoView> page =new Query<QiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiandaoVO> selectListVO(Wrapper<QiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiandaoVO selectVO(Wrapper<QiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiandaoView> selectListView(Wrapper<QiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiandaoView selectView(Wrapper<QiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
