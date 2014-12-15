 package cn.android.mytaobao.dao.biz;

import java.util.List;

import cn.android.mytaobao.dao.ICategoryService;

import cn.android.mytaobao.model.Category;

public class CategoryManager {
    private ICategoryService dao;
   
    
    public List<Category> getAllCategory() {
	   return dao.getAllCategory();
	}


	public Category getCategoryById(int categoryId) {
		return dao.getCategoryById(categoryId);
	}
}
