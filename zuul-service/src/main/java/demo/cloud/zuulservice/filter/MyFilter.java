package demo.cloud.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        /**
         * 获取请求uri，如果uri以feign开头则拦截，执行过滤
         */
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestURI = request.getRequestURI();
        if (requestURI.startsWith("/feign/")) {
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        /**
         * 获取请求中是否包含token信息，如果token信息为空，则返回错误信息
         */
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (token == null || token.isEmpty()) {
            //不进行路由
            currentContext.setSendZuulResponse(false);
            //返回的状态码
            currentContext.setResponseStatusCode(400);
            //返回的信息
            currentContext.setResponseBody("token is not empty");
            return null;
        }
        return null;
    }
}
