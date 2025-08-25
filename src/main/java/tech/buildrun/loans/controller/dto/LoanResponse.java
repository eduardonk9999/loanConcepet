package tech.buildrun.loans.controller.dto;

import tech.buildrun.loans.domain.LoanType;

public record LoanResponse(LoanType loanType, Double interestRate) {
}
