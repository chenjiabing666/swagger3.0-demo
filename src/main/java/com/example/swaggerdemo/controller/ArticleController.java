package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.domain.ArticleDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@RequestMapping("/article")
@Api(value = "文章接口")
public class ArticleController {

    @PostMapping("/add")
    @ApiOperation("添加文章")
    public String add(ArticleDTO dto, HttpServletRequest request){
        Enumeration<String> headers = request.getHeaderNames();
        return "success";
    }
}
