package com.lamu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lamu.dao.ProductionKindsMapper;
import com.lamu.dao.ProductionMapper;
import com.lamu.dao.ProductionMapperExt;
import com.lamu.dao.ProductionPicMapper;
import com.lamu.entity.*;
import com.lamu.model.ProductionKindsModel;
import com.lamu.model.ProductionModel;
import com.lamu.model.ProductionPicModel;
import com.lamu.service.LamuService;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by songliang on 2016/1/12.
 *
 * @author songliang
 */
@Service("lamuService")
public class LamuServiceImpl implements LamuService {
    private static final Logger LOGGER = Logger.getLogger(LamuServiceImpl.class);
    @Autowired
    private ProductionMapper productionMapper;
    @Autowired
    private ProductionMapperExt productionMapperExt;
    @Autowired
    private ProductionPicMapper productionPicMapper;
    @Autowired
    private ProductionKindsMapper productionKindsMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertProduction(ProductionModel production, ProductionPicModel productionPicModel) {
        ProductionPic productionPic = new ProductionPic();
        BeanUtils.copyProperties(productionPicModel, productionPic);
        productionPicMapper.insertSelective(productionPic);

        Production production1 = new Production();
        BeanUtils.copyProperties(production, production1);
        productionMapper.insertSelective(production1);
    }

    public PageInfo<ProductionModel> getAllLamusByCondition(String name, Date date, Integer curPage, Integer pageSize) {
        PageHelper.startPage(curPage, pageSize);
        ProductionExample example = new ProductionExample();
        example.or().andNameLike(name);
        List<Production> productions = productionMapper.selectByExample(example);
        ArrayList<ProductionModel> models = new ArrayList<>();
        for (Production production : productions) {
            ProductionModel model = new ProductionModel();
            BeanUtils.copyProperties(production, model);
            models.add(model);
        }
        PageInfo<ProductionModel> page = new PageInfo<>(models);
        return page;
    }
    public ProductionModel select(String id) {
        Production production = productionMapper.selectByPrimaryKey(id);
        ProductionModel model = new ProductionModel();
        BeanUtils.copyProperties(production, model);
        return model;
    }

    public List<ProductionPicModel> selectPic(String id) {
        ProductionPicExample example = new ProductionPicExample();
        example.setOrderByClause("sort asc");
        example.createCriteria().andProductionIdEqualTo(id);
        List<ProductionPic> productionPics = productionPicMapper.selectByExample(example);
        List<ProductionPicModel> models = new ArrayList<>();
        for (ProductionPic productionPic : productionPics) {
            ProductionPicModel model = new ProductionPicModel();
            BeanUtils.copyProperties(productionPic, model);
            models.add(model);

        }
        return models;
    }

    public void updatePic(ProductionPicModel model) {
        ProductionPic productionPic = new ProductionPic();
        BeanUtils.copyProperties(model, productionPic);

        productionPicMapper.updateByPrimaryKeySelective(productionPic);
    }

    public Integer update(ProductionModel lamu) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andUuidEqualTo(lamu.getUuid());
        Production production = new Production();
        BeanUtils.copyProperties(lamu, production);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;

    }

    public Integer countRecommand() {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andRecommandEqualTo(1);
        List<Production> productions = productionMapper.selectByExample(example);
        return productions.size();
    }

    public Integer addRecommand(String id) {
        Production production = new Production();
        production.setRecommand(1);
        ProductionExample example = new ProductionExample();
        example.createCriteria().andUuidEqualTo(id);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;
    }

    public Integer removeRecommand(String id) {
        Production production = new Production();
        production.setRecommand(0);
        ProductionExample example = new ProductionExample();
        example.createCriteria().andUuidEqualTo(id);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Integer delete(String id) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andUuidEqualTo(id);
        int delete = productionMapper.deleteByExample(example);
        ProductionPicExample picExample = new ProductionPicExample();
        picExample.createCriteria().andProductionIdEqualTo(id);
        int picDelete = productionPicMapper.deleteByExample(picExample);
        if (delete == 1 && picDelete == 9) {
            return 1;
        } else {
            return 0;
        }


    }

    public Map<ProductionModel, ProductionPicModel> getFrontLamuEight() {
        Map<ProductionModel, ProductionPicModel> productionPicMap = new HashMap<ProductionModel, ProductionPicModel>();
        ProductionExample example = new ProductionExample();
        example.createCriteria().andRecommandEqualTo(1);
        List<Production> productions = productionMapper.selectByExample(example);
        for (Production production : productions) {
            ProductionPicExample picExample = new ProductionPicExample();
            picExample.createCriteria().andProductionIdEqualTo(production.getUuid()).andSortEqualTo(0);
            List<ProductionPic> pics = productionPicMapper.selectByExample(picExample);
            ProductionModel productionModel = new ProductionModel();
            BeanUtils.copyProperties(production, productionModel);
            ProductionPicModel productionPicModel = new ProductionPicModel();
            BeanUtils.copyProperties(pics.get(0), productionPicModel);
            productionPicMap.put(productionModel, productionPicModel);
        }
        return productionPicMap;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<ProductionKindsModel> getKinds() {
        List<ProductionKinds> productionKindss = productionKindsMapper.selectByExample(null);
        List<ProductionKindsModel> models = new ArrayList<>();
        for (ProductionKinds productionKinds : productionKindss) {
            ProductionKindsModel model = new ProductionKindsModel();
            BeanUtils.copyProperties(productionKinds, model);
            models.add(model);
        }
        return models;
    }


}
