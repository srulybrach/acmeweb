package com.acme.statusmgr;

import com.acme.decorators.*;

public class DecoratorFactory {
    Detail getDetail(String[] details, Detail detail, ActualInfoFacade maker) {
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
                    //BREAK
            }
        }
        return detail;
    }
}
