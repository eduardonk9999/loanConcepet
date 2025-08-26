package tech.buildrun.loans.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.loans.controller.dto.CustomerLoanRequest;
import tech.buildrun.loans.controller.dto.CustomerLoanResponse;
import tech.buildrun.loans.service.LoanService;

@RestController
public class LoanController {

    private final LoanService loanService;

    // Injecao de dependencia via construtor
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }


    @PostMapping(value = "/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@ResponseBody CustomerLoanRequest loanRequest) {

        var loanResponse = loanService.checkLoansAvailability(loanRequest);

        return ResponseEntity.ok(loanResponse);

    }
}
