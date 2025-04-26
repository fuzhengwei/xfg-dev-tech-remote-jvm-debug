package cn.bugstack.xfg.dev.tech.test;

import cn.bugstack.xfg.dev.tech.trigger.TestApiController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Resource
    private TestApiController testApiController;

    @Test
    public void test() {
        String s = testApiController.groupBuyNotify("11");
    }

}

