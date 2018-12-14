package cn.smallcc.serv.service;

import cn.smallcc.serv.model.Sponsor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Sponsor Service
 * Created by lc on 2017/4/19.
 */
@Service
public interface SponsorService {

  public List<Sponsor> list();

}
