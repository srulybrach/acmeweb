package com.acme.statusmgr;

import com.acme.decorators.*;
import com.acme.info.InfoInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class DecoratorFactory {
    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    @ResponseBody
    public Detail getDetails(String[] details, Detail detail, InfoInterface maker) throws Exception {
        for(String deet : details){
            switch(deet){
                case "availableProcessors":
                    detail = new ProcessorsAvailable(detail, maker);
                    break;
                case "freeJVMMemory":
                    detail = new JVMMemoryFree(detail, maker);
                    break;
                case "totalJVMMemory":
                    detail = new JVMMemoryTotal(detail, maker);
                    break;
                case "jreVersion":
                    detail = new VersionJRE(detail, maker);
                    break;
                case "tempLocation":
                    detail = new LocationTemp(detail, maker);
                    break;
                default:
                    throw new Exception("Invalid details option: " + deet);
            }
        }
        return detail;
    }
}
