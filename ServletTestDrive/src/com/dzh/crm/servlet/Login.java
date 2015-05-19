/**
 * 验证账号中心V2：AgentServ服务：
2、增加对下游请求、accserv应答数据的格式检查 
——当收到下游查询（userget）、登录（login）请求时，若请求中uname为空或长度为0，则直接返回用户不存在 
——将收到的accserv应答中的uname强制转为小写后，再进行业务处理并返回给下游（realuname） 

3、若当前accserv连接不上，则先将下游连接关闭后，再去尝试连接其他备份accserv地址。若备份accserv地址尝试可用，则将其标记为当前可用accserv 
——防止accserv主地址网络故障时，不断反复重试连接其他其他备份accserv地址，可能导致本机句柄资源耗尽 

4、将userget请求中的uname参数长度增加至64个字节 
—— 支持微信登录（uname=<微信openid(28个字节)>:<微信公众号ID(18个字节)>） 
 */
package com.dzh.crm.servlet;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

//
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;
import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * @author Lizhiqiang
 *
 */
public class Login {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//System.out.println("setup");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//System.out.println("teardown");
	}

/***
 * userget请求:
 * 
 *http://xxx.xxx.xxx.xxx/AccService/AccServlet.do?method=login&uname=x
xxx&upass=xxxx&clientIP=xxxx&clientPort=xxxx&lastMsgID=xxxx&dwComput
erIDLow=xxxx&dwComputerIDHigh=xxxx&dwMachineRand=xxxx&uMarket=xxxx&u
MarketMask=xxxx&passport=xxxx&userpos=xx&clientRealIP=xxxx&GenPasspo
rt=x&exreq=xxxxxx&encoding=xxxx&appid=xx

或者：
http://xxx.xxx.xxx.xxx/AccService/AccServlet.do?method=login&uname=xxxx&upass=xxxx
 * @throws SAXException 
 * @throws IOException 
 */
	@Test
	public void testUserget() throws IOException, SAXException {
		System.out.println("mystest");
		
		WebConversation  	web = new WebConversation(); 
		String urlString = "http://10.15.108.114:9001/AccService/AccServlet.do?method=login&uname=LVTA3850067&upass=335059";
		GetMethodWebRequest get = new GetMethodWebRequest(urlString);
		WebResponse response = web.getResponse(get);  
		System.out.printf("text : %s", response.getText());  
		
		
		//post	
		//PostMethodWebRequest post = new PostMethodWebRequest(url);
        // fail("MYTEST");
	}
	
	

}
