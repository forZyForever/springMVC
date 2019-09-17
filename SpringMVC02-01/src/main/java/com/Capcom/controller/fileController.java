package com.Capcom.controller;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/file")
public class fileController {
    /**  需导入依赖
     * javaWeb中的组件进行上传
     * 在Controller中:
     * 创建一个目录，用于存放上传的文件
     * 获取客户端上传的文件
     * 将客户端上传的文件输出到我们创建的目录中
     */
    @RequestMapping("/upload01")
    public String demo(HttpServletRequest request) throws Exception {
        //创建目录用于存放上传文件
        //servlet获取资源文件的真实路径
        String path = request.getSession().getServletContext().getRealPath("images");
        //通过路径创建一个file
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //获取客户端上传的文件
        //创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建一个文件上传项
        ServletFileUpload upload = new ServletFileUpload(factory);
        //使用文件上传项,解析请求request,获取文件项请求集合
        List<FileItem> fileItems = upload.parseRequest(request);
        //遍历出每一个文件项
        for (FileItem fileItem : fileItems) {
            //判断文件是否是上传的文件,而不是普通的表达数据
            if (!fileItem.isFormField()){
                //获取文件名字
                String name = fileItem.getName();
                //将上传文件写入到创建的文件夹
                fileItem.write(new File(file,name));
            }
        }
        return "success";
    }
    /**springMvc的方式进行上传,
     * 需导入文件上传的依赖
     * 需配置文件解析器
     * 创建一个目录;来存放文件
     * 获取文件
     * 将文件输送到目录
     * */
    @RequestMapping("upload02")
    //MultipartFile的参数名必须和表单提交时的name保持一致
    public String demo01(HttpServletRequest request, MultipartFile upload) throws Exception {
        //通过域对象获取资源文件
        String path = request.getSession().getServletContext().getRealPath("images");
        //通过路径创建一个目录
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        //2.获取文件名
        String filename = upload.getOriginalFilename();
        upload.transferTo(new File(file,filename));
        return "success";
    }
    /**跨服务器进行上传
     * tomcat里的readonly改为false
     * 在要传输到的服务器建立文件夹并且里面必须有默认文件
     * 两个服务器的端口号不能保持一致
     * 需引入跨服务器传输的依赖
     * */
    @RequestMapping("upload03")
    public String Demo02(MultipartFile upload) throws IOException {
        //获取要存储图片的资源路径
        String path="http://localhost:8086/images";
        //获取文件名
        String filename = upload.getOriginalFilename();
        //创建客户端
        Client client = Client.create();
       //连接远程服务器
        WebResource resource = client.resource(path+filename);
        //将文件输送到远程服务器
        resource.put(upload.getBytes());
        return "success";
    }
}
