package com.cydeo.lab08rest.client;


import com.cydeo.lab08rest.dto.CurrencyApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://apilayer.net/api", name = "CURRENCY-CLIENT")
public interface CurrencyClient {

    //http://apilayer.net/api --> baseUrl
// /live --> endpoint
// ?
// access_key=fd3d21fef8a44f2b3bafd87caeee17b6
// &currencies=EUR,TRY
// &source=USD
// &format=1

    @GetMapping("/live")
    CurrencyApiResponse getCurrencyRates(@RequestParam("access_key") String accessKey,
                                         @RequestParam("currencies") String currencies,
                                         @RequestParam("source") String source,
                                         @RequestParam("format") int format);
}




