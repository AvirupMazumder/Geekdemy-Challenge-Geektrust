package com.geektrust.backend.entities;

import com.geektrust.backend.utils.GeekdemyConstants;

public class CertificationProgram implements Program {

    private final ProgramCategory programCategory;
    private Double programFees;
    private Integer count;
    private final Double programDiscount;

    private Double programDiscountAmount;

    public CertificationProgram() {
        programCategory = ProgramCategory.CERTIFICATION;
        programFees = GeekdemyConstants.CERTIFICATION_FEES;
        count = 0;
        programDiscount = GeekdemyConstants.CERTIFICATION_DISCOUNT;
        programDiscountAmount = 0.0;
    }

    @Override
    public ProgramCategory getProgram() {
        // TODO Auto-generated method stub
        return programCategory;
    }

    @Override
    public Double getProgramFee() {
        // TODO Auto-generated method stub
        return programFees;
    }

    @Override
    public void addProgram(Integer quantity) {
        // TODO Auto-generated method stub
        count = count + quantity;
    }

    @Override
    public Integer getProgramCount() {
        // TODO Auto-generated method stub
        return count;
    }

    @Override
    public Double getProgramDiscount() {
        // TODO Auto-generated method stub
        return programDiscount;
    }

    @Override
    public void addProMembershipDiscountCoupon() {
        // TODO Auto-generated method stub
        programDiscountAmount = programFees * programDiscount;
        programFees = programFees * (1 - programDiscount);
    }

    @Override
    public Double getProgramDiscountAmount() {
        // TODO Auto-generated method stub
        return programDiscountAmount;
    }

    
}
