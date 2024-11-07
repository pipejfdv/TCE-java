package com.FunnyMind.SpringFunyMind.Services;

import com.FunnyMind.SpringFunyMind.ApiTerapeutaNews.ApiMediastack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FunnyMind.SpringFunyMind.Entitys.ApiResponseNews;

import java.util.List;

@Service
public class ServicesApi {
    @Autowired
    private ApiMediastack apiMediastack;

    public List<ApiResponseNews> getObjetoApiResponseNews() {
        return apiMediastack.apiMediastackNoticias();
    }

}
