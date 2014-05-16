package com.ifountain.client.opsgenie.model;

import com.ifountain.client.opsgenie.model.alert.AttachRequest;

import java.io.InputStream;

/**
 * Container for the parameters to make an {@link java.io.InputStream} based attach api call.
 *
 * @author Mustafa Sener
 * @version 20.06.2012 17:03
 * @see com.ifountain.client.opsgenie.IAlertOpsGenieClient#attach(InputStreamAttachRequest)
 */
public class InputStreamAttachRequest extends AttachRequest {
    private InputStream inputStream;
    private String fileName;

    public InputStreamAttachRequest() {
    }

    /**
     * The InputStream whose content will be attached to the specified alert.
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Sets the {@link java.io.InputStream} whose content will be attached to the specified alert.
     */
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }


    /**
     *  The file name of attachment
     */
    public String getFileName() {
        return fileName;
    }

    /**
     *  Sets the file name of attachment
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
