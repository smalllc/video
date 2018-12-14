package cn.smallcc.serv.service;

import cn.smallcc.serv.mapper.SponsorMapper;
import cn.smallcc.serv.model.Sponsor;
import cn.smallcc.serv.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Sponsor Service
 * Created by lc on 2017/4/19.
 */
@Service
@AllArgsConstructor
public class SponsorServiceImpl implements SponsorService{

  private final SponsorMapper mapper;

  @Override
  public List<Sponsor> list() {
    return mapper.list();
  }

}
