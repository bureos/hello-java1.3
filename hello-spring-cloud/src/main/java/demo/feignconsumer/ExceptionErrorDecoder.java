package demo.feignconsumer;

import java.util.Map;

import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import demo.exception.MyException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

@Configuration
public class ExceptionErrorDecoder implements ErrorDecoder {
	    private static final Logger log = LoggerFactory.getLogger(ExceptionErrorDecoder.class);
        ObjectMapper objectMapper = new ObjectMapper();

        @Override
        public Exception decode(String s, Response response) {

                try {
                        if (response.body() != null) {
                                String targetMsg = null;
                                String body = Util.toString(response.body().asReader());
                                log.error("body:"+body);
                                Map<String,String>map= objectMapper.readValue(body, Map.class);
                                log.error("map->{}", map);
                                // ExceptionInfo ei = this.objectMapper.readValue(body.getBytes("UTF-8"), ExceptionInfo.class);
                                String exceptionClassName=map.get("exception");
                                String message=map.get("message");
                                String errCode=message.split(":")[0];
                                String errMsg=message.substring(errCode.length());
                                return new MyException(errCode, errMsg);
//                                Class clazz = Class.forName(ei.getException());
//                                Object obj = clazz.newInstance();
//                                String message = ei.getMessage();
//                                if (obj instanceof BusinessException) {
//                                        targetMsg = message.substring(message.indexOf("{"), message.indexOf("}") + 1);
//                                        BusinessException businessException = JsonUtil.toObj(targetMsg, BusinessException.class);
//                                        return businessException;
//                                }else{
//                                        targetMsg=message.substring(message.indexOf(":"),message.length());
//                                        return new InternalException(targetMsg);
//                                }

                        }
                } catch (Exception var4) {
                        log.error("var4:"+var4.getMessage());
                        return new RuntimeException(var4.getMessage());
                }
                return new RuntimeException("系统异常,请联系管理员");
        }

}