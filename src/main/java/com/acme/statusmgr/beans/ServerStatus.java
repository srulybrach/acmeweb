package com.acme.statusmgr.beans;

import com.acme.decorators.Detail;
import com.acme.info.ActualInfoFacade;
import com.acme.info.InfoInterface;
import com.acme.servermgr.ServerManager;
import com.acme.statusmgr.DecoratorFactory;
import com.acme.statusmgr.FaliureException;

/**
 * A POJO that represents Server Status and can be returned as the result of a request.
 */
public class ServerStatus {

    private long id;
    private String contentHeader;
    private String statusDesc = "Unknown";
    static InfoInterface maker = new ActualInfoFacade();

    /**
     * Construct a ServerStatus using info passed in for identification, and obtaining current
     * server status from the appropriate Manager class.
     * This class must return a pretty, english-like representation of the server status.
     *
     * @param id            a numeric identifier/counter of which request this is
     * @param contentHeader info about the request
     */
    public ServerStatus(long id, String contentHeader) {
        this.id = id;
        this.contentHeader = contentHeader;

        // Obtain current status of server
        this.statusDesc = "Server is " + ServerManager.getCurrentServerStatus();
    }

    public ServerStatus() {

    }

    public static void setMaker(InfoInterface maker) {
        ServerStatus.maker = maker;
    }

    public ServerStatus(long id, String contentHeader, String[] details) throws FaliureException {
        this.id = id;
        this.contentHeader = contentHeader;

        Detail detail = new Detail();

        DecoratorFactory factory = new DecoratorFactory();
        detail = factory.getDetails(details, detail, maker);

        // Obtain current status of server
        this.statusDesc = "Server is " + ServerManager.getCurrentServerStatus() + detail.getDetails();
    }




    /**
     * get the id of this request
     *
     * @return a numeric id that increases during life of server for each request .
     */
    public long getId() {
        return id;
    }

    /**
     * Get the content header that was specified by the request
     *
     * @return some string
     */
    public String getContentHeader() {
        return contentHeader;
    }

    /**
     * Get an english-like description of the server's status
     *
     * @return A string describing status
     */
    public String getStatusDesc() {
        return statusDesc;
    }


}
