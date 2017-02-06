package com.pagejaune.stage02.pjrace.network;

import com.pagejaune.stage02.pjrace.network.Protocol;
import com.pagejaune.stage02.pjrace.network.Url;

/**
 * Created by stage02 on 03/02/17.
 */

public class Request {

    private Url url;
    private Protocol protocol;

    public Request(Url url,Protocol protocol){
        this.url = url;
        this.protocol = protocol;
    }

    public Url getUrl(){
        return this.url;
    }

    public Protocol getProtocol(){
        return this.protocol;
    }

}
