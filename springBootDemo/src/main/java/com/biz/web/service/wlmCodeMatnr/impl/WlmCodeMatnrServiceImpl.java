package com.biz.web.service.wlmCodeMatnr.impl;

import com.biz.web.dao.wlmCodeMatnr.IWlmCodeMatnrDao;
import com.biz.web.entity.wlmCodeMatnr.WlmCodeMatnrEntity;
import com.biz.web.service.wlmCodeMatnr.IWlmCodeMatnrService;
import com.biz.web.util.JxlsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserServiceImpl
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 17:34
 */
@Service
@Transactional
public class WlmCodeMatnrServiceImpl implements IWlmCodeMatnrService {

    @Autowired
    IWlmCodeMatnrDao wlmCodeMatnrDao;


    @Override
    public List<WlmCodeMatnrEntity> queryWlm() {
        return wlmCodeMatnrDao.queryWlm();
    }

    @Override
    public List<WlmCodeMatnrEntity> queryMandtKunnr() {
        return wlmCodeMatnrDao.queryMandtKunnr();
    }

    @Override
    public List<WlmCodeMatnrEntity> queryVtweg() {
        return wlmCodeMatnrDao.queryVtweg();
    }

    @Override
    public List<WlmCodeMatnrEntity> queryMatnr() {
        return wlmCodeMatnrDao.queryMatnr();
    }

    @Override
    public List<WlmCodeMatnrEntity> queryKunnr() {
        return wlmCodeMatnrDao.queryKunnr();
    }


@Override
    public void exportWlmCodeMatnrData() {
        try {
            //String templateName = "wlmCodeMatnr.xlsx";
//            String mainPath="E:";
            String mainPath="/home/cxfx/test/inbound";
            String templateName = "wlmCodeMatnr.xlsx";
            Map<Integer, List> dataMap = new HashMap<Integer, List>();
            long startTime = System.currentTimeMillis();
            List<WlmCodeMatnrEntity> list = queryWlm();
            List<WlmCodeMatnrEntity> list2 = queryMandtKunnr();
            List<WlmCodeMatnrEntity> list3 = queryMatnr();
            List<WlmCodeMatnrEntity> list4 = queryVtweg();
            List<WlmCodeMatnrEntity> list5 = queryKunnr();
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("wlm", list);
            model.put("mandt", list2);
            model.put("matnr", list3);
            model.put("vtweg", list4);
            model.put("kunnr", list5);
            long endTime = System.currentTimeMillis();
            System.out.println("=====查询数据耗时："
                    + (endTime - startTime) / 1000 + "s");
            JxlsUtils.exportExcel(mainPath,templateName,null , model);
            System.out.println("生成excel耗时："+(System.currentTimeMillis()-endTime)/1000+" S");
            //复制文件
            //复制文件--备份
            String outPath="/home/cxfx/test/archive";
            String fileName= JxlsUtils.getFileName("");
            File in =new File(mainPath+ File.separator+fileName);
            File out =new File(outPath+File.separator+fileName);
            try {
                FileCopyUtils.copy(in,out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
