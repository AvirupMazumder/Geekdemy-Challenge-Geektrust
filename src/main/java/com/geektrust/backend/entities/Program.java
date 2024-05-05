package com.geektrust.backend.entities;

public interface Program {

    ProgramCategory getProgram();
    Double getProgramFee();
    void addProgram(Integer quantity);
    Integer getProgramCount();
    Double getProgramDiscount();
    void addProMembershipDiscountCoupon();
    Double getProgramDiscountAmount();
    
}
