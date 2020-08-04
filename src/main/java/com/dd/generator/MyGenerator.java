package com.wm.warehouse.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyGenerator {


    public static void main(String[] args) {
        // 代码生成目录
        String outputDir = "/Users/Destiny/Desktop/temp";

        // 创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(outputDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        // 文档注释 作者名
        gc.setAuthor("Destiny");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://58.83.189.251:60331/fire_web?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false");
        dsc.setUsername("wamingadmin");
        dsc.setPassword("CQwaming#197001");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setEntityLombokModel(true);
        strategy.setEntityBuilderModel(false);
        //strategy.setLogicDeleteFieldName("del_flag");
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setSuperControllerClass("com.wm.warehouse.admin.controller.BaseController");
        strategy.setInclude(new String[]{"drs_survey_task"}); // 需要生成的表
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        mpg.setStrategy(strategy);
        //表前缀
        strategy.setTablePrefix("");

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.wm.warehouse");
        pc.setModuleName("test");
        pc.setController("controller");
        pc.setService("service");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);
        mpg.execute();
    }
}
