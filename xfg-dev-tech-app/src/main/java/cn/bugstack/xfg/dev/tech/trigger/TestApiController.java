package cn.bugstack.xfg.dev.tech.trigger;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@CrossOrigin("*")
@RequestMapping("/api/v1/test/")
public class TestApiController {

    /**
     * curl --request POST \
     *   --url 'http://127.0.01:8091/xfg/api/v1/test/group_buy_notify?requestDTO=1111'
     *
     * 注意，yml 里配置了应用根目录；server.servlet.context-path: /xfg
     */
    @RequestMapping(value = "group_buy_notify", method = RequestMethod.POST)
    public String groupBuyNotify(@RequestParam String requestDTO) {
        log.info("请求参数 {}", JSON.toJSONString(requestDTO));

        return "success";
    }

}
