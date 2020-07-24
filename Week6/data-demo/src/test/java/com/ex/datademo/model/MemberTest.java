package com.ex.datademo.model;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class MemberTest {

    @Test
    public void memberWithNoValues(){
        Member m = new Member();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Member>> violations = validator.validate(m);
        assertEquals(violations.size(), 5);
    }

}