package com.biz.web.util;

import com.alibaba.druid.util.StringUtils;
import org.jxls.common.Context;
import org.jxls.expression.JexlExpressionEvaluator;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;

import java.io.*;
import java.util.Map;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：JxlsUtils
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/5/3 9:09
 */
public class JxlsUtils {

    public static void exportExcel(String mainPath,String templateName,String fileName, Map<String, Object> model) throws Exception {
        String outPutPath = mainPath ;
        File outFile = new File(outPutPath);
        if (!outFile.exists()) {
            outFile.mkdirs();
        }
        // 输出文件名为：输出路径+文件名+文件后缀
        String filePath = outPutPath + File.separator + getFileName(fileName);
        String templatePath = mainPath + File.separator + templateName;
        OutputStream os=null;
        os = new BufferedOutputStream(new FileOutputStream(filePath));
        File template = getTemplate(templatePath);
        if (template != null) {
            exportExcel(new FileInputStream(template), os, model);
        } else {
            throw new Exception("Excel 模板未找到。");
        }
    }

    public static void exportExcel(InputStream is, OutputStream os, Map<String, Object> model)  {
        try {
            Context context = PoiTransformer.createInitialContext();
            if (model != null) {
                for (String key : model.keySet()) {
                    context.putVar(key, model.get(key));
                }
            }
            JxlsHelper jxlsHelper = JxlsHelper.getInstance();
            Transformer transformer = jxlsHelper.createTransformer(is, os);
            //获得配置
            JexlExpressionEvaluator evaluator = (JexlExpressionEvaluator) transformer.getTransformationConfig().getExpressionEvaluator();
            //设置静默模式，不报警告
            evaluator.getJexlEngine().setSilent(true);
            //函数强制，自定义功能--下面注释掉的三行代码是自定义函数的，如果有需要可以扩展。
       /* Map<String, Object> funcs = new HashMap<String, Object>();
        funcs.put("utils", new JxlsUtils());    //添加自定义功能
        evaluator.getJexlEngine().setFunctions(funcs);*/
            //必须要这个，否者表格函数统计会错乱
            jxlsHelper.setUseFastFormulaProcessor(false).processTemplate(context, transformer);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(is !=null)
                    is.close();
                if(os !=null)
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }

    }

    public static void exportExcel(File xls, File out, Map<String, Object> model) throws FileNotFoundException, IOException {
        exportExcel(new FileInputStream(xls), new FileOutputStream(out), model);
    }



    //获取jxls模版文件
    public static File getTemplate(String path) {
        File template = new File(path);
        if (template.exists()) {
            return template;
        }
        return null;
    }
    //获取生成excel的文件名称，如果为filename为空，则默认以日期命名
    public static String getFileName(String fileName) {
        try {
            if(StringUtils.isEmpty(fileName)){
                return  DateUtils.formatCurrentDate() + ".xlsx";
            }
            return fileName + "_" + DateUtils.formatCurrentDate() + ".xlsx";
        } catch (Exception e) {
            return DateUtils.formatCurrentDate() + ".xlsx";
        }
    }




}
