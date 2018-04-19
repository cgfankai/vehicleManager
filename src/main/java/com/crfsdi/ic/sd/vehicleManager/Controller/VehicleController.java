package com.crfsdi.ic.sd.vehicleManager.Controller;

import com.crfsdi.ic.sd.vehicleManager.domain.*;
import com.crfsdi.ic.sd.vehicleManager.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/vehicle/api")
public class VehicleController {
    private static final Logger LOG = LoggerFactory.getLogger(VehicleController.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 	派车单列表读取
     *
     * @param args_1
     * @param args_2
     * @return
     */
    @RequestMapping("/procLoadPcdByRq")
    public List<LoadPcdByRq> procLoadPcdByRq(@RequestParam(value = "args_1") String args_1, @RequestParam(value = "args_2") Integer args_2) {
        String sql = "exec procLoadPcdByRq '" + args_1 + "'," + args_2;
        return jdbcTemplate.query(sql, new LoadPcdByRq());
    }

    /**
     * 	派车单下任务列表读取
     *
     * @param args_1
     * @return
     */
    @RequestMapping("/procLoadTaskByPcd")
    public List<LoadTaskByPcd> procLoadTaskByPcd(@RequestParam("args_1") String args_1) {
        String sql = "exec procLoadTaskByPcd '" + args_1 + "'";
        return jdbcTemplate.query(sql, new LoadTaskByPcd());
    }

    /**
     * 	获得一个新派车单编码
     */
    @RequestMapping("/procGetMaxPcdh")
    public String procGetMaxPcdh() {
        String sql = "declare @strPcdh  varchar(10)\n" +
                "exec procGetMaxPcdh @strPcdh output\n" +
                "select @strPcdh\n";
        final String[] result = {""};
        jdbcTemplate.query(sql, new RowCallbackHandler() {

            @Override
            public void processRow(ResultSet rs) throws SQLException {
                result[0] = rs.getString(1);
                return;
            }
        });
        return result[0];
    }

    /**
     * 	获得车型列表
     *
     * @param
     * @return
     */
    @RequestMapping("/procLoadCx")
    public List<LoadCx> procLoadCx() {
        String sql = "exec procLoadCx ";
        return jdbcTemplate.query(sql, new LoadCx());
    }

    /**
     * 获得车号
     *
     * @param args_1 奥迪
     * @param args_2 0
     * @return
     */
    @RequestMapping("/procLoadChByCx")
    public List<LoadChByCx> procLoadChByCx(@RequestParam("args_1") String args_1, @RequestParam("args_2") String args_2) {
        String sql = "exec procLoadChByCx '" + args_1 + "'," + args_2;
        return jdbcTemplate.query(sql, new LoadChByCx());
    }

    /**
     * 获得用车单位、报到地点、用车人
     *
     * @param args_1
     * @return
     */
    @RequestMapping("/procLoadQSBByJD")
    public List<LoadQSBByJD> procLoadQSBByJD(@RequestParam("args_1") String args_1) {
        String sql = "exec procLoadQSBByJD '" + args_1 + "'";
        return jdbcTemplate.query(sql, new LoadQSBByJD());
    }

    /**
     * 	新增派车单
     *
     * @param loadPcdByRq
     */
    @PostMapping("/procInsertPcd")
    public void procInsertPcd(LoadPcdByRq loadPcdByRq) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exec procInsertPcd '")
                .append(loadPcdByRq.PCDH != null ? loadPcdByRq.PCDH : "").append("','")
                .append(loadPcdByRq.PCDATE != null ? loadPcdByRq.PCDATE : "").append("','")
                .append(loadPcdByRq.CH != null ? loadPcdByRq.CH : "").append("','")
                .append(loadPcdByRq.CX != null ? loadPcdByRq.CX : "").append("','")
                .append(loadPcdByRq.CARSJID != null ? loadPcdByRq.CARSJID : "").append("','")
                .append(loadPcdByRq.CARSJXM != null ? loadPcdByRq.CARSJXM : "").append("','")
                .append(loadPcdByRq.BDSJ != null ? loadPcdByRq.BDSJ : "").append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append(loadPcdByRq.ISWC != null ? loadPcdByRq.ISWC : "0").append("','")
                .append(loadPcdByRq.SM != null && !loadPcdByRq.SM.equals("") ? loadPcdByRq.SM : Util.NOTE).append("','")
                .append("','")
                .append("','")
                .append(loadPcdByRq.PCRID != null ? loadPcdByRq.PCRID : "").append("','")
                .append(loadPcdByRq.PCRXM != null ? loadPcdByRq.PCRXM : "").append("'");
        String sql = stringBuilder.toString();
        jdbcTemplate.execute(sql);
    }

    /**
     * 	新增派车单下的任务
     *
     * @param loadTaskByPcd
     */
    @RequestMapping("/procInsertTask")
    public void procInsertTask(LoadTaskByPcd loadTaskByPcd) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exec procInsertTask '")
                .append(loadTaskByPcd.PCDH != null ? loadTaskByPcd.PCDH : "").append("','")
                .append(loadTaskByPcd.YCDW != null ? loadTaskByPcd.YCDW : "").append("','")
                .append(loadTaskByPcd.YCR != null ? loadTaskByPcd.YCR : "").append("','")
                .append(loadTaskByPcd.DH != null ? loadTaskByPcd.DH : "").append("','")
                .append(loadTaskByPcd.KSSJ != null ? loadTaskByPcd.KSSJ : "").append("','")
                .append(loadTaskByPcd.JSSJ != null ? loadTaskByPcd.JSSJ : "").append("','")
                .append(loadTaskByPcd.BDDD != null ? loadTaskByPcd.BDDD : "").append("','")
                .append(loadTaskByPcd.TASK != null ? loadTaskByPcd.TASK : "").append("','")
                .append(loadTaskByPcd.LB != null ? loadTaskByPcd.LB : "").append("'");
        String sql = stringBuilder.toString();
        jdbcTemplate.execute(sql);

        //短信通知
//        Util.sendSms(loadTaskByPcd.PCDH,loadTaskByPcd.BDDD != null ? loadTaskByPcd.BDDD : "",loadTaskByPcd.YCR != null ? loadTaskByPcd.YCR : ""
//        ,loadTaskByPcd.DH != null ? loadTaskByPcd.DH : "",jdbcTemplate);
    }

    /**
     * 	更新派车单
     *
     * @param loadPcdByRq
     */
    @PostMapping("/procUpdatePcd")
    public void procUpdatePcd(LoadPcdByRq loadPcdByRq) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exec procUpdatePcd '")
                .append(loadPcdByRq.PCDH != null ? loadPcdByRq.PCDH : "").append("','")
                .append(loadPcdByRq.PCDATE != null ? loadPcdByRq.PCDATE : "").append("','")
                .append(loadPcdByRq.CH != null ? loadPcdByRq.CH : "").append("','")
                .append(loadPcdByRq.CX != null ? loadPcdByRq.CX : "").append("','")
                .append(loadPcdByRq.CARSJID != null ? loadPcdByRq.CARSJID : "").append("','")
                .append(loadPcdByRq.CARSJXM != null ? loadPcdByRq.CARSJXM : "").append("','")
                .append(loadPcdByRq.BDSJ != null ? loadPcdByRq.BDSJ : "").append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append("','")
                .append(loadPcdByRq.ISWC != null ? loadPcdByRq.ISWC : "0").append("','")
                .append(loadPcdByRq.SM != null ? loadPcdByRq.SM : Util.NOTE).append("','")
                .append("','")
                .append("'");
        String sql = stringBuilder.toString();

        jdbcTemplate.execute(sql);
    }

    /**
     * 	更新派车单下的任务
     *
     * @param loadTaskByPcd
     */
    @RequestMapping("/procUpdateTask")
    public void procUpdateTask(LoadTaskByPcd loadTaskByPcd) {
        if (loadTaskByPcd.ID == null || loadTaskByPcd.ID.equals("")){
            LOG.info("ID为空，直接返回");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exec procUpdateTask '")
                .append(loadTaskByPcd.PCDH != null ? loadTaskByPcd.PCDH : "").append("','")
                .append(loadTaskByPcd.YCDW != null ? loadTaskByPcd.YCDW : "").append("','")
                .append(loadTaskByPcd.YCR != null ? loadTaskByPcd.YCR : "").append("','")
                .append(loadTaskByPcd.DH != null ? loadTaskByPcd.DH : "").append("','")
                .append(loadTaskByPcd.KSSJ != null ? loadTaskByPcd.KSSJ : "").append("','")
                .append(loadTaskByPcd.JSSJ != null ? loadTaskByPcd.JSSJ : "").append("','")
                .append(loadTaskByPcd.BDDD != null ? loadTaskByPcd.BDDD : "").append("','")
                .append(loadTaskByPcd.TASK != null ? loadTaskByPcd.TASK : "").append("','")
                .append(loadTaskByPcd.ID).append("','")
                .append(loadTaskByPcd.LB != null ? loadTaskByPcd.LB : "").append("'");
        String sql = stringBuilder.toString();
        LOG.info("更新派车单SQL{}",sql);
        jdbcTemplate.execute(sql);

        //短信通知
//        Util.sendSms(loadTaskByPcd.PCDH,loadTaskByPcd.BDDD != null ? loadTaskByPcd.BDDD : "",loadTaskByPcd.YCR != null ? loadTaskByPcd.YCR : ""
//        ,loadTaskByPcd.DH != null ? loadTaskByPcd.DH : "",jdbcTemplate);
    }

    /**
     * 	删除派车单下的任务
     *
     * @param
     */
    @RequestMapping("/procDeleteTask")
    public void procDeleteTask(@RequestParam("args_1") String ID) {
        String sql = "exec procDeleteTask '" + ID + "'";
        jdbcTemplate.execute(sql);
    }

    /**
     * 	删除派车单
     *
     * @param
     */
    @RequestMapping("/procDeletePch")
    public void procDeletePch(@RequestParam("args_1") String ID) {
        String sql = "exec procDeletePch '" + ID + "'";
        jdbcTemplate.execute(sql);
    }

}
