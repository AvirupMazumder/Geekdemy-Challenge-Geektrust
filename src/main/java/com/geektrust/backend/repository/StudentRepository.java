package com.geektrust.backend.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.geektrust.backend.entities.CertificationProgram;
import com.geektrust.backend.entities.DegreeProgram;
import com.geektrust.backend.entities.DiplomaProgram;
import com.geektrust.backend.entities.DiscountCoupons;
import com.geektrust.backend.entities.Program;
import com.geektrust.backend.entities.ProgramCategory;
import com.geektrust.backend.entities.Student;
import com.geektrust.backend.utils.GeekdemyConstants;


public class StudentRepository implements IStudentRepository{

    private Student student;
    private Program certificationProgram;
    private Program degreeProgram;
    private Program diplomaProgram;
    private List<DiscountCoupons> discountCoupons;


    public StudentRepository(Student student){
        this.student = student;
        certificationProgram = new CertificationProgram();
        degreeProgram = new DegreeProgram();
        diplomaProgram = new DiplomaProgram();
        discountCoupons = new ArrayList<>();
    }

    public StudentRepository(Student student, CertificationProgram certificationProgram, DegreeProgram degreeProgram, DiplomaProgram diplomaProgram){
        this(student);
        this.certificationProgram = certificationProgram;
        this.degreeProgram = degreeProgram;
        this.diplomaProgram = diplomaProgram;
        discountCoupons = new ArrayList<>();
    }



    // public List<DiscountCoupons> getDiscountCoupons() {
    //     return discountCoupons;
    // }

    
    public Student getStudent() {
        return student;
    }

    public Integer getTotalProgrammeCount() {
        return certificationProgram.getProgramCount() + degreeProgram.getProgramCount() + diplomaProgram.getProgramCount();
    }

    @Override
    public void addProgramsToCart(ProgramCategory programCategory, Integer quantity) {
        if(programCategory == ProgramCategory.CERTIFICATION) {
            certificationProgram.addProgram(quantity);
        }
        else if(programCategory == ProgramCategory.DEGREE) {
            degreeProgram.addProgram(quantity);
        }
        else {
            diplomaProgram.addProgram(quantity);
        }
    }

    // @Override
    // public void addDiscountCoupons(DiscountCoupons discountCoupons) {
    //     this.discountCoupons.add(discountCoupons);
        
    // }

    @Override
    public void addProMembershipPlan() {
        student.addProMembershipPlan();
        certificationProgram.addProMembershipDiscountCoupon();
        degreeProgram.addProMembershipDiscountCoupon();
        diplomaProgram.addProMembershipDiscountCoupon();
        
    }

    @Override
    public Integer getDegreeProgrammeCount() {
        // TODO Auto-generated method stub
        return degreeProgram.getProgramCount();
    }

    @Override
    public Integer getCertificationProgrammeCount() {
        // TODO Auto-generated method stub
        return certificationProgram.getProgramCount();
    }

    @Override
    public Integer getDiplomaProgrammeCount() {
        // TODO Auto-generated method stub
        return diplomaProgram.getProgramCount();
    }



    @Override
    public void addDiscountCoupons(DiscountCoupons discountCoupon) {
        // TODO Auto-generated method stub
        discountCoupons.add(discountCoupon);
        
    }



    @Override
    public Double getDegreeProgrammeCost() {
        // TODO Auto-generated method stub
        return degreeProgram.getProgramFee();
    }



    @Override
    public Double getCertificationProgrammeCost() {
        // TODO Auto-generated method stub
        return certificationProgram.getProgramFee();
    }



    @Override
    public Double getDiplomaProgrammeCost() {
        // TODO Auto-generated method stub
        return diplomaProgram.getProgramFee();
    }



    @Override
    public Double getDegreeProgrammeDiscount() {
        // TODO Auto-generated method stub
        return degreeProgram.getProgramDiscount();
    }



    @Override
    public Double getCertificationProgrammeDiscount() {
        // TODO Auto-generated method stub
        return certificationProgram.getProgramDiscount();
    }



    @Override
    public Double getDiplomaProgrammeDiscount() {
        // TODO Auto-generated method stub
        return diplomaProgram.getProgramDiscount();
    }



    @Override
    public Boolean containsDiscountCoupon(DiscountCoupons discountCoupon) {
        // TODO Auto-generated method stub
        return discountCoupons.contains(discountCoupon);
    }

    @Override
    public Double getCertificationProgrammeDiscountAmount() {
        // TODO Auto-generated method stub
        return certificationProgram.getProgramDiscountAmount();
    }

    @Override
    public Double getDegreeProgrammeDiscountAmount() {
        // TODO Auto-generated method stub
        return degreeProgram.getProgramDiscountAmount();
    }

    @Override
    public Double getDiplomaProgrammeDiscountAmount() {
        // TODO Auto-generated method stub
        return diplomaProgram.getProgramDiscountAmount();
    }



}
