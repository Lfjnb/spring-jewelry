package com.jk.filter;

import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 * 创建人：孙长江
 * 创建时间：2019/5/1617:09
 * 修改人：孙长江
 * 修改时间：2019/5/1617:09
 * 修改备注：
 */
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {
    @Override
    public String filterType() {

        /*
        filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
            pre：路由之前
            routing：路由之时
            post： 路由之后
            error：发送错误调用
         */
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        //过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
        return null;
    }
}
