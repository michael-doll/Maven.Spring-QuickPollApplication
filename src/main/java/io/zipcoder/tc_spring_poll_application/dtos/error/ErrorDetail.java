package io.zipcoder.tc_spring_poll_application.dtos.error;

import java.util.List;
import java.util.Map;

public class ErrorDetail {

    String title; /*a brief title of the error condition, eg: "Validation Failure" or "Internal Server Error"*/
    int status; /*the HTTP status code for the current request; redundant but useful for client-side error handling*/
    String detail; /*A short, human-readable description of the error that may be presented to a user*/
    long timeStamp; /*the time in milliseconds when the error occurred*/
    String developerMessage; /*detailed information such as exception class name or a stack trace useful for developers to debug*/
    Map<String, List<ValidationError>> errors; /*There may be multiple validation errors associated with a request, sometimes more than one of the same type, so this field will be a collection,*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public Map<String, List<ValidationError>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, List<ValidationError>> errors) {
        this.errors = errors;
    }
}
