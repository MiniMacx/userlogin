package org.userlogin.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.fileupload.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.userlogin.dao.LoginDao;
import org.userlogin.dao.RegDao;
import org.userlogin.entity.User;
import org.userlogin.service.UserloginService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by airmacx on 17-3-21.
 */

@Controller
@RequestMapping("/userlogin")
public class UserController {
    @Autowired
    private UserloginService userloginService;

    @Autowired
    private RegDao regDao;

    @Autowired
    private LoginDao loginDao;

    Map<String,User> map=new HashMap<String, User>();

    /**
     * 显示登录视图页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "loginPage";
    }

    /**
     * 登录检查
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/logining",method = RequestMethod.POST)
    public String login(String username,String password, Model model){
        boolean b=userloginService.checkLogin(username,password);
        if(b==true){
            //跳转至欢迎页面
            User u=new User(username,password);
            model.addAttribute("user",u);
            map.put("user",u);
            return "welcome";
        }else {
            return "loginPage";
        }

    }

    /**
     * 返回注册页面
     * @return
     */
    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String reg() {
        return "regPage";
    }

    /**
     * 注册检查
     * @param u
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/regging",method = RequestMethod.POST)
    public String reg(User u,Model model) throws Exception{
        boolean b=userloginService.checkReg(u.getUsername());
        if(b){
            model.addAttribute("user",u);
            regDao.userReg(u.getUsername(),u.getPassword());
            return "success";
        }
       return "regPage";
    }

    /**
     * 文件上传逻辑
     * @param file
     * @return
     */


    @RequestMapping(value = "/uploading",method = RequestMethod.POST)
    public String upload(User u,Model model,@RequestParam("file") MultipartFile file){

        System.out.println(file.getName()+file.getContentType()+file.getOriginalFilename());
        try {
            if (!file.isEmpty()) {
                System.out.println("sssss");
                Streams.copy(file.getInputStream(), new FileOutputStream("/home/airmacx/文档/" + file.getOriginalFilename()),
                        true);
                model.addAttribute("user",u);
            }
        }
                 catch (IOException e) {
                    System.out.println("failed=.=");
                    e.printStackTrace();
                }
            return "upload";
        }


    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String returnWelcomePage(Model model){
        User u=map.get("user");
        System.out.println(u.toString()+"sssssss");
        model.addAttribute("user",u);
        return "welcome";
    }
}
