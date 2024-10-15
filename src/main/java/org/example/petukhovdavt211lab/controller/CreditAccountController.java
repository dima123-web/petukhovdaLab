package org.example.petukhovdavt211lab.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.CreditAccount;
import org.example.petukhovdavt211lab.service.CreditAccountService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/credit_account")
public class CreditAccountController {

    private final CreditAccountService creditAccountService;

    // создание кредитного счета
    @Operation(summary = "Создание кредитного счета")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "кредитный счет создан",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreditAccount.class))})
    })

    @PostMapping
    public CreditAccount createCreditAccount(@RequestParam("userId") Long userId, @RequestParam("bankId") Long bankId,
                                             @RequestParam("startDate") LocalDate startDate,
                                             @RequestParam("endDate") LocalDate endDate,
                                             @RequestParam("loanAmount") Integer loanAmount,
                                             @RequestParam("interestRate") Float interestRate,
                                             @RequestParam("issuingEmployeeId") Long issuingEmployeeId,
                                             @RequestParam("paymentAccountId") Long paymentAccountId) {
        return creditAccountService.createCreditAccount(userId, bankId, startDate, endDate,
                loanAmount, interestRate, issuingEmployeeId, paymentAccountId);
    }

    // поиск кредитного счета по ID
    @Operation(summary = "Поиск кредитного счета по ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "кредитный счет найден",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreditAccount.class))})
    })

    @GetMapping("/{id}")
    public CreditAccount getCreditAccountById(@Parameter(description = "ID кредитного счета")
                                                  @PathVariable("id") Long id) {
        return creditAccountService.getCreditAccountById(id);
    }

    // изменение данных кредитного счета
    @Operation(summary = "Изменение данных кредитного счета по ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные изменены",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreditAccount.class))})
    })

    @PatchMapping("/{id}")
    public CreditAccount updateCreditAccount(@PathVariable("id") Long id,
                                        @RequestParam("paymentAccountId") Long paymentAccountId) {
        return creditAccountService.updateCreditAccount(id, paymentAccountId);
    }

    // удаление кредитного счета
    @Operation(summary = "Удаление кредитного счета")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "кредитный счет удален",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreditAccount.class))})
    })

    @DeleteMapping("/{id}")
    public CreditAccount deleteCreditAccount(@Parameter(description = "ID кредитного счета")
                                                 @PathVariable("id") Long id) {
        creditAccountService.deleteCreditAccount(id);
        return null;
    }
}
