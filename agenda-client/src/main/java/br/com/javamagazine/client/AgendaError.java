package br.com.javamagazine.client;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="agendaError")
public class AgendaError {
    private String message;
    private String stackTrace;

    public AgendaError(){}

    public AgendaError(final Exception e) {
        message = e.getMessage();

        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        stackTrace = sw.getBuffer().toString();
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(final String message) {
        this.message = message;
    }
    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(final String stackTrace) {
        this.stackTrace = stackTrace;
    }

    @Override
    public String toString() {
        return "AgendaException [message=" + message + " ]";
    }
}
