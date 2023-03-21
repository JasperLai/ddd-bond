package com.bond.app.taskService;

import com.bond.domain.model.report.repository.BaseRepo;
import com.bond.domain.model.report.types.Report;
import com.bond.domain.model.report.repository.OpenAccRepo;
import com.bond.domain.model.report.repository.reportRepo;
import com.bond.domain.model.report.types.ReportNode;
import com.bond.domain.model.report.types.nodes.OpenAccNode;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//taskService类似transaction，app service的子服务，不同点是可以选择单独对外暴露
//该服务负责将文件生成，并入库
@Component
public class SHReportService {

    OpenAccRepo repo;

    reportRepo reportRepo;

    FileOutputStream fs;

    public boolean handleOpenAccData(Date date){
//        Report openAccReport = new Report(0,0);
//
////        openAccReport.setNodes(repo.getNodes(date));
//        generateReportFile(openAccReport,repo);
//        if(openAccReport.getReportType() == 0) {
//            //以文件方式报送
//            openAccReport.setFileName("XXXX"); //TODO 从配置文件加载
//            File f = generateReportFile(openAccReport, date,repo);
//            //报送文件信息入表
//            reportRepo.savePath(f.getAbsoluteFile(),date);
//        }else if (openAccReport.getReportType() == 1){
//            //以报文报送
//            Object msg = new Object(); //json/xml数据示例
//            reportRepo.saveMessage(msg,date);
//        }
//
//        //TODO 也可以考虑save openAccReport,便于核对错误。


        return true;
    }

    public File generateReportFile(Report report, BaseRepo repo){


        return null;
    };

    public boolean handleTotalData(Date date){
        return true;
    }

    private File generateReportFile(Report r, Date d){
        int start;
        int end;
//        File f = new File();
//        for() {
//            ArrayList<OpenAccNode> nodes = repo.getNodes(start, end);
//            FileOutputStream fs = write(f, nodes);
//        }
        return null;
    }

    private File constructFile(List<ReportNode> nodes){
        //将节点数据组装成文件
        return null;
    }
    private File fileCompressAndEncrypt(File f){
        return null;
    }

    //public
}
