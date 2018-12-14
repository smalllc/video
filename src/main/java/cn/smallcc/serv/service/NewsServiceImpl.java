package cn.smallcc.serv.service;

import cn.smallcc.serv.mapper.CategoryItemMapper;
import cn.smallcc.serv.mapper.CategoryMapper;
import cn.smallcc.serv.model.Category;
import cn.smallcc.serv.model.CategoryItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final CategoryMapper categoryMapper;

    private final CategoryItemMapper categoryItemMapper;

    @Override
    public List<CategoryItem> getNewItems(Long userId) {
        return categoryItemMapper.selectNews(userId);
    }

    @Override
    public List<Category> getAllCategories(Long userId) {
        return categoryMapper.selectByUserId(userId);
    }

}
