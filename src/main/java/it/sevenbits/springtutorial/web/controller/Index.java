package it.sevenbits.springtutorial.web.controller;

import java.util.Map;

import it.sevenbits.springtutorial.core.service.ContentService;
import it.sevenbits.springtutorial.exception.ServiceException;
import it.sevenbits.springtutorial.web.model.Content;
import it.sevenbits.springtutorial.web.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Index {
    @Autowired
    private ContentService service;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<BaseResponse> createContent(@ModelAttribute final Content content) {
        ResponseEntity<BaseResponse> response;
        try {
            if (content != null) {
                service.createContent(content.getContent());
                response = new ResponseEntity<BaseResponse>(new BaseResponse(true, null), HttpStatus.CREATED);
            } else {
                throw new ServiceException("Content must not be null");
            }
        } catch (ServiceException e) {
            response = new ResponseEntity<BaseResponse>(new BaseResponse(false, e.getMessage()), HttpStatus.BAD_REQUEST);
        }

        return response;
    }
}
