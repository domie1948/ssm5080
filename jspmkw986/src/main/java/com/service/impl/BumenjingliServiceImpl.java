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


import com.dao.BumenjingliDao;
import com.entity.BumenjingliEntity;
import com.service.BumenjingliService;
import com.entity.vo.BumenjingliVO;
import com.entity.view.BumenjingliView;

@Service("bumenjingliService")
public class BumenjingliServiceImpl extends ServiceImpl<BumenjingliDao, BumenjingliEntity> implements BumenjingliService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenjingliEntity> page = this.selectPage(
                new Query<BumenjingliEntity>(params).getPage(),
                new EntityWrapper<BumenjingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenjingliEntity> wrapper) {
		  Page<BumenjingliView> page =new Query<BumenjingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BumenjingliVO> selectListVO(Wrapper<BumenjingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenjingliVO selectVO(Wrapper<BumenjingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenjingliView> selectListView(Wrapper<BumenjingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenjingliView selectView(Wrapper<BumenjingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
