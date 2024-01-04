package io.github.devopsws.demo.service;

import com.google.protobuf.TextFormat;
import com.tencent.trpc.core.logger.Logger;
import com.tencent.trpc.core.logger.LoggerFactory;
import com.tencent.trpc.core.rpc.RpcContext;
import io.github.devopsws.trpc.demo.proto.GreeterServiceAPI;
import io.github.devopsws.trpc.demo.proto.HelloRequestProtocol;
import org.springframework.stereotype.Service;

@Service
public class TRPCService implements GreeterServiceAPI {

    private static final Logger logger = LoggerFactory.getLogger(TRPCService.class);

    @Override
    public HelloRequestProtocol.HelloResponse sayHello(RpcContext context, HelloRequestProtocol.HelloRequest request) {
        logger.error(">>>[server]receive msg:{}", TextFormat.shortDebugString(request));
        String message = request.getMessage();
        HelloRequestProtocol.HelloResponse.Builder rspBuilder = HelloRequestProtocol.HelloResponse.newBuilder();
        rspBuilder.setMessage("Hello " + message);
        logger.error(">>>[server]return msg:{}", TextFormat.shortDebugString(rspBuilder));
        return rspBuilder.build();
    }

}