package com.example.demo.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

public class NettySocketClientHandler extends ChannelInboundHandlerAdapter{
	/**
     * 서버로 연결이 만들어지면 channelActive 메소드가 호출 된다. 
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rockstestset !", CharsetUtil.UTF_8));
    }
   
    /**
     * 서버에서 메시지를 수신 하면 channelRead0 메소드가 호출 된다.
     */
    @Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("client received : " + msg);
    }
   
    /**
     * 예외 발생시 exceptionCaught 메소드가 호출된다.
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
