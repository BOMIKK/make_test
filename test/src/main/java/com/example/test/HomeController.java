package com.example.test;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.MemInfoVO;
import com.example.dto.MemberVO;
import com.example.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired
    private MemberService service;


	/**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{
 
        logger.info("home");
        
        List<MemberVO> memberList = service.selectMember();
        
        List<MemberVO> memberList2 = service.getList();
        
        //System.out.println("memberList22222222222"+memberList2);
        
        model.addAttribute("memberList", memberList);
 
        return "home";
    }
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Locale locale, Model model) throws Exception{
 
        logger.info("add");
        
 
        return "add";
    }
    
    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String regist(MemberVO memberVo,Locale locale, Model model) throws Exception{
 
        logger.info("regist");
        
        service.regist(memberVo); // 글작성 서비스 호출
        
        System.out.println("글작성"+memberVo.toString());
	    return "redirect:/"; // 작성이 완료된 후, 목록페이지로 리턴
    }
    
    @RequestMapping(value = "/one.do/{id}")
    public String detail(@PathVariable String id, Model model) throws Exception{
 
        logger.info("detail");
        MemberVO vo=service.selectOne(id);
        System.out.println("글보기ID"+id);
        System.out.println("글보기ID"+vo);
        model.addAttribute("detail",vo);
	    return "detail"; // 작성이 완료된 후, 목록페이지로 리턴
    }
    
    @RequestMapping(value = "/one.do/update", method = RequestMethod.GET)
    public String update(MemberVO memberVo,Locale locale, Model model) throws Exception{
 
        logger.info("update");
        
        service.update(memberVo); // 글작성 서비스 호출
        
        System.out.println("글 수정"+memberVo.toString());
	    return "redirect:/"; // 작성이 완료된 후, 목록페이지로 리턴
    }
    
    @RequestMapping(value = "/one.do/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable String id, Model model) throws Exception{
 
        logger.info("delete");
        
        System.out.println("글삭제ID"+id);
        service.delete(id); // 글작성 서비스 호출
        
	    return "redirect:/"; // 작성이 완료된 후, 목록페이지로 리턴
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("searchText") String searchText, Model model) {
      System.out.println("일반 검색!");
      List<MemberVO> searchList = service.search(searchText);
      model.addAttribute("memberList", searchList);
      return "home";
    }
   
   
    @RequestMapping(value = "/selectMemCode", method = RequestMethod.POST)
    public @ResponseBody List<MemInfoVO> selectMemCode(MemInfoVO meminfoVO) {
      List<MemInfoVO> memList = null;
      System.out.println("코드 받아서 가져오기!");
      System.out.println(meminfoVO.getMcode());
      if(meminfoVO.getMcode()!=null) {
    	  memList = service.selectMemCode(meminfoVO);
          //System.out.println("memList"+memList);
    	  if(memList.size()>0) {
        	  for(int i=0; i<memList.size(); i++) {
        		  System.out.println("num"+memList.get(i).getNum());
        	  }
          }
      }
      
      return service.selectMemCode(meminfoVO);
    }
}
