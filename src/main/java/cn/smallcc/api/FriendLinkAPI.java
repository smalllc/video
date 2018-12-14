package cn.smallcc.api;

import cn.smallcc.dto.SimpleResponse;
import cn.smallcc.serv.model.FriendLink;
import cn.smallcc.serv.service.FriendLinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lc on 2017/3/9.
 */
@RestController
@RequestMapping("/friend")
@AllArgsConstructor
public class FriendLinkAPI {

  private final FriendLinkService service;

    /**
     * 申请友情链接，自动识别
     */
  @GetMapping("/join")
  public SimpleResponse join(HttpServletRequest request){
    SimpleResponse response = new SimpleResponse();
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    boolean success = service.insert(name, domain);
    if (success){
      response.setCode(100);
    }else {
      response.setCode(200);
      response.setMessage("申请失败，请按照说明操作哦！");
    }
    return response;
  }

  /**
   * 首页-友情链接列表
   */
  @GetMapping("/list-home")
  public List<FriendLink> homeFriendLink(){
    return service.listHome();
  }

  /**
   *  友情链接页-列表
   */
  @GetMapping("/list")
  public List<FriendLink> friendLinkList(HttpServletRequest request){
    int index = Integer.valueOf(request.getParameter("index"));
    int size = Integer.valueOf(request.getParameter("size"));
    return service.listAll(index, size);
  }

}
