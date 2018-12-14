package cn.smallcc.serv.service;

import cn.smallcc.serv.model.Category;
import cn.smallcc.serv.model.CategoryItem;

import java.util.List;

public interface NewsService {

    List<CategoryItem> getNewItems(Long userId);

    List<Category> getAllCategories(Long userId);

}
