package com.crfsdi.ic.sd.vehicleManager.util;

import com.crfsdi.ic.sd.vehicleManager.domain.LoadPcdByRq;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

public class Util {
    private static final Logger LOG = LoggerFactory.getLogger(Util.class);
    public static final String NOTE = "1.派车人应准确驾握驾驶员健康状况和精神状态,如遇有疾病和精神状态差,不得安排行车:\n" +
            "2.驾驶员提前10分钟到达指定地点;\n" +
            "3.驾驶员应牢固树立安全第一思想,严格遵守交通法规,确保交通安全;\n" +
            "4.驾驶员应努力端正服务态度,提高服务意识,优质安全完成交通服务任务。\n";

    /**
     *
     * @param pcdh   派车单号
     */
    public static void sendSms(String pcdh, String BDDD, String YCR, String YCRDH, JdbcTemplate jdbcTemplate){
        String sql = "select * from pcd where pcdh='"+ pcdh +"'";
        List<LoadPcdByRq> result  = jdbcTemplate.query(sql, new LoadPcdByRq());
        if (result.size() > 0) {
            LoadPcdByRq loadPcdByRq = result.get(0);
            String message = new StringBuilder(loadPcdByRq.PCRXM)
                    .append("派车：")
                    .append(loadPcdByRq.BDSJ ).append(',')
                    .append(loadPcdByRq).append(',')
                    .append(BDDD).append(',')
                    .append(YCR).append(',')
                    .append(YCRDH).append(',')
                    .append(loadPcdByRq.CH).append(',')
                    .append(loadPcdByRq.CARSJXM).toString();
            sendDispatchVehicleSms(loadPcdByRq.CARSJID,message);
            //胡立方、李志德
            sendDispatchVehicleSms("002967",message);
            sendDispatchVehicleSms("001469",message);
        }else {
            LOG.info("未查询到单号");
        }
    }

    private static void sendDispatchVehicleSms(String staffId, String message) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://192.10.27.101/SendSMSService.asmx");

        ContentType contentType = ContentType.create("text/xml", Charset.forName("UTF-8"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "<soap:Body>\n" +
                "<SendSms xmlns=\"http://tempuri.org/\">\n" +
                "<ryid>")
                .append(staffId)
                .append("</ryid>\n" +
                        "<xtdm>06</xtdm>\n" +
                        "<smsContent>")
                .append(message)
                .append("</smsContent>\n" +
                        "</SendSms>\n" +
                        "</soap:Body>\n" +
                        "</soap:Envelope>");

        HttpEntity httpEntity = new StringEntity(stringBuilder.toString(), contentType);
        httpPost.setHeader("SOAPAction","http://tempuri.org/SendSms");
        httpPost.setEntity(httpEntity);
        try {
            CloseableHttpResponse response = httpClient.execute(httpPost);
            LOG.info("StatusLine==========:" + response.getStatusLine());
            LOG.info("Entity==========:" + response.getEntity());

        } catch (IOException e) {
            LOG.info(e.toString());
            e.printStackTrace();
        }
    }
}
