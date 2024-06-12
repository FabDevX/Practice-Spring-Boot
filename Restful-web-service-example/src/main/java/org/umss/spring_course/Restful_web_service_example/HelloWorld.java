package org.umss.spring_course.Restful_web_service_example;

public class HelloWorld {


    private  String message;
    public HelloWorld(String message)
    {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
