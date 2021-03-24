package com.example.api;

import com.example.domain.KSS;
import com.example.service.KSSService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

@Controller("kss")
public class KSSController {

    KSSService kssService;

    public KSSController(KSSService kssService) {
        this.kssService = kssService;
    }

    @Get("/")
    public HttpResponse fetchAll() {
        return HttpResponse.ok(kssService.fetchAll());
    }

    @Post("/")
    public HttpResponse saveKSS(@Body KSS kss) {
        return HttpResponse.ok(kssService.saveKSS(kss));
    }

    @Put("/{id}")
    public HttpResponse updateKss(@PathVariable("id") Long id, @Body KSS kss) {
        kss.setId(id);
        return HttpResponse.ok(kssService.updateKSS(kss));
    }

    @Get("/{id}")
    public HttpResponse fetchById(@PathVariable("id") Long id) {
        return HttpResponse.ok(kssService.fetchById(id));
    }

    @Delete("/{id}")
    public HttpResponse deleteById(@PathVariable("id") Long id) {
        kssService.deleteById(id);
        return HttpResponse.ok();
    }

}
