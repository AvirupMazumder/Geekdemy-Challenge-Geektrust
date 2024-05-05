package com.geektrust.backend.entities;

import com.geektrust.backend.utils.GeekdemyConstants;

public class DegreeProgram implements Program {

    private final ProgramCategory programCategory;
    private Double programFees;
    private final Double programDiscount;
    private Integer count;

    private Double programDiscountAmount;

    public DegreeProgram() {
        programCategory = ProgramCategory.DEGREE;
        programFees = GeekdemyConstants.DEGREE_FEES;
        programDiscount = GeekdemyConstants.DEGREE_DISCOUNT;
        count = 0;
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
