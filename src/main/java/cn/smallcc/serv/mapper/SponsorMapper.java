package cn.smallcc.serv.mapper;

import cn.smallcc.serv.model.Sponsor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Sponsor Mapper
 * Created by lc on 2017/4/19.
 */
@Mapper
public interface SponsorMapper {

  @Select("SELECT * FROM sponsor ORDER BY id DESC")
  List<Sponsor> list();

}
