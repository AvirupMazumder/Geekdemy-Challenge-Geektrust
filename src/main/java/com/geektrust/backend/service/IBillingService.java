package com.geektrust.backend.service;

import com.geektrust.backend.dto.BillPrintDto;


public interface IBillingService {
    BillPrintDto calculateBill();
}
