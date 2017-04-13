package com.validation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by lvjian on 2017/4/11.
 */
@RestController
public class BookController {

    @RequestMapping(value = "/book")
    public void addBook(@Valid Book book, BindingResult result, Errors errors) {
        try {
            if (errors.getErrorCount() > 0) {
                System.out.println("in errors");
                for (FieldError fieldError : result.getFieldErrors()) {
                    System.out.println(fieldError.getField() + " in  errors -->" + fieldError.getDefaultMessage());
                }
            }
            if (result.getErrorCount() > 0) {
                System.out.println("出错了");
                for (FieldError fieldError : result.getFieldErrors()) {
                    System.out.println(fieldError.getField() + "in bindingResult -->" + fieldError.getDefaultMessage());
                }
            }
//            Book book = new Book();
//            invokeMethod(book);
            System.out.println(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
