package com.abdm.data_transfer_workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IndexController {
    @RequestMapping(HrpRequestController.IndexController.PATH)
   @ResponseBody
    String getErrorPath();
}
