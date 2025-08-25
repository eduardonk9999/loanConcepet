package tech.buildrun.loans.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.loans.controller.dto.CustomerLoanRequest;
import tech.buildrun.loans.controller.dto.CustomerLoanResponse;

@RestController
public class LoanController {

    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@ResponseBody CustomerLoanRequest loanRequest) {

    }
}
